package Controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ano;

        System.out.println("Digite um ano para saber se é bissexto: ");
        ano = sc.nextInt();

        if (ano % 400 == 0){
            System.out.printf("%d é Bissexto.", ano);
        }else if ((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.printf("%d é Bissexto.", ano);
        }else {
            System.out.printf("%d não é Bissexto.", ano);
        }
    }
}
