package Task3;

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
        int sum = 0;

        for (String s : stringArray) {
            sum += s.length();
        }

        int averageLength = sum / stringArray.length;

        System.out.println("Строки длина которых меньше средней длины всех строк:");

        for (String s : stringArray) {
            if (s.length() < averageLength) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
