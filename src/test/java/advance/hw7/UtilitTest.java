package advance.hw7;

import advance.hw7.one.Manager;
import advance.hw7.one.Utilit;
import advance.hw7.one.Worker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UtilitTest {

    Worker worker1 = new Worker(10, "Kate");
    Worker worker2 = new Worker(40, "Yan");
    Worker worker3 = new Worker(33, "Anna");
    Worker worker4 = new Worker(55, null);
    Worker worker5 = new Worker(70, "Kate");

    Worker[] workers = {worker1, worker2};
    Worker[] workers2 = {worker1, worker2, worker4};
    Worker[] workers3 = {worker3, worker4, worker5};
    Worker[] workers4 = {worker1, worker4, worker5};

    @DataProvider
    public Object[][] getWorkerName() {
        return new Object[][] {
                {workers, "Yan", worker2, "Fail"},
                {workers2, "Kate", worker1, "Fail"},
                {workers3, null, worker1, "Fail"},
                {workers4, "Kate", worker4, "Fail"}
        };
    }
    @Test(dataProvider = "getWorkerName")
    public void testWorkerName(Worker[] workers, String name, Worker expected, String message) {
        Worker actual = Utilit.workerName(workers, name);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getPartWorkerName() {
        return new Object[][] {
                {workers, "Y", worker2, "Fail"},
                {workers2, "te", worker1, "Fail"},
                {workers3, null, worker1, "Fail"},
                {workers4, "Kate", worker4, "Fail"}
        };
    }
    @Test(dataProvider = "getPartWorkerName")
    public void testPartWorkerName(Worker[] workers, String name, Worker expected, String message) {
        Worker actual = Utilit.partWorkerName(workers, name);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getWorkerSalary() {
        return new Object[][] {
                {workers, 50.0, "Fail message"},
                {workers2, 105.0, "Fail"},
                {workers3, 158.0, "Fail"},
                {workers4, 135, "Fail"}
        };
    }
    @Test(dataProvider = "getWorkerSalary")
    public void testWorkerSalary(Worker[] workers, double expected, String message) {
        double actual = Utilit.workerSalary(workers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getWorkerMaxSalary() {
        return new Object[][] {
                {workers, 40.0, "Fail message"},
                {workers2, 55.0, "Fail"},
                {workers3, 70.0, "Fail"},
                {workers4, 70.0, "Fail"}
        };
    }
    @Test(dataProvider = "getWorkerMaxSalary")
    public void testWorkerMaxSalary(Worker[] workers, double expected, String message) {
        double actual = Utilit.workerMaxSalary(workers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getWorkerMinSalary() {
        return new Object[][] {
                {workers, 10.0, "Fail message"},
                {workers2, 10.0, "Fail"},
                {workers3, 33.0, "Fail"},
                {workers4, 10.0, "Fail"}
        };
    }
    @Test(dataProvider = "getWorkerMinSalary")
    public void testWorkerMinSalary(Worker[] workers, double expected, String message) {
        double actual = Utilit.workerMinSalary(workers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    Manager manager1 = new Manager(10, "Rfnt", 100);
    Manager manager2 = new Manager(10, "Rfnt", 0);
    Manager manager3 = new Manager(10, "Rfnt", 39);
    Manager manager4 = new Manager(10, "Rfnt", 15);

    Manager[] managers1 = {manager1, manager2 };
    Manager[] managers2 = {manager3, manager4};
    Manager[] managers3 = {null, manager2, manager3, manager1, manager4};
    Manager[] managers4 = null;


    @DataProvider
    public Object[][] getWorkerMinEmployee() {
        return new Object[][] {
                {managers1, 0, "Fail message"},
                {managers2, 15, "Fail"},
                {managers3, 0, "Fail"},
                {managers4, 10.0, "Fail"}
        };
    }
    @Test(dataProvider = "getWorkerMinEmployee")
    public void testWorkerMinEmployee(Manager[] managers, double expected, String message) {
        double actual = Utilit.managerMinEmployee(managers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getWorkerMaxEmployee() {
        return new Object[][] {
                {managers1, 100, "Fail message"},
                {managers2, 39, "Fail"},
                {managers3, 100, "Fail"},
                {managers4, 10.0, "Fail"}
        };
    }
    @Test(dataProvider = "getWorkerMaxEmployee")
    public void testWorkerMaxEmployee(Manager[] managers, double expected, String message) {
        double actual = Utilit.managerMaxEmployee(managers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getManagerMaxSalary() {
        return new Object[][] {
                {managers1, 20, "Fail message"},
                {managers2, 1.6999999999999993, "Fail"},
                {managers3, 20, "Fail"},
                {managers4, 10.0, "Fail"}
        };
    }
    @Test(dataProvider = "getManagerMaxSalary")
    public void testManagerMaxSalary(Manager[] managers, double expected, String message) {
        double actual = Utilit.managerMaxSalary(managers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @DataProvider
    public Object[][] getManagerMinSalary() {
        return new Object[][] {
                {managers1, 0, "Fail message"},
                {managers2, -5.5, "Fail"},
                {managers3, -5.5, "Fail"},
                {managers4, 10.0, "Fail"}
        };
    }
    @Test(dataProvider = "getManagerMinSalary")
    public void testManagerMinSalary(Manager[] managers, double expected, String message) {
        double actual = Utilit.managerMinSalary(managers);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

}