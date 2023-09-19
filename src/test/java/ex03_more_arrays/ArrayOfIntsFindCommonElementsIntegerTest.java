package ex03_more_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsFindCommonElementsIntegerTest {

        @Test
        void findCommonElements_happyflow() {

            ArrayOfInts aoi = new ArrayOfInts();
            Integer[] result = aoi.findCommonElementsInteger(new Integer[]{1,3,7}, new Integer[]{1, 7});

            assertArrayEquals(new Integer []{1, 7}, result);

        }

        @Test
        void findCommonElements_paranoia() {

            ArrayOfInts aoi = new ArrayOfInts();
            Integer[] result = aoi.findCommonElementsInteger(new Integer[]{null, null, 7}, new Integer[]{1, null, 7});

            assertArrayEquals(new Integer []{7}, result);

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