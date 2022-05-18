package advance.hw6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SalaryTest {
    Employee employee1 = new Employee ("Kate", 12, "woman", 100);
    Employee employee2 = new Employee ("Kate", 12, "woman", 23);
    Employee employee3 = new Employee ("Kate", 12, "woman", 176);
    Employee employee4 = new Employee ("Kate", 12, "woman", 123);

    @Test
    public void testGetSum() {
        Employee[] employees = new Employee[4];
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        Salary expected = new Salary();
        assertEquals(422, expected.getSum(employees));

    }
   public Employee[] employees2 = {
            new Employee("Kate", 12, "woman", 100),
            new Employee ("Kate", 12, "woman", 23),
            new Employee ("Kate", 12, "woman", 176),
            new Employee ("Kate", 12, "woman", 123)
    };

    @Test
    public void testGetSum2() {
        Salary expected = new Salary();
        assertEquals(422, expected.getSum(employees2));
    }

}