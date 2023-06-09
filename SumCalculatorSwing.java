import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumCalculatorSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Sum Calculator");
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Number 1:");
        //JLabel label1 = new JLabel("Number 1:");
        JTextField textField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        JTextField textField2 = new JTextField();
        JLabel label3 = new JLabel("Sum:");
        JTextField textField3 = new JTextField();
        textField3.setEditable(false);

        JButton button = new JButton("Submit");
        button.addActionListener(new ActionListener() );

        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(textField2);
        frame.add(label3);
        frame.add(textField3);
        frame.add(new JLabel());
        frame.add(button);

        frame.setVisible(true);
    }
}
