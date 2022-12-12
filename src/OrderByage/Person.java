package OrderByage;

public class Person {
    //полета-> име , ид ,възраст
    private String name;
    private String id;
    private int age;

    // генерираме конструктор от класа
    // целта на конструктора е да създаде нов празен обект
    // (name = null, id = null, age = 0)

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",this.name,this.id,this.age);
    }
}
