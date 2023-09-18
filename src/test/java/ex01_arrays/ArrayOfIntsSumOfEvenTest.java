package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsSumOfEvenTest {

    @Test
    void sumOfEven_happyflow() {

        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOfEven(new int[] {1, 2, 3, 4});

        assertEquals(6, i);

    }

    @Test
    void sumOfEven_arrayNull() {

        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOfEven(null);

        assertEquals(0, i);

    }

    @Test
    void sumOfEven_arrayEmpty() {

        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOfEven(new int [] {});

        assertEquals(0, i);

    }

    @Test
    void sumOfEven_noEvenNums() {

        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOfEven(new int [] {1, 3, 5});

        assertEquals(0, i);

    }


}