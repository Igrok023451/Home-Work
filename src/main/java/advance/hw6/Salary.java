package advance.hw6;

public class Salary {

    public int getSum(Employee[] employeeArray) {
        int sum = 0 ;
        for (int i = 0; i<employeeArray.length; i++) {
            sum += employeeArray[i].salary;
        }
        return sum;
    }

}
