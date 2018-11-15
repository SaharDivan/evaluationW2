package w2pExe4;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    private String name;
    private Double price;

    Meal(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
