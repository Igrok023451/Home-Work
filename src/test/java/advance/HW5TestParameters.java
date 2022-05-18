package advance;

import advance.hw5.HW5;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HW5TestParameters {
    @Parameters ({"first", "second", "expected", "message"})
    @Test
    public void testSum(double a, double b, int expected, String message) {
        Double actual = HW5.sum(a, b);
        assertEquals(actual, expected, "you have a problem");
        System.out.println(message);

    }


//    @Test
//    public void testSubtraction(double a, double b, int expected, String message) {
//        double actual = HW5.subtraction(a, b);
//        assertEquals(actual, expected, "you have a problem");
//        System.out.println(message);
//    }
//
//    @Test
//    public void testMultiplication() {
//        int actual = HW5.multiplication(a, b);
//        assertEquals(actual, expected, "you have a problem");
//        System.out.println(message);
//    }
//
//    @Test
//    public void testDivision() {
//        double actual = HW5.division(a, b);
//        assertEquals(actual, expected, "you have a problem");
//        System.out.println(message);
//    }
}