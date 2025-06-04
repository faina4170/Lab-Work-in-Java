//* Вычисление n - го числа Фибоначчи

public class FibonacciIterative {

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N не может быть отрицательным.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long a = 0; // F(0)
        long b = 1; // F(1)
        long result = 0;

        // Начинаем с i = 2, так как F(0) и F(1) уже известны
        for (int i = 2; i <= n; i++) {
            result = a + b; // Текущее число Фибоначчи
            a = b;          // Обновляем a до предыдущего значения b
            b = result;     // Обновляем b до текущего результата
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Итеративный метод:");
        System.out.println("Число Фибоначчи для n=" + n + " равно: " + fibonacci(n));

        n = 50; // Итеративный метод очень быстр для больших n
        System.out.println("Число Фибоначчи для n=" + n + " равно: " + fibonacci(n));

        n = 90; // Тип long может вместить до F(92) примерно
        System.out.println("Число Фибоначчи для n=" + n + " равно: " + fibonacci(n));
    }
}