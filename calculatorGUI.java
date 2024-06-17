import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BasicCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] numberButtons;
    private JButton[] operationButtons;
    private JButton addButton, subButton, mulButton, divButton, eqButton, clrButton;
    private JPanel panel;

    private double num1, num2, result;
    private char operator;

    public BasicCalculator() {
        setTitle("Basic Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(30, 40, 340, 30);
        textField.setEditable(false);
        add(textField);

        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        operationButtons = new JButton[5];
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        eqButton = new JButton("=");
        clrButton = new JButton("C");

        operationButtons[0] = addButton;
        operationButtons[1] = subButton;
        operationButtons[2] = mulButton;
        operationButtons[3] = divButton;
        operationButtons[4] = eqButton;

        for (int i = 0; i < 5; i++) {
            operationButtons[i].addActionListener(this);
            operationButtons[i].setFont(new Font("Arial", Font.BOLD, 20));
        }

        clrButton.addActionListener(this);
        clrButton.setFont(new Font("Arial", Font.BOLD, 20));

        panel = new JPanel();
        panel.setBounds(30, 100, 340, 340);
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        for (int i = 1; i <= 9; i++) {
            panel.add(numberButtons[i]);
        }
        panel.add(addButton);
        panel.add(numberButtons[0]);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(eqButton);
        panel.add(clrButton);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == eqButton) {
            num2 = Double.parseDouble(textField.getText());

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0)
                        result = num1 / num2;
                    else
                        textField.setText("Error");
                    break;
            }

            textField.setText(String.valueOf(result));
        }
        if (e.getSource() == clrButton) {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new BasicCalculator();
    }
}