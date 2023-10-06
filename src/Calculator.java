import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {

        setTitle("Calculator");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 50));
        textArea.setRows(1);
        add(textArea, BorderLayout.NORTH);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Create the number buttons
        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("/")); // first row
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(new JButton("*"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("-"));
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("C"));
        buttonPanel.add(new JButton("="));
        buttonPanel.add(new JButton("+"));

        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}