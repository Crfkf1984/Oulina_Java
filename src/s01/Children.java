package s01;

import java.sql.Array;
import java.util.Arrays;

public class Children {
    public static void main(String[] args) {
        Children[] children = new Children[] {new Children("Petr", "Petrovich", 34),
                new Children("Ivan", "Ivanov", 36)};

        for (Children children1: children) {
            System.out.println(children1);
        }
    }
        private String nameBaby;
        private String surname;
        private int age;

    public Children(String nameBaby, String surname, int age){
            this.nameBaby = nameBaby;
            this.surname = surname;
            this.age = age;
        }

        public String getNameBaby () {
            return nameBaby;
        }

        public void setNameBaby (String nameBaby){
            this.nameBaby = nameBaby;
        }

        public String getSurname () {
            return surname;
        }

        public void setSurname (String surname){
            this.surname = surname;
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            this.age = age;
        }

    @Override
    public String toString() {
        return "Children{" +
                "nameBaby='" + nameBaby + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
