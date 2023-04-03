package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidadeNotas = 0;
        double notas = 0;
        double total = 0;

        while (notas != -1){
            System.out.println("Informe a nota (ou -1 p/ sair) : ");
            notas = sc.nextDouble();
            if (notas <= 10 && notas >= 0){
                total += notas;
                quantidadeNotas++;
            }else if (notas != -1){
                System.out.println("Nota inválida!!");
            }
        }
        double media = total / quantidadeNotas;
        System.out.printf("Média: %.1f", media);

        sc.close();
    }
}
