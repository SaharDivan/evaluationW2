package w2pExe6;

public class Coordinate {

    private Double x;
    private Double y;


    public Coordinate(Double x, Double y) {

        this.x = x;
        this.y = y;

    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}