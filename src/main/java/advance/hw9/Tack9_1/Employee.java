package advance.hw9.Tack9_1;

public abstract class Employee {
//    Необходимо реализовать задание из Task со следующими условиями:


//    Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
//    Классы Manager и Director должны быть финальными

    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double getSalary();

}
