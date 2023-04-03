package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcularQuadradoCubo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num, numQuadrado, numCubo;
        System.out.println("Seja bem vindo meu Chapa :-)");
        System.out.println("Digite um número para obter o valor ao quadrado e ao cubo do mesmo: ");
        num = sc.nextDouble();
        numQuadrado = Math.pow(num, 2);
        numCubo = Math.pow(num, 3);
        System.out.printf("O valor de %.2f ao quadrado é %.2f e ao cubo é %.2f ", num, numQuadrado, numCubo);
    }
}
