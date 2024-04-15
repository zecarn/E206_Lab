public class Assassino extends Personagem{
    private Arma arma;
    public Assassino(String nome, int vida, int energia, int poder, String nomeArma, int danoArma){
        super(nome, vida, energia, poder);
        Arma armaAssassino = new Arma(nomeArma, danoArma);
        this.arma = armaAssassino;
    }

}
