import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Введите первое число: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;

        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        System.out.printf("Факториал числа: " + num + " " + "равен " + result);
        in.close();
    }
}

