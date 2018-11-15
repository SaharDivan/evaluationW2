package w2pExe7.prime;

import java.util.List;

public class First100PrimesCalculator {


    public void getSumOfFirst100Primes() {

        IntegerNumbers integerNumbers = new IntegerNumbers();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        Summation summation = new Summation();

        List<Integer> list = integerNumbers.getIntNumbers(550);
        List<Integer> listPrime = primeNumbers.makePrime(list);
        Integer sum = summation.sumTheList(listPrime);

        System.out.println("The summation of first 100 Prime numbers is: " + sum);
    }

}
