
//Вычислить сторону треуголника по теореме Пифагора

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Area_triangle {

    public static void main(String[] args) throws IOException {
        double a;
        double c;

        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите первый катет: ");
            a = in.nextDouble();
            System.out.print("Введите гипотенузу: ");
            c = in.nextDouble();
        }
        System.out.print("Сторона треугольника равна: "  + (Pythagoras_Theorem(a, c)));

        in.close();
    }

    public static double Pythagoras_Theorem(double a, double c) {
        return  Math.sqrt((c * c) - (a * a));
    }
}