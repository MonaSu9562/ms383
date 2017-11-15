/**
 * This class contains all the configurations.
 * 
 * @author 170026060
 *
 */
public abstract class Configuration {
    /**
     * This is the width.
     */
    public static final int WIDTH = 800;

    /**
     * This is the height.
     */
    public static final int HEIGHT = 600;

    /**
     * This is the max iterations number.
     */
    public static final int ITERATION = 100;

    /**
     * This is the scale. Decide the size of the figure.
     */
    public static final float SCALE = 250;

    // Initial parameter values
    protected static final double INITIAL_MIN_REAL = -2.0;
    protected static final double INITIAL_MAX_REAL = 0.7;
    protected static final double INITIAL_MIN_IMAGINARY = -1.25;
    protected static final double INITIAL_MAX_IMAGINARY = 1.25;
    protected static final int INITIAL_MAX_ITERATIONS = 50;

    // Default parameter values
    protected static final double DEFAULT_RADIUS_SQUARED = 4.0;
}
