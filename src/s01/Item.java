package s01;

public class Item {
    private String name;
    private String discripsion;
    private Player player = null;

    public Item(String name) {
        this.name = name;
    }

    public Item(String name, String discripsion) {
        this.name = name;
        this.discripsion = discripsion;
    }

    public static Item createItem(String name) {
        return new Item(name);
    }

    public String getName() {
        return name;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getDiscripsion() {
        return discripsion;
    }

    public Player getPlayer() {
        return player;
    }
}
enum ClothesType{
    ЛЕГКАЯ, ТЯЖЕЛАЯ, МАГИЧЕСКАЯ
}

enum WeaponType{
    МЕЧ, ПИКА, ДВУРУЧНЫЙ_МЕЧ
}

enum Level{
    A_LEVEL, B_LEVEL, C_LEVEL
}
