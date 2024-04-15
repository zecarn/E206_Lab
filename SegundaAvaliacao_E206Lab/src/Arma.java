public class Arma{
    private String nome;
    private int dano;

    public String getNome(){
        return nome;
    }
    public int getDano(){
        return dano;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDano(int dano){
        this.dano = dano;
    }

    public Arma(String nome, int dano){
        this.nome = nome;
        this.dano = dano;
    }
}
