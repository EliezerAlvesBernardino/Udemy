package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "Joel";
        c1.adcionarItem("caneta Azul", 10, 6.50);
        c1.adcionarItem(new Item("Caderno", 4, 9.99));
        c1.adcionarItem(new Item("Lápis", 2, 3.50));
        c1.adcionarItem(new Item("Borracha", 2, 2.50));

        System.out.println(c1.itens.size());
        System.out.println(c1.obeterValorTotal());

        // Apenas para mostrar a relação bidirecional !!!
        double total = c1.itens.get(0).compra.itens.get(1).compra.obeterValorTotal();
        System.out.println("O total é " + total);
    }
}
