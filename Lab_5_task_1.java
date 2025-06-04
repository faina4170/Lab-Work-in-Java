//Вычисляет среднее арифметическое значение элементов вектора

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        int sum = 0;

        int nums[];
        nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            sum += nums[i];
        }

        int avg = sum / n;
        System.out.println("Сумма элементов в массиве равна: " + sum);
        System.out.println("Среднее значение элементов в массиве: " + avg);
        scanner.close();
    }
}