public class Main {
    public static void main(String[] args){
        Personagem assassino = new Assassino("Creed", 100, 50, 70, "Sniper", 30);
        Personagem mago = new Mago("Voldemort", 100, 70, 100);
        Personagem guerreiro = new Guerreiro("Aquiles", 100, 90, 50, "Espada", 30);

        assassino.usarHabilidade();
        mago.usarHabilidade();
        guerreiro.usarHabilidade();

        
    }
}
