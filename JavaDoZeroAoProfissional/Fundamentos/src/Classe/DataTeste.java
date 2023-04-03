package Classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data();


        Data data2 = new Data(31, 4,2011);

        String dataFormatada = data1.obterDataFormatada();

        System.out.printf(data1.obterDataFormatada());
        System.out.printf(data2.obterDataFormatada());

        data1.imprimirDataFormatada();
        data2.imprimirDataFormatada();

    }
}
