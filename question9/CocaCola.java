package question9;

public class CocaCola extends Drink{
    public CocaCola(String name, double price) {
        super(name, price);
    }

    @Override
    public int consume() {
        return 0;
    }
}
