/**
 * 
 */

/**
 * @author 170026060
 *
 */
public class GraphicsMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // generate the Mandelbrot set for given input parameters.
        MandelbrotCalculator mandelCalc = new MandelbrotCalculator();

        int[][] madelbrotData = mandelCalc.calcMandelbrotSet(20, 25, Configuration.INITIAL_MIN_REAL,
                Configuration.INITIAL_MAX_REAL, Configuration.INITIAL_MIN_IMAGINARY,
                Configuration.INITIAL_MAX_IMAGINARY, Configuration.INITIAL_MAX_ITERATIONS,
                Configuration.DEFAULT_RADIUS_SQUARED);

        // print the generated set in the console.
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 20; j++) {
                if (madelbrotData[i][j] > 9) {
                    System.out.print(madelbrotData[i][j] + " ");
                } else {
                    System.out.print(madelbrotData[i][j] + "  ");
                }
            }
            System.out.println();
        }

        // Screen sc = new Screen();
        GUIComponents gui = new GUIComponents();

    }

}
