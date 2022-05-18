package advance;

import advance.hw4.hw4_1;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hw4_1Test {
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

    @Test
    void ex1() {
        int expected = hw4_1.ex1(array);
        Assert.assertEquals(expected, 59);
    }

    @Test
    void ex2() {
        int expected = hw4_1.ex2(array);
        Assert.assertEquals(expected, 12);
    }

    @Test
    void ex3() {
        int expected = hw4_1.ex3(array);
        Assert.assertEquals(expected, 2);
    }

    @Test
    void ex4() {
        double expected = hw4_1.ex4(array);
        Assert.assertEquals(expected, 6.555555555555555);
    }

    @Test
    void ex5() {
        int expected = hw4_1.ex5(array2);
        Assert.assertEquals(expected, 24);
    }

    @Test
    void ex6() {
        int expected = hw4_1.ex6(array2);
        Assert.assertEquals(expected, 9);
    }

    @Test
    void ex7() {
        int expected = hw4_1.ex7(array2);
        Assert.assertEquals(expected, 15);
    }
}