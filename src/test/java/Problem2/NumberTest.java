package Problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    Number ob = new Number(2);
    @Test
    void TestCase() {

        assertAll(
                () -> assertEquals(false, ob.isZero()),
                () ->assertEquals(true, ob.isPositive()),
                () ->assertEquals(false,ob.isNegative()),
                () ->assertEquals(true,ob.isEven()),
                () ->assertEquals(false,ob.isOdd()),
                () -> assertEquals(true,ob.isAmstrong()),
                () -> assertEquals(true,ob.isPrime()),
                () -> assertEquals(2.0, ob.getFactorial()),
                () -> assertEquals(2.0, ob.getReverse()),
                () -> assertEquals(4.0,ob.getSqr())
        );

    }
}