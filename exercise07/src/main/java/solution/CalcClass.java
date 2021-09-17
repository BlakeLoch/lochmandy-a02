package solution;

public class CalcClass {

    private static double conversionFactor = 0.09290304;

    public int calcAreaInFeet(int lengthInFeet, int widthInFeet) {
        return lengthInFeet * widthInFeet;
    }

    public double calcAreaInMeters(int areaInFeet) {
        return areaInFeet * conversionFactor;
    }

}
