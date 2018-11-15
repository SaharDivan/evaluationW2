package w2pExe5;

import java.util.List;

public class PedometerApplication {

    //ask for steps
    //make the averageSteps
    //calculate the average Distance

    public static void main(String[] args) {

        StepGatherer stepGatherer = new StepGatherer();
        AverageCalculator averageCalculator = new AverageCalculator();
        DistanceCalculator distanceCalculator = new DistanceCalculator();


        List<Integer> listOfSteps = stepGatherer.askForSteps();
        Double averageSteps = averageCalculator.calculateAverage(listOfSteps);
        distanceCalculator.calculateDistance(averageSteps);

    }
}
