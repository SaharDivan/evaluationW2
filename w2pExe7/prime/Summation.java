package w2pExe7.prime;

import java.util.List;

class Summation {


    Integer sumTheList(List<Integer> list) {

        Integer sum = 0;

        for (Integer num : list) {
            sum = sum + num;
        }
        return sum;
    }
}
