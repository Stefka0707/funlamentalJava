package artikcles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleData = scanner.nextLine();
        String[] articlePartsArr = articleData.split(", ");
        String title = articlePartsArr[0];
        String content = articlePartsArr[1];
        String author = articlePartsArr[2];

        Article articles = new Article(title,content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=n ; i++) {
            String command = scanner.nextLine();
            if (command.contains("Edit")){
                String newContent = command.split(": ")[1];
                        articles.edit(newContent);

            }else if (command.contains("Rename")){
                String newTitle = command.split(": ")[1];
                articles.rename(newTitle);
            }else if (command.contains("ChangeAuthor")){
                String newAuthor = command.split(": ")[1];
                articles.changeAuthor(newAuthor);
            }
        }
            System.out.println(articles.toString());

    }
}
