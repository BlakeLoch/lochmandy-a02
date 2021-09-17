package solution;

public class CalcClass {

    /*
    CalcClass
        CONVERSION_FACTOR = 350

        method calcAreaOfCeiling(length, width)
            return length * width
        method calcNumberOfGallons(areaOfCeiling)
            return ceiling(areaOfCeiling/CONVERSION_FACTOR)
     */

    private static final double CONVERSION_FACTOR = 350.0;

    public int calcAreaOfCeiling(int length, int width) {
        return length * width;
    }

    public int calcNumberOfGallons(int areaOfCeiling) {
        return (int) Math.ceil(areaOfCeiling / CONVERSION_FACTOR);
    }
}
