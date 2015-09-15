import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AlgorithmTest {

    @Test
    public void itShouldSayTestsAreConfigured() {
        Algorithm alg = new Algorithm();
        String result = alg.ensureTestsConfigured();
        String correctMessage = "Tests are configured";
        assertEquals(correctMessage, result);
    }

    @Test
    public void itShouldReturnSpecifiedAmountOfPrimeNumbers() {
        Algorithm alg = new Algorithm();
        int specifier = 6;
        ArrayList <Integer> result = alg.findSpecifiedAmountOfPrimeNumbers(specifier);
        ArrayList <Integer> correct = new ArrayList<>();
        correct.add(2);
        correct.add(3);
        correct.add(5);
        correct.add(7);
        correct.add(11);
        correct.add(13);
        assertEquals(correct, result);
    }

    @Test
    public void itShouldReturnTrueIfNumberIsAPrime() {
        Algorithm alg = new Algorithm();
        int primeNumber = 5;
        boolean correct = true;
        boolean result = alg.isPrime(primeNumber);
        assertEquals(correct,result);
    }

    @Test
    public void itShouldReturnFalseIfNumberIsNotAPrime() {
        Algorithm alg = new Algorithm();
        int primeNumber = 4;
        boolean correct = false;
        boolean result = alg.isPrime(primeNumber);
        assertEquals(correct,result);
    }

    @Test
    public void itShouldReturnTheCorrectAnswer() {
        Algorithm alg = new Algorithm();
        int specifier = 10001;
        ArrayList <Integer> primeNumberList = alg.findSpecifiedAmountOfPrimeNumbers(specifier);
        int correctAnswer = 104743;
        int indexOfLastItem = primeNumberList.size() - 1;
        int lastItem = primeNumberList.get(indexOfLastItem);
        assertEquals(correctAnswer, lastItem);
    }



}