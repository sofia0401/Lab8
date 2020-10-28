package Task1;
import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(1400,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(3,3));
        Rectangle rect;
        Oval ov;
        Arc a;

        for (int i=0;i<20;i++) {
            switch ((int)(Math.random()*3)) {
                case 0: {
                    ov=new Oval();
                    frame.add(ov);
                    frame.setVisible(true);
                    break;
                }
                case 1: {
                    rect=new Rectangle();
                    frame.add(rect);
                    frame.setVisible(true);
                    break;
                }
                case 2: {
                    a=new Arc();
                    frame.add(a);
                    frame.setVisible(true);
                    break;
                }
            }
        }
    }
}
