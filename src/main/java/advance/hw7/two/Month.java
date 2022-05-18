package advance.hw7.two;

public class Month {
    private String nameMonth;
    private int day;
    private int workDay;

    public Month(String nameMonth, int day, int workDay) {
        this.nameMonth = nameMonth;
        this.day = day;
        this.workDay = workDay;
    }

    public String getNameMonth() {
        return nameMonth;
    }

    public int getDay() {
        return day;
    }

    public int getWorkDay() {
        return workDay;
    }
}
