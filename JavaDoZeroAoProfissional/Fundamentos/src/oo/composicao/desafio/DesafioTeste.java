package oo.composicao.desafio;

public class DesafioTeste {
    public static void main(String[] args) {



        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.00, 100);
        compra1.adicionarItem(new Produto("Notebook", 4600.00), 2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lápis", 3.00, 10);
        compra2.adicionarItem(new Produto("Tv", 5800.00), 1);

        Cliente cliente =  new Cliente("Maria");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());



    }
}
