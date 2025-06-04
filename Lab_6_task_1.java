//Определяет, если буква «а» содержится в строке.

import java.util.Scanner;

public class ContainsA {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str1= scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < str1.length(); i++) {
            if ((str1.charAt(i) == 'a') || ((str1.charAt(i) == 'а')) || ((str1.charAt(i) == 'A')) || ((str1.charAt(i) == 'А'))) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Буква 'a' содержится в строке.");
        } else {
            System.out.println("Буква 'a' НЕ содержится в строке.");
        }

    }
}