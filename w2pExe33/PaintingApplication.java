package w2pExe33;

public class PaintingApplication {

    public static void main(String[] args) {

        Tool tool = new Tool("Hammer");
        Derek derek = new Derek();
        derek.setTool(tool);
        derek.hangPainting();
    }
}

