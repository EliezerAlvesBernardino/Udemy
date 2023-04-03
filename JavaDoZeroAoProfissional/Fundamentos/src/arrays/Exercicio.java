package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double [] notasAlunaA = new double [3];
        System.out.println(Arrays.toString(notasAlunaA));
        notasAlunaA[0] = 7.9;
        notasAlunaA[1] = 8;
        notasAlunaA[2] = 6.7;

        System.out.println(Arrays.toString(notasAlunaA));
        System.out.println(notasAlunaA[notasAlunaA.length - 1]); // ultima posição do Array

        double total = 0;
        for (int i = 0; i < notasAlunaA.length; i++){
            total += notasAlunaA[i];
        }
        System.out.println(total/ notasAlunaA.length);

        double[] notasAlunoB = {6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++){
            totalAlunoB += notasAlunoB[i];
        }
        System.out.println(totalAlunoB / notasAlunoB.length);

    }
}
