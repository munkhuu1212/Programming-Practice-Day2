public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Сайн байна уу, миний нэр бол " + name + ", би " + age + " настай.");
    }

    public static void main(String[] args) {
        Person p = new Person("Мөнхболд", 25);
        p.greet();
    }
}
