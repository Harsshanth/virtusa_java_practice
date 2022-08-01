package Problem4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {
    @Test
    void Test1() {
        Fibonacci ob = new Fibonacci();
        List<Integer> list = Arrays.asList(0,1,1,2,3);
        assertEquals( list, ob.findSeries(5));
    }
    @Test
    void Test2() {
        Fibonacci ob = new Fibonacci();
        List<Integer> list = Arrays.asList(0,1,1,2,3,5,8);
        assertEquals( list, ob.findSeries(7));
    }
}
