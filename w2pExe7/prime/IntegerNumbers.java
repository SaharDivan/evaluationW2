package w2pExe7.prime;

import java.util.ArrayList;
import java.util.List;

class IntegerNumbers {

    List<Integer> getIntNumbers(Integer bound) {

        List<Integer> list = new ArrayList<>();
        for (int num = 2; num < bound; num++) {

            list.add(num);
        }

        return list;
    }
}
