package kyu7;

import java.util.ArrayList;

public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        if (stops == null) return 0;
        int result = 0;
        //Code here
        for (int i = 0; i < stops.size(); i++) {
            result = result + stops.get(i)[0] - stops.get(i)[1];
        }
        return result;
    }
}
