public class Personagem {
    private String nome;
    private int vida;
    private int energia;
    private int poder;
    public void usarHabilidade(){
        System.out.println("Personagem " + this.nome + " está usando seu poder de " + this.poder + "!");
    }
    public Personagem(String nome, int vida, int energia, int poder){
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }
}
