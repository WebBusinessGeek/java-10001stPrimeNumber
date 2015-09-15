import org.junit.Test;

import static org.junit.Assert.*;

public class AlgorithmTest {

    @Test
    public void itShouldSayTestsAreConfigured() {
        Algorithm alg = new Algorithm();
        String result = alg.ensureTestsConfigured();
        String correctMessage = "Tests are configured";
        assertEquals(correctMessage, result);
    }

}