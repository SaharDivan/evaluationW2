package w2pExe3;

import java.util.ArrayList;
import java.util.List;

public class BootShopApplication {

    public static void main(String[] args) {


        //There is a hansel
        //There is a bootShopAssistant
        //bootShopAssistant getRecommendation
        //There is a list of boot recommendations
        //hansel tryHikingBoots

        Hansel hansel = new Hansel();
        BootShopAssistant bootShopAssistant = new BootShopAssistant();
        List<HikingBoot> bootRecommendation = bootShopAssistant.getHikingBootRecommendation();
        hansel.tryHikingBoots(bootRecommendation);
    }
}
