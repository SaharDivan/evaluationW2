package w2pExe1.gatherer;

import w2pExe1.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {

    List<Hiker> getConfirmedHikers() {
        List<Hiker> confirmedHikers = makeConfirmedHikers();
        return confirmedHikers;
    }


    private List<Hiker> makeConfirmedHikers() {

        List<Hiker> confirmedHikers = new ArrayList<>();
        Hiker tina = new Hiker("Tina");
        Hiker mina = new Hiker("Mina");
        Hiker sina = new Hiker("Sina");
        Hiker sara = new Hiker("Sara");
        Hiker mana = new Hiker("Mana");

        confirmedHikers.add(tina);
        confirmedHikers.add(mina);
        confirmedHikers.add(sina);
        confirmedHikers.add(sara);
        confirmedHikers.add(mana);

        return confirmedHikers;
    }
}
