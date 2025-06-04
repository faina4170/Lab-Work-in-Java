
//Читает с клавиатуры числа, пока не вводим отрицательное число, и
//        определяет произведение введенных чисел

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= 1;
        int number;

        do{
            System.out.print("Введите число: ");
            number = scanner.nextInt();

            n *= number;

        }while(number > 0);

        System.out.println(n);
        scanner.close(); // Закрываем Scanner
    }
}