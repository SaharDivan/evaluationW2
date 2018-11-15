package w2pExe6;

public class DistanceApplication {

    //ask for two coordinates, calculate the distance and display in km.

    public static void main(String[] args) {


        CoordinateGatherer gatherer = new CoordinateGatherer();
        Coordinate initial = gatherer.gather();
        Coordinate destination = gatherer.gather();
        DistanceCalculator calculator = new DistanceCalculator();
        calculator.calculate(initial, destination);
    }
}
