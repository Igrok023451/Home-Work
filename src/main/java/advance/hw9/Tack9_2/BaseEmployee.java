package advance.hw9.Tack9_2;

public abstract class BaseEmployee {
    private String name;
    private int age;
    private char gender;
    private double Salary;

    public BaseEmployee(String name, int age, char gender, double Salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.Salary = Salary;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

}
