package Fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;

        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.printf("O resultado é %.1f C.\n",celsius);

        fahrenheit = 0;
        celsius = (fahrenheit - AJUSTE) * FATOR;
        System.out.printf("O resultado é %.2f C.", celsius);
    }
}
