package AdvertisementMessage;

import java.util.Random;
import java.util.Scanner;

public class Advertisement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            Massage massage = new Massage();
            for (int i = 0; i <n ; i++) {

            System.out.println(massage.randomMassage());
            }

        }
    static class Massage {
        String[] phrases = {"Excellent product.", "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."};
        String[] event ={"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};
        String[] authors  = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
       Random random = new Random();
        public String randomMassage() {
            return String.format( "%s %s %s - %s",phrases[random.nextInt(phrases.length)],
                    event[random.nextInt(event.length)],
                    authors[random.nextInt(authors.length)],
                    cities[random.nextInt(cities.length)]);
        }

    }
}
