package dworniaczi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj! Zagrajmy w lotka. Podaj 6 liczb w zakresie 1 - 49.");
        String[] playerArray = new String[6];

            for (int i = 0; i < playerArray.length; i++) {
                System.out.println("Podaj liczbę");
                String input = scanner.next();
                try {
                    int num = Integer.parseInt(input);
                    if (num >= 1 && num <= 49) {
                        playerArray[i] = input;
                    } else {
                        System.out.println("Liczba spoza zakresu!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("To nie liczba!");
                }
            }
        System.out.println(Arrays.toString(playerArray));
        }
    }

