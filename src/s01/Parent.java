package s01;

public class Parent {
    private String nameParent;
    private String surName;
    private int age;

    public Parent(String nameParent, String surName, int age) {
        this.nameParent = nameParent;
        this.surName = surName;
        this.age = age;
    }

    public String getNameParent() {
        return nameParent;
    }

    public void setNameParent(String nameParent) {
        this.nameParent = nameParent;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Parent{" +
                "nameParent='" + nameParent + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Parent[] parent = new Parent[] {new Parent("Marina", "Petrova", 55),
        new Parent("Slava", "Ivanov", 65)};

        for ( Parent parent1: parent) {
            System.out.println(parent1);
        }
    }
}
