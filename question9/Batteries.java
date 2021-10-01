package question9;

public class Batteries extends Product implements IConsumable{
    public Batteries(String name, double price) {
        super(name, price);
    }

    @Override
    public int consume() {
        return 0;
    }
}
