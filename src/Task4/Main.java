package Task4;

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

        String[] stringArray1 = string1.split(" ");
        String[] stringArray2 = string2.split(" ");
        String[] stringArray3 = string3.split(" ");

        String[] stringArray = new String[stringArray1.length + stringArray2.length + stringArray3.length];
        int count = 0;

        for (int i = 0; i < stringArray1.length; i++) {
            stringArray[i] = stringArray1[i];
            count++;
        }

        for (String s : stringArray2) {
            stringArray[count++] = s;
        }

        for (String s : stringArray3) {
            stringArray[count++] = s;
        }

        for (String string : stringArray) {
            if (hasUniqueChars(string)) {
                System.out.println("Слово с уникальными символами: " + string);
                break;
            }
        }

        sc.close();
    }

    private static boolean hasUniqueChars(String string) {
            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < string.length(); j++) {
                    if (string.charAt(i) == string.charAt(j) && i !=j) {
                        return false;
                    }
                }
            }
        return true;
    }
}
