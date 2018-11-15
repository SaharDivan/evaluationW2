package w2pExe3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BootShopAssistant {


    public List<HikingBoot> getHikingBootRecommendation() {

        List<HikingBoot> bootRecommendation = new ArrayList<>();
        HikingBoot boot1 = new HikingBoot(40);
        HikingBoot boot2 = new HikingBoot(41);
        HikingBoot boot3 = new HikingBoot(42);
        bootRecommendation.add(boot1);
        bootRecommendation.add(boot2);
        bootRecommendation.add(boot3);

        Collections.shuffle(bootRecommendation);
        return bootRecommendation;
    }
}
