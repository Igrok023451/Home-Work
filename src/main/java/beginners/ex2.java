package beginners;


import java.util.ArrayList;

public class ex2 {

    public static double ex_21(double x) {
        return Math.pow((x + 3), 2);
    }

    public static double ex_22(double x, double y, double a, double b, double c) {
        double expected = ((3 + 4 * x) / 5 - (10 * (y - 5) * (a + b + c)) / x + 9 * ((4 / x) + (9 + x) / y));
        return expected;
    }

    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        String sum ="";
        String sdf = "";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String[] arr = array[i];
            for (int j = 0; j < arr.length; j++) {
                sum = arr[j];
                sdf = sdf.concat(sum);
            }
            count++;
            if (sdf.indexOf('е') > 0) {
                sdf = "";
            } else {
                System.out.println(count);
            }
        }

    }
}