package s01;

public class Potion extends Item{
    int amount;
    public Potion(String name) {
        super(name);
    }

    @Override
    public Item createItem(String name) {
        return new Potion(name);
    }
}
