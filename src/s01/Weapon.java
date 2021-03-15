package s01;

public class Weapon extends Item{
    Weapon weapon;
    Level level;
    public Weapon(String name) {
        super(name);
    }

    @Override
    public Item createItem(String name) {
        return new Weapon(name);
    }
}
