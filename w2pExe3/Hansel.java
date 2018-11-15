package w2pExe3;

import java.util.List;

public class Hansel {

    private Integer size;

    public Hansel() {

        this.size = 41;
    }

    private Boolean isRightSize(HikingBoot hikingBoot) {

        return hikingBoot.getSize() == 41;

    }

    public void tryHikingBoots(List<HikingBoot> bootRecommendation) {

        for (HikingBoot boot : bootRecommendation
        ) {
            System.out.println("How is this boot with size: " + boot.getSize());

            if (!isRightSize(boot)) {
                System.out.println("This boot doesn't fit!");
            } else {

                System.out.println("I will buy this boot!");

                return;
            }

        }
    }

}