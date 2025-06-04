//Вычисляет произведение нечетных чисел от 1 до n.

import java.util.Scanner;

public class HarmonicSeriesSumNoValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();

         int multiplication = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                multiplication *= i;
            }
        }
        System.out.println(multiplication);

        scanner.close();
    }
}