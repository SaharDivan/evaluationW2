package w2pExe6;

import java.util.Scanner;

public class CoordinateGatherer {


    public Coordinate gather() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x:latitude and y:longitude of a point. ");

        Double x = scanner.nextDouble();
        Double y = scanner.nextDouble();

        Coordinate point = new Coordinate(x, y);

        return point;


    }
}
