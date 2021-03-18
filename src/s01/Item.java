package s01;

public interface Item {

    public static Item createItem(String name) {
        return null;
    };

    public String getName();

    public void setPlayer(Player player);

    public String getDiscripsion();

    public Player getPlayer();
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
