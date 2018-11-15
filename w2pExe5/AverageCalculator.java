package w2pExe5;

import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {

    public Double calculateAverage(List<Integer> list) {

        Double size = Double.valueOf(list.size());
        List<Integer> listCopy = new ArrayList<>();
        Integer sum = 0;

        listCopy.addAll(list);

        while (listCopy.size() > 0) {
            sum = sum + listCopy.get(0);
            listCopy.remove(0);
        }

        Double average = sum / size;

        System.out.println("The average is: " + average);

        return average;
    }
}



