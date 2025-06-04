//Вычисляет сумму цифр числа.

import java.util.Scanner;

public class HarmonicSeriesSumNoValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();

         int sum = 0;

       while (n > 0) {
           sum += n % 10; //Получение последней цифры
           n /= 10; // Удаление последней цифры


       }
        System.out.println("Сумма цифр числа: " + sum);

        scanner.close();
    }
}