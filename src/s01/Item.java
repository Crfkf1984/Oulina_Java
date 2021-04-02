package s01;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// TODO: 02.04.2021 По удалял ветки ранее, так как занимали много места в консоли, 
// TODO: 02.04.2021  поэтому задание сделал таким образзом и не сделал здесь отбор по владельцу, так как во владельца уже
// TODO: 02.04.2021  не добавишь!

public class Item{
    String name;

    public Item(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Collection<Item> item = Arrays.asList( new Item("Car"), new Item("Rock"),
                new Item("Moto"), new Item("Food"));

        System.out.println(item.stream().sorted((o1, o2) -> o1.name.compareTo(o2.name)).collect(Collectors.toList()));
        System.out.println(item.stream().sorted((o1, o2) -> -o1.name.compareTo(o2.name)).collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                '}';
    }
}
