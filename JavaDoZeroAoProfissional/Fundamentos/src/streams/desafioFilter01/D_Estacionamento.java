package streams.desafioFilter01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class D_Estacionamento {
    public static void main(String[] args) {

        D_Carro carro1 = new D_Carro("Gol", "branco", 2009, true);
        D_Carro carro2 = new D_Carro("Uno", "Vermelho", 2006, true);
        D_Carro carro3 = new D_Carro("Fiesta", "cinza", 2010, true);
        D_Carro carro4 = new D_Carro("Palio", "preto", 2012, true);
        D_Carro carro5 = new D_Carro("Civic", "cinza", 2013, false);

        List<D_Carro> carros = Arrays.asList(carro1, carro2, carro3, carro4, carro5);

        Predicate<D_Carro> estacionado = e -> e.vaga == true;
        Predicate<D_Carro> ano = a -> a.ano >= 2010;
        Function<D_Carro, String> status = s -> "O " + s.nome + " está estacionado!";

        carros.stream()
                .filter(estacionado)
                .filter(ano)
                .map(status)
                .forEach(System.out::println);
    }
}
