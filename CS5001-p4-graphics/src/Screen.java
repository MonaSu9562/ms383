import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel {

    public Screen() {
        repaint();
    }

    public void paint(Graphics g) {
        // x
        for (int i = 0; i < 200; i += 10) {
            for (int j = 0; j < 250; j += 10) {
                g.setColor(new Color(255 - i, i, 255 - i));
                g.fillRect(i, j, 10, 10);
            }
        }
    }
}
