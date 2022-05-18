package advance.hw6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @DataProvider
    public  Object[][] getElementsToPerson () {
        return new Object[][] {
                {"Kate", 23, "woman", "Mrs. Kate"},
                {"Alex", 21, "man", "Mr. Alex"},
                {"Kate", 23, null, "Mrs. Kate"},
                {"Frik", 0, "fsdd", "Enter correct sex person"},
                {"Kate", 23, " wOman", "Mrs. Kate"},
                {"Alex", 21, "maN ", "Mr. Alex"}
        };
    }

    @Test(dataProvider = "getElementsToPerson")
    public void testGetName(String name, int old, String sex, String actual) {
        Person person = new Person(name, old, sex);
        assertEquals(actual, person.getName());
    }
}