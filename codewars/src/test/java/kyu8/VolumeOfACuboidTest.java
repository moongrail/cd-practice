package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeOfACuboidTest {

    private static final double delta = 0.0001;

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, VolumeOfACuboid.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, VolumeOfACuboid.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}