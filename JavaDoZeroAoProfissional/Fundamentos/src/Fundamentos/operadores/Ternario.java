package Fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 5.6;
        String resultadoFinal = media >= 7.0 ? "Aprovado" : "em recuperação";
        System.out.printf("O aluno está %s", resultadoFinal);

        double nota = 9.9;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;
        String resultado = temDesconto ? "sim" : "nao";

        System.out.printf("\nTem desconto ? %s", resultado);

    }
}
