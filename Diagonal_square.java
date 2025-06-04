
//Вычисляет диагональ квадрата со стороной a

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Diagonal_square {

    public static void main(String[] args) throws IOException {
        int a;
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите сторону квадрата: ");
            a = in.nextInt();
        }
        System.out.print("Диагональ квадрата со стороной " + a + " равна: " + (Diagonal(a)));

        in.close();
    }

    public static double Diagonal(int a){
        return a * Math.sqrt(2);
    }
}