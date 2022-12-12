package finalExamPreparation1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesofCodeandLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> heroesMp = new TreeMap<>();
        Map<String, Integer> heroesHp = new TreeMap<>();
//   TreeMap - сортира още от началото по азбучен ред / по ключ- асендинг ордер
        for (int i = 1; i <= n; i++) {
            String data = scanner.nextLine();
            String[] splitData = data.split("\\s+");
            String heroName = splitData[0];
            int hp = Integer.parseInt(splitData[1]);
            int mp = Integer.parseInt(splitData[2]);

            if (hp <= 100) {
                heroesHp.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMp.put(heroName, mp);
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] commandParameters = command.split(" - ");
            String commandName = commandParameters[0];
            String heroName = commandParameters[1];
            switch (commandName) {

                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParameters[2]);
                    String spellName = commandParameters[3];
                    int currentMp = heroesMp.get(heroName);
                    if (currentMp >= mpNeeded) {
                        int mpLeft = currentMp - mpNeeded;
                        heroesMp.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMp - mpNeeded);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damagge = Integer.parseInt(commandParameters[2]);
                    String attacer = commandParameters[3];
                    int currentHp = heroesHp.get(heroName);
                    int leftHp = currentHp - damagge;
                    if (leftHp > 0) {
                        heroesHp.put(heroName, leftHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damagge, attacer, leftHp);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacer);
                        heroesHp.remove(heroName);
                        heroesMp.remove(heroName);
                    }
                    break;

                case "Recharge":
                    int amountRecharge = Integer.parseInt(commandParameters[2]);
                    int currentMpForRecharge = heroesMp.get(heroName);
                    int increaseMp = currentMpForRecharge + amountRecharge;
                    if (increaseMp > 200) {
                        increaseMp = 200;
                    }
                    heroesMp.put(heroName, increaseMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increaseMp - currentMpForRecharge);
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(commandParameters[2]);
                    int currentHealHP = heroesHp.get(heroName);
                    int increaseHealHp = currentHealHP + amountHeal;
                    if (increaseHealHp > 100) {
                        increaseHealHp = 100;

                    }
                    heroesHp.put(heroName, increaseHealHp);
                    System.out.printf("%s healed for %d HP!%n", heroName, increaseHealHp - currentHealHP);
                    break;
            }
            command = scanner.nextLine();
        }

        heroesHp.entrySet().stream().sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(heroEntry -> {
                    String heroName = heroEntry.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + heroEntry.getValue());
                    System.out.println("  MP: " + heroesMp.get(heroName));

                });
    }
}
