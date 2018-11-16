package evaluationW2.exe1;

public class PostOfficeApplication {

    public static void main(String[] args) {



        Letter letter=new Letter("Shiraz");
        PostOfficeAssistant assistant=new PostOfficeAssistant();
        assistant.send(letter);

    }

}
