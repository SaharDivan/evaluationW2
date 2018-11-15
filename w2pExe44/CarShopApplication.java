package w2pExe44;

public class CarShopApplication {
    public static void main(String[] args) {


        Car benz = new Car("Mercedes Benz");
        Car bmw = new Car("BMW");
        Car vw = new Car("Volks Wagon");

        Seller seller = new Seller();
        seller.describe(benz);
        seller.describe(bmw);
        seller.describe(vw);
    }
}
