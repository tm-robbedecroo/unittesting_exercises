package ex03_more_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsFindCommonElementsTest {

    @Test
    void findCommonElements_happyflow() {

        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findCommonElements(new int[]{1,3,7}, new int[]{1, 7});

        assertArrayEquals(new int []{1, 7}, result);

    }

    @Test
    void findCommonElements_noCommonNums() {

        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findCommonElements(new int[]{1,3,7}, new int[]{2, 4});

        assertArrayEquals(new int []{}, result);

    }

    @Test
    void findCommonElements_onlyCommonNums() {

        ArrayOfInts aoi = new ArrayOfInts();
        int[] result = aoi.findCommonElements(new int[]{1,3,7}, new int[]{1, 3, 7});

        assertArrayEquals(new int []{1,3,7}, result);

    }
}