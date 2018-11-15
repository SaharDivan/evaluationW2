package w2pExe5;

public class DistanceCalculator {

    public void calculateDistance(Double aveSteps) {


        Double aveStep = 0.000762;
        Double aveDistance = aveSteps * aveStep;
        System.out.println("The average distance is: " + aveDistance + " kilometer.");
    }
}



