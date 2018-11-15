package w2pExe6;

public class DistanceCalculator {


    public void calculate(Coordinate initial, Coordinate destination) {

        Double x1 = Math.toRadians(initial.getX());
        Double y1 = Math.toRadians(initial.getY());
        Double x2 = Math.toRadians(destination.getX());
        Double y2 = Math.toRadians(destination.getY());


        Double radius = 6371.01;

        Double distance = radius * Math.acos(Math.sin(x1)) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);

        System.out.println("Distance between two points" + "(" + x1 + "," + y1 + ")" + " and " + "(" + x2 + "," + y2 + ") is: " + distance + " km");
    }

}


