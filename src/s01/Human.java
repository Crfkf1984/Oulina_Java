package s01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Human {
    private String name;
    private LocalDate date;
    private String adress;
    private String sellfon;
    private String email;

    public Human(String name, LocalDate date, String adress, String sellfon, String email) {
        this.name = name;
        this.date = date;
        this.adress = adress;
        this.sellfon = sellfon;
        this.email = email;
    }

    public static void main(String[] args) {

        List<Human> list = new ArrayList<>();
        list.add(new Human("Emilу", LocalDate.of(2001, 1, 1), "strit West", "89784561237,",
                "12345@mail.ru"));
        list.add(new Human("Hannah", LocalDate.of(2020, 2, 2), "strit Manthatten", "89138978456,",
                "15432@mail.ru"));
        list.add(new Human("Natalie", LocalDate.of(1999, 3, 3), "strit Backer", "89284561237,",
                "ertu@mail.ru"));
        list.add(new Human("Sophia", LocalDate.of(1998, 4, 4), "strit Yoker", "89454561237,",
                "yuiop@mail.ru"));
        list.add(new Human("Ella", LocalDate.of(1997, 5, 5), "strit Monko", "89234561237,",
                "fghjk@mail.ru"));

        Iterator<Human> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator = list.iterator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код города для поиска человека");
        String tel = scanner.nextLine();
        while (iterator.hasNext()) {
            Human res = iterator.next();
            if (  res.getSellfon().startsWith(tel)) {
                System.out.println(res);
            }
        }

    }
    //iterator.forEachRemaining((list) -> System.out.println(list)); - не получается его
    // здесь использовать, почему?

    public String getSellfon() {
        return sellfon;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", adress='" + adress + '\'' +
                ", sellfon='" + sellfon + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
