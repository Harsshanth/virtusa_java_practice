package Problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {
    @Test
    void testTwoD1() {
        Main obj = new Main();
        assertEquals(obj.findArea(1,4,0), 4);
    }
    @Test
    void testTwoD2() {
        Main obj = new Main();
        assertEquals(obj.findArea(2,5,0), 10);
    }
    @Test
    void testThreeD1() {
        Main obj = new Main();
        assertEquals(obj.findArea(2,5,5), 50);
    }

    @Test
    void testThreeD2() {
        Main obj = new Main();
        assertEquals(obj.findArea(5,5,3), 75);
    }

}