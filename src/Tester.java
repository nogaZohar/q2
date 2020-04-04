import javax.swing.*;
import java.awt.*;

public class Tester {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        MyPanel p = new MyPanel();
        frame.add(p);

        frame.setVisible(true);

//        JOptionPane pane = new JOptionPane();
//        JOptionPane.CLOSED_OPTION


    }

}
