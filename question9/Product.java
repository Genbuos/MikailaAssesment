package question9;

import java.util.ArrayList;

public abstract class Product {
    private String name;
    private double price;
    protected ExpirationDate expirationDate;
    public double discountRate;
    public Product(String name, double price){
        this.name = name;
        this.price = price;


    }

    public void printExpirationDate(Product product ) {
        System.out.print(expirationDate);

    }

    public double calculateDiscount(){
        return discountRate * price;
    }

    public void printOrder(Product[] productList){
        System.out.println(productList);

    }
    public void printConsumptionQty(ArrayList<IConsumable> qty){
        System.out.println(qty);

    }



}
