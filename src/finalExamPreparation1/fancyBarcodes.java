package finalExamPreparation1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "@#+(?<productName>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            //проверка дали е валиден
            // ако е валиден тръсим продуктовата група
            Matcher matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                //валиден
                String productName = matcher.group("productName");
                StringBuilder productNumber = new StringBuilder();
                for (int j =1; j <productName.length(); j++) {
                    char currentSymbol = productName.charAt(j);
                    if (Character.isDigit(currentSymbol)) {
                        productNumber.append(currentSymbol);
                    }
                }
                //отпечатваме продуктномера
                if (productNumber.toString().equals("")) {
                    System.out.println("Product group: 00");
                } else{
                    System.out.printf("Product group: %s%n", productNumber);
            }
        }
        else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
