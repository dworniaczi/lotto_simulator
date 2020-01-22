package dworniaczi;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! Zagrajmy w lotka. Podaj 6 liczb w zakresie 1 - 49.");
        List<String> playerArray = new ArrayList<String>(6);

        for (int i = 0; i < 6;) {
            System.out.println("Podaj liczbę");
            String input = scanner.next();
            try {
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 49) {
                    if (!playerArray.contains(input)) {
                        playerArray.add(input);
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
            System.out.println(playerArray);
        }
    }
}


