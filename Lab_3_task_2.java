//Вычисляет сумму последовательности: 1+1/2+1/3+1/4+...+1/n

import java.util.Scanner;

public class HarmonicSeriesSumNoValidation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число n: ");
        int n = scanner.nextInt();

        double sum = 0.0; // Используем double для точного результата

        // Цикл для вычисления суммы
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i; // Делим 1.0 на i, чтобы получить дробный результат
        }

        System.out.println("Сумма последовательности до n=" + n + " равна: " + sum);

        scanner.close();
    }
}