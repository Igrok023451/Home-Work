package advance.hw5;

import org.apache.commons.lang3.StringUtils;

public class HW5 {
    String str;
    int i;

    public static Double sum (Double number1, Double number2) {
        if(number1 == null || number2 == null ) {
            System.out.println("Number is null!!!");
        } return number1 + number2;
    }


    public static double subtraction (double number1, double number2) {
        return number1 - number2;
    }

    public static int multiplication (int number1, int number2) {
        return number1 * number2;
    }

    public static double division (double number1, double number2) {
        if(number2 == 0) {
            System.out.println("Number2 is null!!!");
        } return number1 / number2;
    }

    public static String cutText (String str, int number) {
        str = StringUtils.abbreviate(str, number);
        return str;
    }

}
