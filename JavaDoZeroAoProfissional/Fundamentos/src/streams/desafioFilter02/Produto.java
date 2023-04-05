package streams.desafioFilter02;

public class Produto {

    final String nome;
    final double preco;
    final double desconto;
    final double valorFrete;

    public Produto(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", desconto=" + desconto +
                ", valorFrete=" + valorFrete +
                '}';
    }
}
