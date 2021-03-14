package s01;

import java.util.List;

public class Main {
    Player player = Player.createPlayer("Santa"); // TODO: 13.03.2021 Как к этому же игроку добавить хилок?
    Armor armor = new Armor("Lite", "Black");
    Armor armor1 = new Armor("Average", "Grey");
    Armor armor2 = new Armor("Hard", "White");
    Weapon weapon = new Weapon("Меч", "Простой");
    Weapon weapon1 = new Weapon("Пика", "Резная");
    Item item = Item.createItem("Book");
    Item item1 = Item.createItem("Notebook");
    Item item2 = Item.createItem("Shovel");
    Item item3 = Item.createItem("Scrap");
    Item item4 = Item.createItem("Pick");
    Item item5 = Item.createItem("Rock");
    Item item6 = Item.createItem("Stick");
    Item item7 = Item.createItem("Broom");
    Item item8 = Item.createItem("Knife");
    Item item9 = Item.createItem("Saw");
// TODO: 14.03.2021 не пойму как добавить в рюкзак, программа просит создать новый объект, а я хочу к player добавить
}
