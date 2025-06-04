//Сумма элементов в массиве
//Двумерный массив


import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк в массиве: ");
        int n = scanner.nextInt();

        System.out.print("Введите количество столбцов в массиве: ");
        int m = scanner.nextInt();

        int[][] twoDimArray = new int[n][m];
        int totalSum = 0;

        // --- Ввод элементов массива ---
        System.out.println("Введите элементы массива (" + n + "x" + m + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Элемент [" + i + "][" + j + "]: "); // Подсказка для пользователя
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        // --- Вывод матрицы на экран ---
        System.out.println("\n--- Ваша матрица ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // System.out.print() выводит элемент без перехода на новую строку
                // Добавляем пробел для разделения элементов
                System.out.print(twoDimArray[i][j] + "\t"); // \t добавляет табуляцию для выравнивания
            }

            System.out.println(); // После каждой строки матрицы переходим на новую строку
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

//               подсчет суммы элементов в массиве
                totalSum += twoDimArray[i][j];
            }

        }
        System.out.println("Сумма элементов в массиве равна: " + totalSum);

        scanner.close();
    }
}