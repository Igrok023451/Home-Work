package advance;

import advance.hw4.hw4_2;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hw4_2Test {
    String strEx_1 = "Перестановочный алгоритм быстрого действия";
    char searchEx_1 = 'о';
    String f = "ПРОБЛЕМЫ МИГРАЦИИ 97_26 В отчете за август 2021 (prod) общее количество Итого: абонентов с фильтрами 70866, в эталонных данных 70982.";
    char x = 'р';
    @Test
    void ex1() {
        String expected = hw4_2.ex1(strEx_1, searchEx_1);
        Assert.assertEquals(expected, "ооооо");
        String expected2 = hw4_2.ex1(f, x);
        Assert.assertEquals(expected2, "р");
    }

    String strEx_2 = "Перевыборы выбранного президента";
    char searchEx_2 = 'е';
    @Test
    void ex2() {
        int expected = hw4_2.ex2(strEx_2, searchEx_2);
        Assert.assertEquals(expected, 4);
    }

    String strEx_3 = "Посмотрите как Рите нравится ритм";
    String searchEx_3 = "рит";
    @Test
    void ex3() {
        ArrayList<Integer> expected = hw4_2.ex3(strEx_3, searchEx_3);
        List<Integer> actual = Arrays.asList(6, 15, 29);
        Assert.assertEquals(expected, actual);
    }

    String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
    @Test(enabled = false)
    void ex4() {
        int expected = hw4_2.ex4(array);
        Assert.assertEquals(expected, 3);
    }
}