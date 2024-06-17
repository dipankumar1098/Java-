import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class NumberGuessingGame extends JFrame implements ActionListener {
    private int targetNumber;
    private int attempts;
    private JTextField textField;
    private JLabel messageLabel;

    public NumberGuessingGame() {
        setTitle("Number Guessing Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new FlowLayout());

        targetNumber = (int) (Math.random() * 100) + 1;
        attempts = 0;

        messageLabel = new JLabel("Guess a number between 1 and 100:");
        add(messageLabel);

        textField = new JTextField(10);
        add(textField);

        JButton guessButton = new JButton("Guess");
        guessButton.addActionListener(this);
        add(guessButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int userGuess = Integer.parseInt(textField.getText());
            attempts++;

            if (userGuess < targetNumber) {
                messageLabel.setText("Higher! Number of attempts: " + attempts);
            } else if (userGuess > targetNumber) {
                messageLabel.setText("Lower! Number of attempts: " + attempts);
            } else {
                messageLabel.setText("Congratulations! You guessed the number " + targetNumber +
                        " in " + attempts + " attempts.");
                textField.setEditable(false);
            }

            textField.setText("");
        } catch (NumberFormatException ex) {
            messageLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberGuessingGame();
            }
        });
    }
}
