package finalExamPrep1;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());


        Map<String, List<String>> pieceMap = new TreeMap<>();


        for (int i = 0; i <n; i++) {
            String[] pieceName = scanner.nextLine().split("\\|");
            String onePiece = pieceName[0];
            String compositor = pieceName[1];
            String key = pieceName[2];
            pieceMap.put(onePiece, new ArrayList<>());
            pieceMap.get(onePiece).add(compositor);
            pieceMap.get(onePiece).add(key);

        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandName = input.split("\\|");
            String command = commandName[0];
            String pieceName1 = commandName[1];

            switch (command) {
                case "Add":
                        String compositorName = commandName[2];
                        String keyName = commandName[3];
                    if (pieceMap.containsKey(pieceName1)) {
                        System.out.printf("%s is already in the collection!", pieceName1);
                    } else if (!pieceMap.containsKey(pieceName1)) {

                        pieceMap.put(pieceName1, new ArrayList<>());
                        pieceMap.get(pieceName1).add(compositorName);
                        pieceMap.get(pieceName1).add(keyName);
                        System.out.printf("%s by %s in %s added to the collection!%n", pieceName1, compositorName, keyName);
                    }
                    break;

                case "Remove":
                    if (pieceMap.containsKey(pieceName1)) {
                        pieceMap.remove(pieceName1);
                        System.out.printf("Successfully removed %s!%n", pieceName1);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName1);
                    }
                    break;

                case "ChangeKey":
                    String newKey = commandName[2];

                    if (pieceMap.containsKey(pieceName1)) {
                        pieceMap.get(pieceName1).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", pieceName1, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceName1);
                    }

                    break;

            }
            input = scanner.nextLine();
        }
        pieceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(kvp -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));

    }
}
