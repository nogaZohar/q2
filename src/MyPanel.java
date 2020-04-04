import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.red);
        g.drawRect(50, 50, 100, 170);

        Color c = new Color(100, 50, 180);
        g.setColor(c);
        g.fillRect(100, 70, 160, 150);

        g.setColor(Color.BLACK);
        int w = getWidth();
        int h = getHeight();

        g.fillRect(w / 2 - 25, h / 2 - 25, 50, 50);

        g.setColor(Color.green);
        g.fillOval(150, 100, 100, 200);

        g.drawString("Hello", 100, 30);

    }
}
