package advance.hw9.Tack9_1;

public final class Manager extends Worker{
    private double numberOfSubordinates;
    private final int ODDS_SALARY = 3;

    public Manager(String name, double baseSalary, double numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(double numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if(getNumberOfSubordinates() == 0) {
            return getBaseSalary();
        } else {
            return getBaseSalary() * (getNumberOfSubordinates() / 100 * ODDS_SALARY);
        }
    }
}
