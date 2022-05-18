package advance.hw6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeeTest {

    @DataProvider
    public  Object[][] getElementsToPerson () {
        return new Object[][] {
                {"Kate", 23, "woman", 100, "Alex", 21, "man", 150 , false},
                {"Kate", 23, null, 10, "Kate", 23, "woman", 200, true},
                {"Frik", 0, "fsdd", 150, null, 0, null, 0, false},
                {null, 23, "fsdd", 10, "Kate", 23, "woman", 200, true},
        };
    }

    @Test(dataProvider = "getElementsToPerson")
    public void testIsSameName(String name1, int old1, String sex1, int salary1,
                               String name2, int old2, String sex2, int salary2, boolean actual) {
        Employee employee1 = new Employee(name1, old1, sex1, salary1);
        Employee employee2 = new Employee(name2, old2, sex2, salary2);
        assertEquals(actual, employee1.isSameName(employee2) );
    }
}