package Fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Digite um numero: ");
        n1 = sc.nextDouble();
        System.out.println("Digite outro valor: ");
        n2 = sc.nextDouble();
        System.out.println("Informe a operação: ");
        String op = sc.next();

        double resultado = "+".equals(op) ? n1 + n2 : 0;
        resultado = "-".equals(op) ? n1 - n2 : resultado;
        resultado = "*".equals(op) ? n1 * n2 : resultado;
        resultado = "/".equals(op) ? n1 / n2 : resultado;
        resultado = "%".equals(op) ? n1 / n2 : resultado;

        System.out.printf("\n%.2f  %s  %.2f = %.2f", n1, op, n2, resultado);

        sc.close();
    }
}
