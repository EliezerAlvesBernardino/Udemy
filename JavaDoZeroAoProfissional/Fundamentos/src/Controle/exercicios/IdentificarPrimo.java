package Controle.exercicios;

import java.util.Scanner;

public class IdentificarPrimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       int contadorDeDivisores = 0;

        System.out.println("\nDigite um numero para verificar se é primo: ");
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++){
            if (numero % i == 0){
                contadorDeDivisores++;
            }
        }
        if (contadorDeDivisores == 0){
            System.out.printf("\nO número %d é primo", numero);
        }else {
            System.out.printf("\nO número %d não é primo.", numero);
        }
        sc.close();
    }
}
