package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Лихачи на всех начихали", "Мир удобен", "Аргентина манит негра",
                "Учуя молоко я около мяучу", "Лёша на полке клопа нашёл"};

        Scanner sc = new Scanner(System.in);
        int stringNumber;

        while (true) {
            System.out.println("Введите номер строки (от 1 до " + strings.length + ")");

            if (sc.hasNextInt()) {
                stringNumber = sc.nextInt();

                if (stringNumber >= 1 && stringNumber <= strings.length) {
                    break;
                } else {
                    System.out.println("Номер должен быть от 1 до " + strings.length);
                }
            } else {
                System.out.println("Вы ввели не цифру, введите цифру");
                sc.next();
            }
        }

        String palindrome = strings[stringNumber - 1].replaceAll(" ", "").toLowerCase();

        for (int i = 1; i < palindrome.length() / 2; i++) {
            char[] chars = palindrome.toCharArray();
            if (chars[i] != chars[palindrome.length() - i - 1]) {
                System.out.println("Строка не является палиндромом");
                return;
            }
        }

        System.out.println("Строка является палиндромом");

        sc.close();
    }
}
