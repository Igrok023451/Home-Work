package advance.hw7.two;

public class Employee {
    private String name;
    private int age;
    private char sex;
    private double salaryOfDay;

    public Employee(String name, int age, char sex, double salaryOfDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryOfDay = salaryOfDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalaryOfDay() {
        return salaryOfDay;
    }

    public void setSalaryOfDay(double salaryOfDay) {
        this.salaryOfDay = salaryOfDay;
    }

    public double getSalary(Month[] monthArray) {
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalaryOfDay() * monthArray[i].getWorkDay();
        }
        return result;
    }
}
