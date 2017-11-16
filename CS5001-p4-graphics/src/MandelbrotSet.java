
public class MandelbrotSet {
    public int xResolution;
    public int yResolution;
    public double minReal;
    public double maxReal;
    public double minImaginary;
    public double maxImaginary;
    public int maxIterations;
    public double radiusSquared;
    public int[][] dataSet;

    public MandelbrotSet(int xResolution, int yResolution, double minReal, double maxReal, double minImaginary,
            double maxImaginary, int maxIterations, double radiusSquared, int[][] dataSet) {
        this.xResolution = xResolution;
        this.yResolution = yResolution;
        this.minReal = minReal;
        this.maxReal = maxReal;
        this.minImaginary = minImaginary;
        this.maxImaginary = maxImaginary;
        this.maxIterations = maxIterations;
        this.radiusSquared = radiusSquared;
        this.dataSet = dataSet;
    }
}
