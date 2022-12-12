package Students;

public class Students {
    //полета описваме характеристиките не студента
    //клас

    private String name;
    private String LastName;
    private double grade;


    // конструктор - публичен метод

    // обект от класа
    public Students(String name, String lastName, double grade) {
        this.name = name;
        LastName = lastName;
        this.grade = grade;
    }
    //geter

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",this.name,this.LastName,this.grade);
    }
}
