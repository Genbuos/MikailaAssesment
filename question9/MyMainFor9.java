package question9;

import java.util.ArrayList;

public class MyMainFor9 {
    public static void main(String[] args) {
        CocaCola coke = new CocaCola("coke",1.99);
        Car honda = new Car("Honda Type R",37000.0);
        CheeseBurger burger = new CheeseBurger("Mc Double", 2.99);
        Batteries batteries = new Batteries("Duracel", 5.99);




        ArrayList<Product> products = new ArrayList<Product>();
        products.add(coke);
        products.add(honda);
        products.add(burger);
        products.add(batteries);

        ArrayList<IConsumable> consumables = new ArrayList<IConsumable>();




    }
}
