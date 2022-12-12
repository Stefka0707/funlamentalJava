package Articles2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

        articles2.Articles articles = new articles2.Articles(title, content, author);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(": ");
            String command = input[0];
            switch (command) {
                case "Edit":
                    articles.editContent(input[1]);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(input[1]);
                    break;
                case "Rename":
                    articles.renameTitle(input[1]);
                    break;
            }

        }
        System.out.println(articles.toString());

    }
}
