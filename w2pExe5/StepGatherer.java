package w2pExe5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {


    public List<Integer> askForSteps() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfSteps = new ArrayList<>();

        System.out.println("Enter steps for each person!");

        for (int counter = 0; counter < 3; counter++) {
            Integer step = scanner.nextInt();
            listOfSteps.add(step);
        }

        System.out.println("Steps of each person are: " + listOfSteps);
        return listOfSteps;
    }


}
