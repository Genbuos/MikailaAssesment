package question9;

public abstract class Food extends Product  implements IConsumable, IEdible{
    public Food(String name, double price) {
        super(name, price);
    }
}
