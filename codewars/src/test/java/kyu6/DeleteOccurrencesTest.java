package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteOccurrencesTest {
    @Test
    public void deleteNth() throws Exception {
        assertArrayEquals(
                new int[] { 20, 37, 21 },
                DeleteOccurrences.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                DeleteOccurrences.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                DeleteOccurrences.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                DeleteOccurrences.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                DeleteOccurrences.deleteNth( new int[] { }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                DeleteOccurrences.deleteNth( new int[] { 2, 0, 2}, 0 )
        );
    }
}