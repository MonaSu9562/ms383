import javax.swing.JFrame;

public class GUIComponents extends JFrame {
    // private JPanel p;
    private Screen screen;

    public GUIComponents() {
        this.screen = new Screen();
        // this.p = new JPanel();
        // initialise this JFrame
        this.setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setup();
    }

    public void setup() {
        getContentPane().add(screen);
        // add JPanel into this JFrame
        // getContentPane().add(p);
    }
}
