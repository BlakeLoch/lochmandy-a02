package solution;

public class CalcClass {

    /*
    CalcClass
       double 'conversionFactor' = 0.09290304
        method CalcAreaInFeet(int 'lengthInFeet', int 'widthInFeet')
            return 'lengthInFeet' * 'widthInFeet'
        method CalcAreaInMeters(int 'areaInFeet')
            return 'areaFeet' * 'conversionFactor'
     */

    private static final double conversionFactor = 0.09290304;

    public int calcAreaInFeet(int lengthInFeet, int widthInFeet) {
        return lengthInFeet * widthInFeet;
    }

    public double calcAreaInMeters(int areaInFeet) {
        return areaInFeet * conversionFactor;
    }

}
