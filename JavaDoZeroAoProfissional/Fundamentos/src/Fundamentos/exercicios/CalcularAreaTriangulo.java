package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcularAreaTriangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Seja bem vindo Vamos calcular a área desse triângulo :-)");
        System.out.println("Digite a base do Triângulo: ");
        base = sc.nextDouble();
        System.out.println("Digite a altura desse triângulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.printf("A Área do Triângulo é %.2f", area);
    }
}
