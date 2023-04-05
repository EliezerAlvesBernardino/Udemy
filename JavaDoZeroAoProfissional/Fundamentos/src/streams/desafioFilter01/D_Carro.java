package streams.desafioFilter01;

public class D_Carro {

    final String nome;
    final String cor;
    final int ano;
    final boolean vaga;

    public D_Carro(String nome, String cor, int ano, boolean vaga) {
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.vaga = vaga;
    }

    @Override
    public String toString() {
        return "D_Carro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", vaga=" + vaga +
                '}';
    }
}
