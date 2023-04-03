package Controle.exercicios;

import java.util.Scanner;

public class IdentificarPrimoSwitch {
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

        switch (contadorDeDivisores){
            case 0:
                System.out.printf("O número %d é primo", numero);
                break;
            default:
                System.out.printf("O numero %d não é primo", numero);
        }


        sc.close();
    }
}
