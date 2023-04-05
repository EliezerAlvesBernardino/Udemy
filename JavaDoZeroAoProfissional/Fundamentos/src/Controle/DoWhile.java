package Controle;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = "por favor";

        do {
            System.out.println("Você precisa falar" + "\n as palavras mágicas...");
            System.out.println("Quer sair? ");
            texto = sc.nextLine();
        }while (!texto.equalsIgnoreCase("por favor"));
        System.out.println("Obrigado!");
        sc.close();



    }
}
