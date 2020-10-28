package Task3;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainAnimation extends JFrame {

    public MainAnimation() throws InterruptedException {

        setSize(1400, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
        Image img;
        Graphics g;
        ArrayList<Image> images = new ArrayList<>();
        for (int i=0;i<2;i++)
            images.add(new ImageIcon("C:\\Users\\1311114\\Desktop\\javaa\\Lab8\\src\\image"+i+".jpg").getImage());

        while (true) {
            for (int i = 0; i < 2; i++) {
                img = images.get(i);
                g = getGraphics();

                g.drawImage(img, 0, 0, 500, 700, null);
                Thread.sleep(100);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new MainAnimation();
    }
}


