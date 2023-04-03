package Controle.exercicios;

import java.util.Scanner;

public class CalcularNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite a nota 1: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = sc.nextDouble();
        media = (n1 + n2) / 2;
        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media < 7.0 && media > 4) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}
