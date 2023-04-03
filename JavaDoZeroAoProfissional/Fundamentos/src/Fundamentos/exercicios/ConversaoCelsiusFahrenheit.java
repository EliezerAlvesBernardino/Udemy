package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double Fahrenheit, Celsius;
        System.out.println("Conversor de Graus <>\nConversão de Celsius para Fahrenheit");
        System.out.println("Celsius = ");
        Celsius = sc.nextDouble();
        Fahrenheit = (Celsius * 1.8) + 32;
        System.out.printf("Fahrenheit = %.1f", Fahrenheit);

    }
}
