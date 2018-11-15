package w2pExe4;

import java.util.List;
import java.util.Scanner;

public class Waiter {


    public void showMenu() {

        Menu menu = new Menu();
        List<String> listMenu = menu.getNames();
        System.out.println("Hello, today meals are: " + listMenu);
    }

    public String getOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to order from the menu?");
        String mealName = scanner.nextLine();
        return mealName;
    }

    public void sayPrice(String mealName) {

        Menu menu = new Menu();
        Double price = menu.getPrice(mealName);
        System.out.println(mealName + " cost " + price + " euro!");
    }


}
