package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String string1 = sc.nextLine();
        System.out.println("Введите вторую строку:");
        String string2 = sc.nextLine();
        System.out.println("Введите третью строку:");
        String string3 = sc.nextLine();

        String[] stringArray = new String[] {string1, string2, string3};

        Arrays.sort(stringArray, Comparator.comparingInt(String::length));

        for (String string : stringArray) {
            System.out.println(string);
        }

        sc.close();
    }
}
