package Task2;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

    public class Main extends JPanel {
        static Image img;

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            img = new ImageIcon(sc.nextLine()).getImage();
            //C:\Users\1311114\Desktop\javaa\Lab8\src\image0.jpg
            JFrame frame = new JFrame();
            frame.setSize(500,700);
            frame.setVisible(true);
            frame.add(new Main());
        }
        public void paintComponent(Graphics g){
            g.drawImage(img, 0, 0, 500,700,null);
        }
    }