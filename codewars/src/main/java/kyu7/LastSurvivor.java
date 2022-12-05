package kyu7;

public class LastSurvivor {
    public static String lastSurvivor(String letters, int[] coords) {
        StringBuilder result = new StringBuilder(letters);
        for (int i :coords) {
           result.deleteCharAt(i);
        }
        return result.toString();
    }
}
