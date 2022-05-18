package advance.hw9.Tack9_2;

public class MonthUtil {
    public final static Month[] MONTH_YEAR = {
            new Month("January", 31, 27),
            new Month("February", 31, 27),
            new Month("March", 31, 27),
            new Month("April", 31, 27),
            new Month("May", 31, 27),
            new Month("June", 31, 27),
            new Month("July", 31, 27),
            new Month("August", 31, 27),
            new Month("September", 31, 27),
            new Month("October", 31, 27),
            new Month("November", 31, 27),
            new Month("December", 31, 27)
    };

    public static Month[] HALF_YEAR = {
            new Month("January", 31, 27),
            new Month("February", 31, 27),
            new Month("March", 31, 27),
            new Month("April", 31, 27),
            new Month("May", 31, 27),
            new Month("June", 31, 27)
    };

    public static Month[] HALF_YEAR2 = {
            new Month("July", 31, 27),
            new Month("August", 31, 27),
            new Month("September", 31, 27),
            new Month("October", 31, 27),
            new Month("November", 31, 27),
            new Month("December", 31, 27)
    };

    public static Month[] BLOCK1 = {
            new Month("January", 31, 27),
            new Month("February", 31, 27),
            new Month("March", 31, 27)
    };

    public static Month[] BLOCK2 = {
            new Month("April", 31, 27),
            new Month("May", 31, 27),
            new Month("June", 31, 27)
    };

    public static Month[] BLOCK3 = {
            new Month("July", 31, 27),
            new Month("August", 31, 27),
            new Month("September", 31, 27)
    };

    public static Month[] BLOCK4 = {
            new Month("October", 31, 27),
            new Month("November", 31, 27),
            new Month("December", 31, 27)
    };


    public static Month getMonth(int index) {
        return MONTH_YEAR[index];
    }

    public static int getMonthSize() {
        return MONTH_YEAR.length;
    }

    public static Month[] getMonthArray() {
        return MONTH_YEAR;
    }

}
