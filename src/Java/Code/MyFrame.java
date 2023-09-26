package Java.Code;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    JPanel p = new JPanel();
    JLabel[] labels = new JLabel[30];
    public MyFrame() {
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//
//        setSize(300, 200);
//        setLocation(screenSize.width / 2, screenSize.height / 2);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setTitle("MyFrame");
//
//        Image img = kit.getImage("../images/java.png");
//
//        setLayout(new FlowLayout());
//        JButton button = new JButton("버튼");
//        this.add(button);
//
//        setVisible(true);
        /* 주석처리
        p.setLayout(null);
        p.setBackground(Color.YELLOW);
        for (int i =0; i<30; i++) {
            labels[i] =new JLabel("" + i);
            int x = (int) (500 * Math.random());
            int y = (int) (200 * Math.random());
            labels[i].setForeground(Color.MAGENTA);
            labels[i].setLocation(x, y);
            labels[i].setSize(20, 20);
            p.add(labels[i]);
        }
        setSize(500, 300);
        add(p);
        setVisible(true);
        */
    }
}
