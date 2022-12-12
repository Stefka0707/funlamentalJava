package finalExamPrep1;

import java.util.*;

public class NikuldaysMeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, List<String>> likedMeals = new HashMap<>();
        int unLikeMealsCounter = 0;
        while (!line.equals("Stop")) {
            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];
            if (type.equals("Like")) {
                //like -gosho-Shrimps
                //1 да вземем листа с ястия на Гошо и да видим дали ястието го има там
                //2.проверяваме дали Гошо е в списъка
                //3.Проверяваме дали Гошо вече има това ястие
                //4. да обновим ястията на Гошо
                //like meal
                List<String> guestMeals = likedMeals.get(guestName);
                //
                if (guestMeals == null) { // ако го няма името
                    guestMeals = new ArrayList<>();// ->създаваме нов списък за ястията
                    //// на госта, който гояма до сега в списъка
                    //може и така
                    // likedMeals.putIfAbsent(guestName,new ArrayList<>());
                }

                if (!guestMeals.contains(mealName)) {
                    guestMeals.add(mealName);
                }
                // обновяваме guestName с нови стия
                likedMeals.put(guestName, guestMeals);
            } else {
                //unlike mill
                //1.да роверим дали Гошо е дошъл
                //2.да вземем ястията на Гошо
                //3. да проверим в ястята на гошо дали това ястие е в списъка
                // ако Гошо това не го е ял
                //1)  инкрементирам брояча за нехаресани ястия
                //2) премахваме ястието от списъка на Гошо
                //3) обновяваме списъка на Гошо
                if (!likedMeals.containsKey(guestName)) {
                    System.out.printf("%s is not at the party%n", guestName);

                } else {
                    List<String> meals = likedMeals.get(guestName);
                    if (!meals.contains(mealName)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, mealName);
                    } else {
                        unLikeMealsCounter++;
                        System.out.printf("%s doesn't like the %s", guestName, mealName);
                        meals.remove(mealName);
                        likedMeals.put(guestName, meals); //обновяваме ястията
                    }
                }
            }

            line = scanner.nextLine();
        }
        //сортираме мапа
        //1 meal count кой има най много ястия , ако са с еднакъв
        // сортираме по азбучен ред на имената
        likedMeals.entrySet().stream().sorted((left, right) -> {
                    int res = right.getValue().size() - left.getValue().size();
                    if (res == 0){
                        return left.getKey().compareTo(right.getKey());
                    }else {
                        return res;
                    }

                }).forEach(e-> System.out.println(e.getKey() +": " + printlist(e.getValue())));
                //2
                System.out.println("Unliked meals: " + unLikeMealsCounter);
    }
    private static String  printlist(List<String> value){
        return  value.toString().replaceAll("[\\[\\]]","");
    }
}
