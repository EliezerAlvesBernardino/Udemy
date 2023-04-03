package Controle.exercicios;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 0 && num <= 10){
            if (num % 2 == 0){
                System.out.printf("O número %d está entre 0 e 10 e é par!", num);
            }else {
                System.out.printf("O número %d está entre 0 e 10 e é impar! ", num);
            }
        }else {
            System.out.printf("O numero %d não está entre 0 e 10", num);
        }
    }
}
