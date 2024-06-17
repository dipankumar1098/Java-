import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TicTacToeGUI extends JFrame implements ActionListener {
    private JButton[][] boardButtons;
    private char currentPlayer;
    private JLabel statusLabel;

    public TicTacToeGUI() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new GridLayout(4, 3));

        boardButtons = new JButton[3][3];
        currentPlayer = 'X';
        statusLabel = new JLabel("Player " + currentPlayer + "'s turn");

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                boardButtons[row][col] = new JButton();
                boardButtons[row][col].setFont(new Font("Arial", Font.PLAIN, 48));
                boardButtons[row][col].addActionListener(this);
                add(boardButtons[row][col]);
            }
        }

        add(statusLabel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();

        if (buttonClicked.getText().equals("") && !isGameOver()) {
            buttonClicked.setText(String.valueOf(currentPlayer));

            if (currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }

            statusLabel.setText("Player " + currentPlayer + "'s turn");

            if (isGameOver()) {
                if (checkWin('X')) {
                    statusLabel.setText("Player X wins!");
                } else if (checkWin('O')) {
                    statusLabel.setText("Player O wins!");
                } else {
                    statusLabel.setText("It's a tie!");
                }
            }
        }
    }

    private boolean checkWin(char player) {
        for (int row = 0; row < 3; row++) {
            if (boardButtons[row][0].getText().charAt(0) == player &&
                boardButtons[row][1].getText().charAt(0) == player &&
                boardButtons[row][2].getText().charAt(0) == player) {
                return true; // Row win
            }
        }

        for (int col = 0; col < 3; col++) {
            if (boardButtons[0][col].getText().charAt(0) == player &&
                boardButtons[1][col].getText().charAt(0) == player &&
                boardButtons[2][col].getText().charAt(0) == player) {
                return true; // Column win
            }
        }

        if (boardButtons[0][0].getText().charAt(0) == player &&
            boardButtons[1][1].getText().charAt(0) == player &&
            boardButtons[2][2].getText().charAt(0) == player) {
            return true; // Diagonal (top-left to bottom-right) win
        }

        if (boardButtons[0][2].getText().charAt(0) == player &&
            boardButtons[1][1].getText().charAt(0) == player &&
            boardButtons[2][0].getText().charAt(0) == player) {
            return true; // Diagonal (top-right to bottom-left) win
        }

        return false;
    }

    private boolean isGameOver() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (boardButtons[row][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI();
            }
        });
    }
}