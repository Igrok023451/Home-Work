package advance.hw9.Tack9_2;

public final class Manager  extends BaseEmployee {
   private int subordinates;

    public Manager(String name, int age, char gender, double Salary,int subordinates) {
        super(name, age, gender, Salary);
        this.subordinates = subordinates;
    }

    public double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i<monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWORK_DAY();
        }
        return result * (1 + subordinates * 1/100);
    }

}
