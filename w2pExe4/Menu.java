package w2pExe4;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //Makes the menu

    private List<Meal> menu;

    public Menu() {

        this.menu = makeMenu();
    }


    public List<Meal> makeMenu() {
        List<Meal> menu = new ArrayList<>();
        Meal coucous = new Meal("Coucous", 8.50);
        Meal tajin = new Meal("Tajin", 9.50);
        Meal hummus = new Meal("Hummus", 3.50);
        Meal falafel = new Meal("Falafel", 4.00);
        menu.add(coucous);
        menu.add(tajin);
        menu.add(hummus);
        menu.add(falafel);

        return menu;
    }

    public Double getPrice(String mealName) {
        Double price = 0.0;

        for (Meal meal : menu
        ) {

            if (mealName.equalsIgnoreCase(meal.getName())) {
                price = meal.getPrice();
                System.out.println(price);
            }
        }
        return price;
    }

    public List<String> getNames() {
        String name = "";
        List<String> listMenu = new ArrayList<>();
        for (Meal meal : menu
        ) {
            name = meal.getName();
            listMenu.add(name);
        }

        return listMenu;
    }

}
