package ex03_more_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsFindDuplicateValuesTest {

    @Test
    void findDuplicateValues_happyflow() {
        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findDuplicateValues(new int[] {1, 1, 4, 1, 5, 4});

        assertArrayEquals(new int[] {1, 4}, result);
    }

    @Test
    void findDuplicateValues_paranoia() {
        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findDuplicateValues(new int[] {1, 1, 4, 1, 5, 1, 5, 4});

        assertArrayEquals(new int[] {1, 4, 5}, result);
    }

    @Test
    void findDuplicateValues_arrayNull() {
        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findDuplicateValues(null);

        assertArrayEquals(new int[] {}, result);
    }

    @Test
    void findDuplicateValues_arrayEmpty() {
        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findDuplicateValues(new int []{});

        assertArrayEquals(new int[] {}, result);
    }

    @Test
    void findDuplicateValues_noDuplicates() {
        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findDuplicateValues(new int []{1, 2, 3, 4, 5});

        assertArrayEquals(new int[] {}, result);
    }
}