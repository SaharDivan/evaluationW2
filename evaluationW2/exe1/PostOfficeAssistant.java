package evaluationW2.exe1;

public class PostOfficeAssistant {


    public void stamp(Letter letter) {

        letter.stamped();
    }

    public void send(Letter letter) {

        if (!letter.isStamped()) {

            System.out.println("It needs to be stamped first, pay the stamp please!");
            stamp(letter);
            System.out.println("Great! Now it is stamped! we can send it");
        }

        System.out.println("It will be send to the address: " + letter.getAddress());
    }

}

