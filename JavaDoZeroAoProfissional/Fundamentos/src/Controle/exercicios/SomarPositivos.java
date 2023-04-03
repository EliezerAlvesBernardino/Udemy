package Controle.exercicios;

import java.util.Scanner;

public class SomarPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaNumeros = 0;
        int num = 0;

        while (num >= 0){
            System.out.println("Digite um número inteiro (ou negativo para sair): ");
            num = sc.nextInt();
            if (num >= 0){
                somaNumeros += num;
                System.out.printf("\nA soma até o momento: %d ", somaNumeros);
            }
        }
        sc.close();
    }
}
