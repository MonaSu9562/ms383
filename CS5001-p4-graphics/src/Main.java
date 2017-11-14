import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author ms383
 *
 */
public class Main extends JComponent {
    private BufferedImage buffer;

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Main();
    }

    public Main() {
        buffer = new BufferedImage(Configuration.WIDTH, Configuration.HEIGHT, BufferedImage.TYPE_INT_RGB);

        renderMandelbrotSet();

        // repaint();

        // a new frame
        JFrame frame = new JFrame("Mandelbrot Set");
        // set the options of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.getContentPane().add(this);
        frame.pack();
        frame.setVisible(true);

    }

    public void addNotify() {
        setPreferredSize(new Dimension(Configuration.WIDTH, Configuration.HEIGHT));
    }

    public void paint(Graphics g) {
        g.drawImage(buffer, 0, 0, null);
    }

    // set color and mandelbrot set
    public void renderMandelbrotSet() {
        for (int x = 0; x < Configuration.WIDTH; x++) {
            for (int y = 0; y < Configuration.HEIGHT; y++) {
                int color = calculatePointColor((x - Configuration.WIDTH / 2f) / Configuration.SCALE,
                        (y - Configuration.HEIGHT / 2f) / Configuration.SCALE);

                buffer.setRGB(x, y, color);
            }
        }
    }

    public int calculatePointColor(float x, float y) {
        float cx = x;
        float cy = y;

        int i = 0;

        for (; i < Configuration.ITERATION; i++) {
            float nx = x * x - y * y + cx;
            float ny = 2 * x * y + cy;

            x = nx;
            y = ny;

            if (x * x + y * y > 4) {
                break;
            }
        }

        if (i == Configuration.ITERATION) {
            return 0x00000000;
        }
        // black and white
        // return 0xFFFFFFFF;
        // with color (hue, saturation, brightness) float
        // return Color.HSBtoRGB((float) i / Configuration.ITERATION, 1, 1);
        return Color.HSBtoRGB(0.5f, (float) i / Configuration.ITERATION, 1);

        // return Color.HSBtoRGB(0.5f, 1, (float) i / Configuration.ITERATION);

    }

}
