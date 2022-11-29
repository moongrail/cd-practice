package day0;

public class KataWeekend {
    public static void main(String[] args) {
        System.out.println(zeroFuel(50, 25, 2));
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        return distanceToPump <= (mpg * fuelLeft);
    }
}
