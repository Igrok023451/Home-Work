package advance.hw6;

public class Employee {

    String name;
    int old;
    String sex;
    int salary;

    public Employee(String name, int old, String sex, int salary) {
        this.name = name;
        this.old = old;
        this.sex = sex;
        this.salary = salary;
    }

    boolean isSameName(Employee employee){
        if (employee.name == null) {
            System.out.println("The name is NULL!!!");
            return false;
        } else {
            if (employee.name.equals(this.name)) {
                return true;
            } else {
                return false;
            }
        }
    }

}
