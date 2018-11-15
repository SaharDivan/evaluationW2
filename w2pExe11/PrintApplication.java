package w2pExe11;

public class PrintApplication {

    public static void main(String[] args) {


        Article article = new Article("THE TITLE", "The text");
        Printer printer = new Printer();
        printer.print(article);
    }
}
