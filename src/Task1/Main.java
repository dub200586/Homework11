package Task1;

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
        String maxString = "";
        String minString = stringArray[0];

        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].length() > maxString.length()) {
                maxString = stringArray[i];
            }
            if (stringArray[i].length() < minString.length()) {
                minString = stringArray[i];
            }
        }

        System.out.println("Самая длинная строка размером " + maxString.length() + ":");
        System.out.println(maxString);
        System.out.println("Самая короткая строка размером " + minString.length() + ":");
        System.out.println(minString);

        sc.close();
    }
}
