package s01;

public abstract class Item {
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

    public abstract Item createItem(String name);

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
