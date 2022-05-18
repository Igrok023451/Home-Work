package advance.hw7.one;

public class Worker extends Employee {
    public Worker(double baseSalary, String name) {
        super(baseSalary, name);
    }

    public double getSalary() {
        return getBaseSalary();
    }
}
