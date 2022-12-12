package exerciseTextProcessing;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String path = scanner.nextLine();
        String[] pathPart = path.split("\\\\");
        String fullFileName = pathPart[pathPart.length - 1];

        String fileName = fullFileName.split("\\.")[0];
        String extersion = fullFileName.split("\\.")[1];

        System.out.println("File name: "+ fileName);
        System.out.println("File extension: "+extersion);

    }
}
