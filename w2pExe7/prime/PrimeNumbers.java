package w2pExe7.prime;

import java.util.ArrayList;
import java.util.List;

class PrimeNumbers {

    List<Integer> makePrime(List<Integer> integerList) {

        List<Integer> listPrime = new ArrayList<>();

        for (Integer num : integerList
        ) {

            if (isPrime(num)) {
                if (listPrime.size() < 100) {
                    listPrime.add(num);
                }
            }

        }
        System.out.println(listPrime);
        return listPrime;
    }


    private Boolean isPrime(Integer num) {

        Boolean prime = true;

        for (int deminator = 2; deminator < num; deminator++) {

            if (num % deminator == 0)
                prime = false;
        }
        return prime;
    }

}
