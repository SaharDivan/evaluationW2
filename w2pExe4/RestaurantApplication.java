package w2pExe4;

public class RestaurantApplication {

    //There is a Meal with price and name
    //There is a menu
    //There is a Waiter
    //waiter shows the menu
    //Waiter ask for the order
    //Water say price

    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        waiter.showMenu();
        String mealName = waiter.getOrder();
        waiter.sayPrice(mealName);


    }


}

