public class Mago extends Personagem{
    @Override
    public void usarHabilidade(){
        System.out.println("O Mago está usando sua habilidade mágica");
    }
    public Mago(String nome, int vida, int energia, int poder){
        super(nome, vida, energia, poder);
    }
}
