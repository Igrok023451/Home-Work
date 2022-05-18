package advance.hw5;

public class HW5_2 {
    public static void main(String[] args) {
        System.out.println("Задание №1 ");
        int x = 10;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            x--;
        }

        System.out.println("Задание №2 ");
        int y = 10;
        String str = "  ";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            System.out.print(str);
            y--;
            str += "  ";
        }
        System.out.println();

        System.out.println("Задание №3 ");
        int p = 10;
        int l = 0;
        int u = 9;
        String str2 = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = u; j >= l; j--) {
                System.out.print(j + " ");
            }
            for (int b = 1; b < p; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
            System.out.print(" " + str2);
            p--;
            str2 += "  ";
            u--;
        }

    }
}
