package s01;

public class Armor implements Item{
    Player player;
    String name = "";
    String discripsion = "";
    ClothesType clothesType;
    WeaponType weaponType;
    public Armor(String name, String discripsion) {
        this.name = name;
        this.discripsion = discripsion;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String getDiscripsion() {
        return discripsion;
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
