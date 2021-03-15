package s01;

public class Armor extends Item{
    ClothesType clothesType;
    WeaponType weaponType;
    public Armor(String name) {
        super(name);
    }

    @Override
    public Item createItem(String name) {
        return new Armor(name);
    }
}
