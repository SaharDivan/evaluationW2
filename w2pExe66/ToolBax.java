package w2pExe66;

import w2pExe33.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolBax {

    private String color;
    private List<Tool> tools = new ArrayList<>();


    public ToolBax(String color) {
        this.color = color;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public String getColor() {
        return color;
    }

    public void addTools(Tool tool) {

        tools.add(tool);
    }
}
