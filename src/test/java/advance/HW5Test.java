package advance;

import advance.hw5.HW5;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HW5Test extends Assert {

    @DataProvider
    public Object[][] getNumbersSum () {
        return new Object[][] {
                { 12.0, 11.0, 23.0, "Well done test 1"},
                { -5.0, 8.0, 3.0, "Well done test 2"},
                {1.0, 3.0, 5.0, "You have a problem test 3"},
                {5.0, null, 10.0, "It's NULL test 4"},
        };
    }
    @Test(dataProvider = "getNumbersSum")
    public void testSum(Double a, Double b, Double expected, String message) {
        Double actual = HW5.sum(a, b);
        assertEquals(actual, expected, "you have a problem");
        System.out.println(message);
    }

    @DataProvider
    public Object[][] getNumbersSubtraction () {
        return new Object[][] {
                { 12, 11, 1.0, "Well done test 1"},
                { -5, 8, -13.0, "Well done test 2"},
                {1, 3, -2, "Well done test 3"},
                {5, 234, -229.0, "Well done test 4"},
        };
    }
    @Test(dataProvider = "getNumbersSubtraction")
    public void testSubtraction(int a, int b, double expected, String message) {
        double actual = HW5.subtraction(a, b);
        assertEquals(actual, expected, "you have a problem");
        System.out.println(message);
    }

    @DataProvider
    public Object[][] getNumbersMultiplication () {
        return new Object[][] {
                { 12, 11, 132, "Well done test 1"},
                { -5, 8, -40, "Well done test 2"},
                {1, 0, 0, "Well done test 3"},
                {2, 234, 468, "Well done test 4"},
        };
    }
    @Test(dataProvider = "getNumbersMultiplication")
    public void testMultiplication(int a, int b, int expected, String message) {
        int actual = HW5.multiplication(a, b);
        assertEquals(actual, expected, "you have a problem");
        System.out.println(message);
    }

    @DataProvider
    public Object[][] getNumbersDivision () {
        return new Object[][] {
                { 12, 11, 1.0909090909090908, "Well done test 1"},
                { -5, 8, -0.625, "Well done test 2"},
                {1, 0, 0, "Well done test 3"},
                {2, 234, 0.008547008547008548, "Well done test 4"},
        };
    }
    @Test(dataProvider = "getNumbersDivision")
    public void testDivision(double a, double b, double expected, String message) {
        double actual = HW5.division(a, b);
        assertEquals(actual, expected, "you have a problem");
        System.out.println(message);
    }

    String str = "Наверняка все знакомы с таким понятием как test-driven development(TDD). Наряду с ним также существует такое понятие, как data-driven testing(DDT, не в обиду Шевчуку)";
    int numbersSymbol = 23;

    @Test
    public void testCutText() {
        String exception = HW5.cutText(str, numbersSymbol);
        String actual = "Наверняка все знаком...";
        assertEquals(actual, exception);
    }
}