public class Guerreiro extends Personagem{
    private Arma arma;
    public Guerreiro(String nome, int vida, int energia, int poder, String nomeArma, int danoArma){
        super(nome, vida, energia, poder);
        Arma armaGuerreiro = new Arma(nomeArma, danoArma);
        this.arma = armaGuerreiro;
    }
}
