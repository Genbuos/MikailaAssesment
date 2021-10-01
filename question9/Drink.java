package question9;

public abstract class Drink extends Product implements IConsumable{

    public Drink(String name, double price) {
        super(name, price);
    }
}
