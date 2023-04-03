package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double media;

        System.out.print("Quantas notas deseja informar: ");
        n = sc.nextInt();

        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\nDigita a %d nota : ", i + 1);
            notas[i] = sc.nextDouble();
        }

        double soma = 0;
        int cont = 0;

        for (double nota : notas) {
            soma += nota;
            cont++;
        }
        media = soma / cont;
        System.out.println("As suas notas são: " + Arrays.toString(notas));
        System.out.printf("A sua media é %.2f", media);
    }
}
