package w2pExe1.gatherer;

import w2pExe1.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    public List<Hiker> signUp() {

        List<Hiker> hikers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name if you wish to join Hiking! ");
        String name = scanner.nextLine();

        while (!name.isEmpty()) {
            System.out.println("Congratulation, you are signed up!");
            System.out.println();
            System.out.println("Please enter the next name! ");
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            name = scanner.nextLine();
        }

        AutomaticGatherer specialFriends = new AutomaticGatherer();
        List<Hiker> extraHikers = specialFriends.getConfirmedHikers();
        hikers.addAll(extraHikers);
        return hikers;

    }

}
