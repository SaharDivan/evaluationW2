package w2pExe33;

public class Derek {

    private Tool tool;

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Boolean canHangPainting() {

        return tool.getName() == "Hammer";
    }

    public void hangPainting() {

        if (canHangPainting()) {
            System.out.println("I have hammer! I can hang the painting!");
        } else {
            System.out.println("I don't have hammer! I can't hang the painting!");
        }
    }
}
