package advance.hw4;

import java.util.ArrayList;

public class hw4_2 {

    public static String ex1(String str, char search) {
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            if (search == str.charAt(i)) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int ex2(String str, char search) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (search == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static ArrayList ex3(String str, String search) {
        ArrayList result = new ArrayList();
        str = str.toLowerCase();
        int  index = str.indexOf(search);

        while (index != -1) {
            result.add(index);
            index = str.indexOf(search, index + 1);
        }
        return result;
    }

    public static int ex4 (String [][] array) {
        int line = 0;
        String transfer ="";
        String textKit = "";
        for (int i = 0; i < array.length; i++) {
            String[] arr = array[i];
            for (int j = 0; j < arr.length; j++) {
                transfer = arr[j];
                textKit = textKit.concat(transfer);
            }
            line++;
            if (textKit.indexOf('е') > 0) {
                textKit = "";
            } else {
                return line;
            }
        }
        return line;
    }
}