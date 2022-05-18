package advance.hw9.Tack9_2;

public final class Employee extends BaseEmployee {

    public Employee(String name, int age, char gender, double Salary) {
        super(name, age, gender, Salary);
    }

    public double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i<monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWORK_DAY();
        }
        return result;
    }
}
