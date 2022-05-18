package advance.hw7.two;

public class Manager extends Employee{
    private int employers;

    public Manager(String name, int age, char sex, double salaryOfDay, int employers) {
        super(name, age, sex, salaryOfDay);
        this.employers = employers;
    }

    public int getEmployers() {
        return employers;
    }

    public void setEmployers(int employers) {
        this.employers = employers;
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalaryOfDay() * monthArray[i].getWorkDay() * (getEmployers() * 1/100);
        }
        return result;
    }
}
