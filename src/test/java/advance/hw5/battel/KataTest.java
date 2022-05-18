package advance.hw5.battel;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KataTest {

    @Test
    public void testDeclareWinner() {
        assertEquals("Lew", Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Lew"));
        assertEquals("Harry", Kata.declareWinner(new Fighter("Lew", 10, 2), new Fighter("Harry", 5, 4), "Harry"));
    }
}