package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String string = sc.nextLine();

        StringBuilder doubleWord = new StringBuilder();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = string.charAt(i);
            doubleWord.append(c).append(c);
        }

        System.out.println("Слово с дублированными символами: " + doubleWord);
    }
}
