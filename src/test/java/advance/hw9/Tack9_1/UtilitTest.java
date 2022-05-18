package advance.hw9.Tack9_1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UtilitTest {
    Worker worker = new Worker(10, "Kate");
    Worker worker1 = new Worker(40, "Yan");
    Worker worker2 = new Worker(33, "Anna");
    Worker worker3 = new Worker(55, null);
    Worker worker4 = new Worker(70, "Kate");

    Worker [] workers = {worker, worker1};
    Worker [] workers2 = {worker, worker1, worker3};
    Worker [] workers3 = {worker2, worker3, worker4};
    Worker [] workers4 = {worker, worker3, worker4};

    @DataProvider
    public Object[][] getWorkerName() {
        return new Object[][] {
                {workers, "Yan", worker1, "Fail"},
                {workers2, "Kate", worker, "Fail"},
                {workers3, null, worker1, "Fail"},
                {workers4, "Kate", worker, "Fail"}
        };
    }

    @Test(dataProvider = "getWorkerName")
    public void testWorkerName(Worker [] work, String name, Worker expected, String message) {
        Worker actual = Utilit.workerName(work, name);
        assertEquals(actual, expected, message);
        System.out.println("Pass");
    }

    @Test
    public void testPartWorkerName() {
    }

    @Test
    public void testWorkerSalary() {
    }

    @Test
    public void testWorkerMaxSalary() {
    }

    @Test
    public void testWorkerMinSalary() {
    }

    Manager manager1 = new Manager("Rfnt", 10, 100);
    Manager manager2 = new Manager("Rfnt", 10, 0);
    Manager manager3 = new Manager("Rfnt", 10, 39);
    Manager manager4 = new Manager("Rfnt", 10, 15);

    Manager[] managers1= {manager1, manager2};
    Manager[] managers2= {manager3, manager4};
    Manager[] managers3= {null, manager1, manager2, manager3, manager4};
    Manager[] managers4= null;

    @DataProvider
    public Object[][] getWorkerMinEmployees() {
        return new Object[][] {
                {managers1, 0, "Fail message"},
                {managers2, 15, "Fail"},
                {managers3, 0, "Fail"},
                {managers4, 10.0, "Fail"}
        };
    }

    @Test(dataProvider = "getWorkerMinEmployees")
    public void testManagerMinEmployee(Manager[] manager, double expected, String message) {
        double actual = Utilit.managerMinEmployee(manager);
        assertEquals(actual, expected, message);
        System.out.println("Pass");

    }

    @Test
    public void testManagerMaxEmployee() {
    }

    @Test
    public void testManagerMaxSalary() {
    }

    @Test
    public void testManagerMinSalary() {
    }
}