import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Введите число x:");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.printf("Значение функции:" + ((Math.sin(num) + 2 * num)/ ((num * num * num)-2 * num)));
        in.close();

    }
}