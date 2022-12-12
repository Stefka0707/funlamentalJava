package Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Students> studentsList = new ArrayList <>();
        for (int i = 1; i <=n ; i++) {
            String data = scanner.nextLine();
            String []dataParts = data.split(" ");
        String firstName =dataParts[0];
        String lastName = dataParts[1];
        double grade = Double.parseDouble(dataParts[2]);


        Students students = new Students(firstName,lastName,grade);
       studentsList.add(students);
        }
        //списък със студенти - сортиране
        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());
        //отпечатваме всеки един студент

        for (Students students:studentsList) {
            System.out.println(students);

        }


    }
}
