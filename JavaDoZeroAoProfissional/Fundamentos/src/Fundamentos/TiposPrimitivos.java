package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionario


        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3134845223L;

        // Tipos numéricos reais
        float salario = 11445.44F;
        double VendasAcumuladas = 2991797103.01;

        //Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Numero de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / VendasAcumuladas);
        System.out.printf("%d : ganha -> %.2f\n", id, salario);
        System.out.printf("Férias ? %b \n", estaDeFerias);
        System.out.printf("Status: %c", status);
    }
}
