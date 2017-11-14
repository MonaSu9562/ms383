import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel {

    public Screen() {

        repaint();
    }

    public void paint(Graphics g) {

        for (int i = 0; i < 250; i++) {
            g.setColor(new Color(255 - i, i, 255 - i));
            g.fillRect(i, i, 20, 25);
        }
    }
}
