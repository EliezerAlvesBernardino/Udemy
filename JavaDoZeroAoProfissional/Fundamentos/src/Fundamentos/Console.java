package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.println("Bom");
        System.out.println("dia!\n\n");

        System.out.println("Bom");
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d ", 1,2,3);

        Scanner sc = new Scanner(System.in);



        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        sc.close();


    }
}
