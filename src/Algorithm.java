import java.util.ArrayList;


public class Algorithm {

    public String ensureTestsConfigured() {
        return "Tests are configured";
    }

    public ArrayList <Integer> findSpecifiedAmountOfPrimeNumbers(int specifier) {
        ArrayList <Integer> primeNumberList = new ArrayList<>();
        for(int numberToCheck = 2; specifier != primeNumberList.size(); numberToCheck++) {
            if(isPrime(numberToCheck)) {
                primeNumberList.add(numberToCheck);
            }
        }
        return primeNumberList;
    }

    public Boolean isPrime(int numberToCheck) {
        boolean result = true;
        for(int i = 2; i < numberToCheck; i++) {
            if(numberToCheck % i == 0) {
                result = false;
            }
        }
        return result;
    }

}

