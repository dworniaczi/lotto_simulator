package dworniaczi;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! Zagrajmy w lotka. Podaj 6 liczb w zakresie 1 - 49.");
        List<Integer> playerList = new ArrayList<>(6);

        for (int i = 0; i < 6;) {
            System.out.println("Podaj liczbę");
            String input = scanner.next();
            try {
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 49) {
                    if (!playerList.contains(num)) {
                        playerList.add(num);
                        i++;
                    } else {
                        System.out.println("Liczby nie mogą się powtarzać!");
                    }
                } else {
                    System.out.println("Liczba spoza zakresu!");
                }
            } catch (NumberFormatException e) {
                System.out.println("To nie liczba!");
            }
        }
        Collections.sort(playerList);
        System.out.println(playerList);

        Random random = new Random();
        List<Integer> computerList = new ArrayList<Integer>(6);
        for (int i = 0; i < 6;) {
            int randomNum = random.nextInt(50) + 1;
            if (!computerList.contains(randomNum)) {
                computerList.add(randomNum);
                i++;
            }
        }
        System.out.println(computerList);


    }
}


