import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Введите первое число: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        System.out.printf("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.printf("Введите третье число: ");
        int num3 = in.nextInt();

        if ((num > num2) & (num > num3) ) {
            System.out.println("Первое число является максимальным:" + num);
        }
        if ((num2 > num3) & (num < num2)) {
            System.out.println("Второе число является максимальным:" + num2);
        }
        if ((num3 > num2) & (num < num3)) {
            System.out.println("Третье число является максимальным:" + num3);
        }
        else{
            System.out.println("Числа равны между собой!");
        }
        in.close();
    }
}