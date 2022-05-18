package beginners;

public class BeinnerEx5 {

    public static String ex2(int num) {
        String nameDay = new String();
        switch (num) {
            case 1 :
                nameDay = "Понедельник";
                break;
            case 2 :
                nameDay = "Вторник";
                break;
            case 3 :
                nameDay = "Среда";
                break;
            case 4 :
                nameDay = "Четврег";
                break;
            case 5 :
                nameDay = "Пятница";
                break;
            case 6 :
                nameDay = "Суббота";
                break;
            case 7 :
                nameDay = "Воскресенье";
                break;
            default:
                nameDay = "Введите корретное число!!!";
        }
        return nameDay;
    }

    public static double ex3(double a, double b, double c) {
        if (a>b){
            if (a>c) {
                return a;
            }
        } if (b>c) {
            return b;
        } return c;
    }

    public static double ex4(double a, double b, double c) {
        if (a<b){
            if (a<c) {
                return a;
            }
        } if (b<c) {
            return b;
        } return c;
    }

    public static double ex5 (double a, double b, double c, double d, double f) {
        return (a+b+c+d+f)/5;
    }

    public static String ex6 (double num) {
        String str = new String();
        str = Double.toString(num);
        int a = str.indexOf('.');
        return str = str.substring(0, a) + " руб " + str.substring(a+1, str.length()) + " коп";
    }

    public static String ex7 (double num) {
        String str = new String();
        str = Double.toString(num);
        int a = str.indexOf('.');
        return str = str.substring(0, a) + " кг " + str.substring(a+1, str.length()) + " гр";
    }

    public static double ex8 (double count, double weight) {
        return count*weight;
    }
}