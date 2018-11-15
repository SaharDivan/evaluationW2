package w2pExe55;

import w2pExe11.Printer;

public class MagazineApplication {

    public static void main(String[] args) {


        Editor editor = new Editor();
        Magazine magazine = editor.writeMagazine();

        Printer printer = new Printer();
        printer.printMagazine(magazine);


    }
}
