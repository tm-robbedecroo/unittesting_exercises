package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfInts3SmallestIntsTest {

    @Test
    void sumOf3SmallestInts() {
        ArrayOfInts aoi = new ArrayOfInts();
        int i = aoi.sumOf3SmallestInts(new int[]{1,2,3,4});
        assertEquals(6, i);
    }
}