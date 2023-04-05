package streams.desafioFilter02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta Azul", 3000, 0.35, 0);
        Produto p2 = new Produto("Caderno", 70, 0.15, 25.00);
        Produto p3 = new Produto("Borracha", 1500, 0.45, 18.00);
        Produto p4 = new Produto("Mochila", 99.00, 0.30, 0);
        Produto p5 = new Produto("sapato", 850.00, 0.30, 0);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        Predicate<Produto> desconto = d -> d.desconto >= 0.30;
        Predicate<Produto> freteGratis = f -> f.valorFrete == 0;
        Predicate<Produto> produtoRelevante = p -> p.preco >= 500;

        Function<Produto, String> chamadaPromocional = p -> "Aporveite " + p.nome + " por R$ " + p.preco;

        produtos.stream()
                .filter(desconto)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);





    }
}
