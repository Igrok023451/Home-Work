package advance.hw7.one;

public class Director extends Manager {

    public Director(double baseSalary, String name, double numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    public double getSalary() {
        if(getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * 9);
        }
    }

}