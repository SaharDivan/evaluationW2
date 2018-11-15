package w2pExe1;

import java.util.ArrayList;
import java.util.List;

public class Hike {
    List<Hike> hikers;


    public void getHikers(List<Hike> hikers) {
        this.hikers = hikers;
    }

    public void showHikers(List<Hiker> hikers) {
        String name;
        List<String> names = new ArrayList<>();
        for (Hiker hiker : hikers
        ) {
            name = hiker.getName();
            names.add(name);
        }
        System.out.print("The List of hikers: " + names);
    }

}
