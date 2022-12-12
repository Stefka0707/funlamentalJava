package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            //1 вариант струдента да не е запиан
            if (!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());

            }
            // 2 вариант студентът да е записан
            studentsGrade.get(name).add(grade);


            //имаме списък с име на студента - > списък с неговите оценки

        }
        // записи : име на студента(KEY) -> средната оценка(Value)
        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsGrade.entrySet()) {
            // entry:(key) име на студента -> (value) списък с оценки
            String  studentName = entry.getKey();//името на студента
            List<Double> listGrades = entry.getValue();// списък с оценки за всеки студент
            double averageGrade = getAverageGrade(listGrades);
            //студент  - > списък с оценките  - > средна аритметична оценка
            if (averageGrade >=4.50){
                averageGradeStudents.put(studentName,averageGrade);
            }
        }
        // отпечатваме студента -> averageGradeStudent
        // entry: name (key) -> averageGrade(value)
        averageGradeStudents.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
    private static double getAverageGrade(List<Double> listGrades){
        //ср.аритметично = сбора от оценките и го делим на броя
    double sumGrades = 0;
        for (double grade: listGrades) {
            sumGrades +=grade;


        }
        return sumGrades / listGrades.size();
    }


    }

