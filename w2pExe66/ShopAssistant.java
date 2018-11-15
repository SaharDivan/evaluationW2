package w2pExe66;

import w2pExe33.Tool;

import java.util.ArrayList;
import java.util.List;

public class ShopAssistant {


    public void findToolbox(List<String> toolNames, String color) {

        ToolBax toolBax = makeBox(toolNames, color);
        showBox(toolBax);
    }


    private ToolBax makeBox(List<String> toolNames, String color) {

        ToolBax toolBax = new ToolBax(color);

        for (String toolName : toolNames) {

            Tool tool = new Tool(toolName);
            toolBax.addTools(tool);

        }
        return toolBax;
    }


    private void showBox(ToolBax toolBax) {

        List<String> printList = new ArrayList<>();

        for (Tool tool : toolBax.getTools()) {

            printList.add(tool.getName());
        }

        System.out.println(" Here you are your " + toolBax.getColor() + " Toolbox that contains: " + printList);
    }

}



