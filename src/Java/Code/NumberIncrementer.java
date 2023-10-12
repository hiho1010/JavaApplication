package Java.Code;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberIncrementer {
    private int count = 10;
    private JLabel countLabel;

    public NumberIncrementer() {
        JFrame frame = new JFrame("Number Incrementer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        countLabel = new JLabel("Count: " + count);
        panel.add(countLabel);

        JButton incrementButton = new JButton("증가");
        panel.add(incrementButton);

        JButton decrementButton = new JButton("감소");
        panel.add(decrementButton);

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                countLabel.setText("Count: " + count);
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                countLabel.setText("Count: " + count);
            }
        });

        frame.setVisible(true);
    }

//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new NumberIncrementer();
//            }
//        });
//    }
}
