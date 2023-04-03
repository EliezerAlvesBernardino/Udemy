package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String salario1, salario2, salario3;

        System.out.println("Digite o 1 salario: ");
        salario1 = sc.next().replace(",",".");

        System.out.println("Digite o 2 salario: ");
        salario2 = sc.next().replace(",", ".");

        System.out.println("Digite o 3 salario: ");
        salario3 = sc.next().replace(",",".");

        double s1 = Double.parseDouble(salario1);
        double s2 = Double.parseDouble(salario2);
        double s3 = Double.parseDouble(salario3);
        double  media;
        media = (s1 + s2 + s3) / 3;

        System.out.printf("Média %.2f", media);
        sc.close();
    }
}
