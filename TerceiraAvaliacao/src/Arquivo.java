import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arquivo {
    List<Jogo> jogos = new ArrayList<Jogo>();
    public void escrever(Jogo jogo){
        jogos.add(jogo);
    }
    public void ler(){
        System.out.println("Preços em ordem crescente: ");
        Collections.sort(jogos);
        System.out.println(jogos);

        System.out.println("\nPreços em ordem decrescente: ");
        Collections.sort(jogos, Collections.reverseOrder());
        System.out.println(jogos);
    }
}
