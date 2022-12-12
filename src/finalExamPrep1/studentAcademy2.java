package finalExamPrep1;

import java.util.*;

public class studentAcademy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrate = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            String name = scanner.nextLine();
            double grate = Double.parseDouble(scanner.nextLine());
            //1. да не е записан
            if (!studentsGrate.containsKey(name)) {
                studentsGrate.put(name, new ArrayList<>());

            }
            // 2. да е записан
            studentsGrate.get(name).add(grate);
        }
        Map<String, Double> averageGradeStudents = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry:
        studentsGrate.entrySet()){
            List<Double> listGrades = entry.getValue();
            double averageGrade = getAverageGrade(listGrades);

        }


    }
    private  static double getAverageGrade (List<Double> listGrades){
       double sumGrade = 0;
       for (double grade :listGrades){
           sumGrade +=grade;
       }
       return sumGrade / listGrades.size();

    }
}
