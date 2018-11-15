package w2pExe66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolShopApplication {


    public static void main(String[] args) {


        List<String> toolNames = Arrays.asList("Hammer", "Nails", "Saw");

        ShopAssistant shopAssistant = new ShopAssistant();
        shopAssistant.findToolbox(toolNames, "red");

    }

}
