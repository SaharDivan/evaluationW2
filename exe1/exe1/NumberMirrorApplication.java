package evaluationW3.exe1;

import java.util.List;
import java.util.Scanner;

public class NumberMirrorApplication {


    public static void main(String[] args) {

        Integer number=askForANumber();
        NumberMirror numberMirror=new NumberMirror();
        Integer mirrored=numberMirror.mirror(number);
        Integer specialMirrored=numberMirror.specialMirror(number);
        display(mirrored);
        display(specialMirrored);
    }

    private static Integer askForANumber() {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a digit number between 0 and "+ Integer.MAX_VALUE+" !");

        return scanner.nextInt();
    }

    private static void display(Integer mirrored) {

        System.out.println("The mirrored number is: "+mirrored);
    }
}
