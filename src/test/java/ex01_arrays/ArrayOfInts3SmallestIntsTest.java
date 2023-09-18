package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfInts3SmallestIntsTest {

    @Test
    void sumOf3SmallestInts_happyflow() {
        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOf3SmallestInts(new int[]{1,2,3,4});
        assertEquals(6, i);
    }

    @Test
    void sumOf3SmallestInts_arrayNull() {
        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOf3SmallestInts(null);
        assertEquals(0, i);
    }

    @Test
    void sumOf3SmallestInts_arrayEmpty() {
        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOf3SmallestInts(new int[] {});
        assertEquals(0, i);
    }

    @Test
    void sumOf3SmallestInts_arraySmall() {
        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOf3SmallestInts(new int[] {1,2});
        assertEquals(3, i);
    }
}