package Fundamentos.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ConversaoFahrenheitparaCelsius {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double Fahrenheit, Celsius;

        // Conversão de FAHRENHEIT para CELSIUS
        System.out.println("Conversor de Graus <>\nConversão de FAHRENHEIT para CELSIUS");
        System.out.print("Fahrenheit = ");
        Fahrenheit = sc.nextDouble();
        Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.printf("Temperatura em Celsius: %.1f Graus", Celsius );




    }
}
