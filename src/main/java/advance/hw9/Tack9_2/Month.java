package advance.hw9.Tack9_2;

public final class Month {
    private final String NAME_MONTH;
    private final int WORK_DAY;
    private final int ALL_DAY;

    public Month(String nameMonth, int workDay, int allDay) {
        this.NAME_MONTH = nameMonth;
        this.WORK_DAY = workDay;
        this.ALL_DAY = allDay;
    }

    public String getNAME_MONTH() {
        return NAME_MONTH;
    }

    public int getWORK_DAY() {
        return WORK_DAY;
    }

    public int getALL_DAY() {
        return ALL_DAY;
    }
}
