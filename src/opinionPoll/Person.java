package opinionPoll;

public class Person {
    //полета-> харакеристики -> име и възраст
    private String name;
    private int age;


    // конструктор -> създаваме обекти от класа
    public Person(String name, int age) {
        //нов обект
        this.name = name;
        this.age = age;
    }


    // метпдои -> поведение, какво може да прави
public String getName(){
        return this.name;
}
public  int getAge(){
        return this.age;
}
}

