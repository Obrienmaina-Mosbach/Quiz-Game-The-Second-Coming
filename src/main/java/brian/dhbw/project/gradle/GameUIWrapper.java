package brian.dhbw.project.gradle;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ComponentAdapter; // NEW: For ComponentListener
import java.awt.event.ComponentEvent;   // NEW: For ComponentListener
import javax.sound.sampled.*;
import java.net.URL;


public class GameUIWrapper extends JFrame {

    private JTextArea outputArea;
    private JTextField inputField;
    private JButton submitButton;
    private JButton skipButton;
    private JButton previousButton;
    private JButton restartButton;

    // --- NEW: Celebration Effect Components ---
    private JLabel confettiLabel;
    private Clip celebrationSound;

    private PipedInputStream pipedInputStream;


    private GameController gameController;


    private final Object inputLock = new Object();
    private String lastInput = null;

    // --- Flag to indicate if initial setup is complete ---
    private volatile boolean initialSetupComplete = false;



    public GameUIWrapper() {
        super("Quiz Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLocationRelativeTo(null);

        // --- Output Area (JTextArea) ---
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        add(scrollPane, BorderLayout.CENTER);

        // --- Input Panel (JTextField + Submit Button) ---
        JPanel inputPanel = new JPanel(new BorderLayout());
        inputField = new JTextField();
        inputField.setFont(new Font("Monospaced", Font.PLAIN, 14));
        inputField.addActionListener(new InputFieldActionListener());
        inputPanel.add(inputField, BorderLayout.CENTER);

        submitButton = new JButton("Submit Answer");
        submitButton.addActionListener(new InputFieldActionListener());
        inputPanel.add(submitButton, BorderLayout.EAST);

        // --- Navigation Buttons Panel (Previous, Skip, Restart) ---
        JPanel navButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        previousButton = new JButton("Previous Question");
        skipButton = new JButton("Skip Question");
        restartButton = new JButton("Restart Game");

        previousButton.addActionListener(e -> handlePreviousAction());
        skipButton.addActionListener(e -> handleSkipAction());
        restartButton.addActionListener(e -> handleRestartAction());

        navButtonPanel.add(previousButton);
        navButtonPanel.add(skipButton);
        navButtonPanel.add(restartButton);

        // --- Bottom Panel (Input + Nav Buttons) ---
        JPanel bottomContainer = new JPanel(new BorderLayout());
        bottomContainer.add(inputPanel, BorderLayout.NORTH);
        bottomContainer.add(navButtonPanel, BorderLayout.CENTER);

        add(bottomContainer, BorderLayout.SOUTH);

        redirectSystemStreams();
        setButtonsEnabled(false);


        initializeCelebrationComponents();


        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {

                if (confettiLabel != null) {
                    confettiLabel.setBounds(0, 0, getWidth(), getHeight());

                }
            }
            @Override
            public void componentShown(ComponentEvent e) {

                if (confettiLabel != null) {
                    confettiLabel.setBounds(0, 0, getWidth(), getHeight());
                }
            }
        });



        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing MongoDB connection...");
                DatabaseConfig.closeConnection();
                if (celebrationSound != null && celebrationSound.isOpen()) {
                    celebrationSound.close();
                }
                System.out.println("MongoDB connection closed.");
            }
        });
    }


    private void initializeCelebrationComponents() {

        confettiLabel = new JLabel();
        confettiLabel.setVisible(false);
        ((JPanel)getGlassPane()).setLayout(null);
        ((JPanel)getGlassPane()).add(confettiLabel);
        getGlassPane().setVisible(true);

        try {
            URL gifUrl = getClass().getResource("/celebration-14097.gif");
            if (gifUrl != null) {
                ImageIcon originalIcon = new ImageIcon(gifUrl);

                Image scaledImage = originalIcon.getImage().getScaledInstance(
                        getWidth(), getHeight(), Image.SCALE_DEFAULT);
                confettiLabel.setIcon(new ImageIcon(scaledImage));


            } else {
                System.err.println("Confetti GIF not found: /celebration-14097.gif");
            }
        } catch (Exception e) {
            System.err.println("Error loading confetti GIF: " + e.getMessage());
            e.printStackTrace();
        }


        try {
            URL soundUrl = getClass().getResource("/level-up-04-243762.wav");
            if (soundUrl != null) {
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundUrl);
                celebrationSound = AudioSystem.getClip();
                celebrationSound.open(audioIn);
            } else {
                System.err.println("Celebration sound not found: /level-up-04-243762.wav");
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.err.println("Error loading celebration sound: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private class InputFieldActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText().trim();
            inputField.setText("");

            if (input.isEmpty() && initialSetupComplete) {
                appendOutput("Please enter an answer.\n");
                return;
            }

            if (!initialSetupComplete) {
                synchronized (inputLock) {
                    lastInput = input;
                    inputLock.notifyAll();
                }
            } else {
                setButtonsEnabled(false);
                gameController.processAnswerAndLoadNextQuestion(input);
            }
        }
    }

    public void setGameController(GameController controller) {
        this.gameController = controller;
    }

    private void handleSkipAction() {
        setButtonsEnabled(false);
        gameController.skipQuestion();
    }

    private void handlePreviousAction() {
        setButtonsEnabled(false);
        gameController.loadPreviousQuestion();
    }

    private void handleRestartAction() {
        appendOutput("\n--- Restarting Game ---\n");
        outputArea.setText("");
        inputField.setText("");
        initialSetupComplete = false;
        setButtonsEnabled(false);

        if (gameController != null) {
            gameController.resetGame();
        }
        startInitialSetupFlow();
    }

    public void appendOutput(String text) {
        SwingUtilities.invokeLater(() -> {
            outputArea.append(text);
            outputArea.setCaretPosition(outputArea.getDocument().getLength());
        });
    }

    public void displayQuestion(String questionText, List<String> options) {
        SwingUtilities.invokeLater(() -> {
            outputArea.setText("");
            outputArea.append("\nQuestion: " + questionText + "\n\n");
            if (options != null && !options.isEmpty()) {
                for (int i = 0; i < options.size(); i++) {
                    outputArea.append((i + 1) + ". " + options.get(i) + "\n\n");
                }
            } else {
                outputArea.append("No options available.\n");
            }
            outputArea.append("Enter your answer (number), 'skip', or 'previous': \n");
            setButtonsEnabled(true);
            inputField.requestFocusInWindow();
        });
    }

    public void setButtonsEnabled(boolean enabled) {
        SwingUtilities.invokeLater(() -> {
            inputField.setEnabled(enabled);
            submitButton.setEnabled(enabled);
            skipButton.setEnabled(enabled);
            previousButton.setEnabled(enabled);
            restartButton.setEnabled(true);
        });
    }


    public void endQuiz() {
        setButtonsEnabled(false);
        SwingUtilities.invokeLater(() -> restartButton.setEnabled(true));
        appendOutput("\n--- Quiz Ended ---\n");
        showCelebration();
    }


    private void showCelebration() {
        SwingUtilities.invokeLater(() -> {
            if (confettiLabel != null && confettiLabel.getIcon() != null) {
                confettiLabel.setVisible(true); // Show confetti GIF
            }
            if (celebrationSound != null) {
                celebrationSound.setFramePosition(0); // Rewind to start
                celebrationSound.start(); // Play sound
            }


            Timer celebrationTimer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (confettiLabel != null) {
                        confettiLabel.setVisible(false);
                    }
                    if (celebrationSound != null && celebrationSound.isRunning()) {
                        celebrationSound.stop();
                    }
                    ((Timer)e.getSource()).stop();
                }
            });
            celebrationTimer.setRepeats(false);
            celebrationTimer.start();
        });
    }


    private void redirectSystemStreams() {
        try {
            pipedInputStream = new PipedInputStream();
            PipedOutputStream outputToTextArea = new PipedOutputStream(pipedInputStream);
            System.setOut(new PrintStream(outputToTextArea, true));

            new javax.swing.SwingWorker<Void, String>() {
                @Override
                protected Void doInBackground() throws Exception {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(pipedInputStream));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        publish(line);
                    }
                    return null;
                }
                @Override
                protected void process(List<String> chunks) {
                    for (String line : chunks) {
                        outputArea.append(line + "\n");
                    }
                    outputArea.setCaretPosition(outputArea.getDocument().getLength());
                }
            }.execute();

            // --- I/O Redirection Streams ---
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            System.setIn(new PipedInputStream(pipedOutputStream));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error redirecting I/O: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String getInputFromUser() throws InterruptedException {
        synchronized (inputLock) {
            lastInput = null;
            SwingUtilities.invokeLater(() -> {
                inputField.setText("");
                inputField.requestFocusInWindow();
                submitButton.setEnabled(true);
                inputField.setEnabled(true);
                skipButton.setEnabled(false);
                previousButton.setEnabled(false);
                restartButton.setEnabled(true);
            });

            inputLock.wait();
            return lastInput;
        }
    }

    public String getInputFromUser(String prompt) throws InterruptedException {
        appendOutput(prompt);
        return getInputFromUser();
    }

    private void startInitialSetupFlow() {
        new Thread(() -> {
            try {
                appendOutput("Welcome to the Quiz Game!\n\n");

                String playerName = getInputFromUser("Enter your name: \n");

                appendOutput("Choose a quiz topic:\n\n");
                appendOutput("1. Animal\n2. Planets\n3. Artificial Intelligence\n4. General Knowledge\n5. History\n6. Science\n7. Technology\n8. Mathematics\n9. Programming\n10. Algorithms\n11. Data Science\n12. Geography\n");
                int topicChoice = 0;
                while (topicChoice < 1 || topicChoice > 12) {
                    try {
                        topicChoice = Integer.parseInt(getInputFromUser("Enter the number of your choice (1-12): \n"));
                        if (topicChoice < 1 || topicChoice > 12) { // Corrected logic here
                            appendOutput("Invalid choice. Please enter a number between 1 and 12.\n");
                        }
                    } catch (NumberFormatException e) {
                        appendOutput("Invalid input. Please enter a number.\n");
                    }
                }

                String topic = switch (topicChoice) {
                    case 1 -> "Animal"; case 2 -> "Planets"; case 3 -> "Artificial Intelligence";
                    case 4 -> "General Knowledge"; case 5 -> "History"; case 6 -> "Science";
                    case 7 -> "Technology"; case 8 -> "Mathematics"; case 9 -> "Programming";
                    case 10 -> "Algorithms"; case 11 -> "Data Science"; case 12 -> "Geography";
                    default -> "Animal";
                };

                appendOutput("Choose a difficulty level:\n\n");
                appendOutput("1. Easy\n2. Medium\n3. Hard\n");
                int difficultyChoice = 0;
                while (difficultyChoice < 1 || difficultyChoice > 3) {
                    try {
                        difficultyChoice = Integer.parseInt(getInputFromUser("Enter the number of your choice (1-3): \n"));
                        if (difficultyChoice < 1 || difficultyChoice > 3) {
                            appendOutput("Invalid choice. Please enter a number between 1 and 3.\n");
                        }
                    } catch (NumberFormatException e) {
                        appendOutput("Invalid input. Please enter a number.\n");
                    }
                }
                String difficulty = switch (difficultyChoice) {
                    case 1 -> "Easy"; case 2 -> "Medium"; case 3 -> "Hard";
                    default -> "Easy";
                };

                initialSetupComplete = true;

                gameController.setGameParameters(playerName, topic, difficulty);
                gameController.startQuiz();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                appendOutput("\n--- Initial setup interrupted ---\n" + e.getMessage() + "\n");
            } catch (Exception e) {
                e.printStackTrace();
                appendOutput("\n--- INITIAL SETUP CRASHED ---\nAn error occurred during initial setup: " + e.getMessage() + "\n");
            } finally {

            }
        }).start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameUIWrapper ui = new GameUIWrapper();
            ui.setVisible(true);

            GameController gameController = new GameController(ui);
            ui.setGameController(gameController);

            ui.startInitialSetupFlow();
        });
    }
}
