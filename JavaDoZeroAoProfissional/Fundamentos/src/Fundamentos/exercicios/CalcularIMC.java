package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double peso, altura, imc;

        System.out.println("Bem vindo!\nDigite seu nome para calcular o IMC: ");
        nome = sc.nextLine();
        System.out.printf("%s Digite seu peso Kg: ", nome);
        peso = sc.nextDouble();
        System.out.printf("Agora %s digite sua altura: ", nome);
        altura = sc.nextDouble();

        imc = peso / Math.pow(altura, 2);
        System.out.printf("%s o seu IMC é : %.2f", nome, imc);
    }
}
