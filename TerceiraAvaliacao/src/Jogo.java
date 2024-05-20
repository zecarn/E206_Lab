import java.util.List;

public class Jogo implements Comparable<Jogo> {
    private String nome;
    private double preco;
    private String genero;

    public double getPreco() {
        return preco;
    }

    public Jogo(String nome, double preco, String genero){
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    @Override
    public int compareTo(Jogo o) {
        if (this.preco < o.getPreco()){
            return -1;
        }
        if (this.preco > o.getPreco()){
            return 1;
        }
        return 0;
    }
}
