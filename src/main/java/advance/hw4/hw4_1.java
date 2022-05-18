package advance.hw4;

public class hw4_1 {

    public static int ex1(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int ex2(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int ex3(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double ex4(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public static int ex5(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int[] arr = array[i];
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
        }
        return sum;
    }

    public static int ex6(int[][] array2) {
        int max = array2[0][0];
        for (int i = 0; i < array2.length; i++) {
            int[] arr = array2[i];
            for (int j = 0; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
        }
        return max;
    }

    public static int ex7(int[][] array2) {
        int count = 0;
        for (int i = 0; i < array2.length; i++) {
            int[] arr = array2[i];
            for (int j = 0; j < arr.length; j++) {
                count++;
            }
        }
        return count;
    }
}