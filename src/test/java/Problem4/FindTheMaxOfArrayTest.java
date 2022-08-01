package Problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheMaxOfArrayTest {
    @Test
    void Test1() {
        FindTheMaxOfArray ob = new FindTheMaxOfArray();
        int arr[] = {9,10,44,6};
        assertEquals(44,FindTheMaxOfArray.max(arr,arr.length));
    }
    @Test
    void Test2() {
        FindTheMaxOfArray ob = new FindTheMaxOfArray();
        int arr[] = {9,10,44,6,55,77};
        assertEquals(77,FindTheMaxOfArray.max(arr,arr.length));
    }

}