package kyu6;

public class TortoiseRacing {
    public static int[] race(int v1, int v2, int g) {
        // your code
        if (v1 >= v2) return new int[]{-1, -1, -1};

        int resultInSeconds = g * 3600 / (v2 - v1);

        return new int[]{resultInSeconds / 3600, resultInSeconds % 3600 / 60, resultInSeconds % 60};
    }
}
