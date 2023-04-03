package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcularBhaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Equação: ax2 + bx + c = 0");

        System.out.println("\nDigite o valor de A: ");
        int a = sc.nextInt();

        System.out.println("\nDigite o valor de B: ");
        int b = sc.nextInt();

        System.out.println("\nDigite o valor de C: ");
        int c = sc.nextInt();

        int delta = (b * b) - (4 * a * c);

        System.out.printf("\nSua equação é: %dx2 + %dx + %d = 0", a, b, c);

        System.out.println("\n O delta é : " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.printf("\nO x2 da equação é: %.2f", x2);

        sc.close();


    }
}
