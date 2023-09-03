package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfPeopleInTheBus {
    public static int countPassengers(List<int[]> stops) {
        return stops.stream().mapToInt(stop -> stop[0] - stop[1]).sum();
    }


    @Test
    @DisplayName("Should correctly count the number of passengers in the bus")
    void countPassengersInTheBus() {
        List<int[]> stops = new ArrayList<>();
        stops.add(new int[]{10, 0});
        stops.add(new int[]{3, 5});
        stops.add(new int[]{2, 5});

        int expectedCount = 5;
        int actualCount = NumberOfPeopleInTheBus.countPassengers(stops);

        assertEquals(expectedCount, actualCount);
    }

}