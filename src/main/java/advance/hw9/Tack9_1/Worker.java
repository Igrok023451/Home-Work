package advance.hw9.Tack9_1;

public class Worker extends Employee {

    public Worker(double baseSalary, String name) {
        super(name, baseSalary);
    }

    @Override
    double getSalary() {
        return getBaseSalary();
    }

    @Override
    public final double getBaseSalary() {
        return super.getBaseSalary();
    }



}
