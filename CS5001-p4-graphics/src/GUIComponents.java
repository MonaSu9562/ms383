import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIComponents extends JFrame {
    private JPanel p;

    public GUIComponents() {
        this.p = new JPanel();
        // initialise this JFrame
        this.setSize(600, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setup();
    }

    public void setup() {
        // add JPanel into this JFrame
        getContentPane().add(p);
    }
}
