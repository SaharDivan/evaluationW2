package w2pExe1;

import w2pExe1.gatherer.Gatherer;

import java.util.List;

public class HikeApplication {

    public static void main(String[] args) {

        //gather the names hikers
        //display the list of hikers


        //receive the name of a hiker
        //sign up her
        //display the list of signed up hikers.

        Gatherer gatherer = new Gatherer();
        Hike hike = new Hike();
        List<Hiker> hikers = gatherer.signUp();
        hike.showHikers(hikers);
    }
}
