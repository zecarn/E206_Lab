import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogo jogo1 = new Jogo("FIFA", 150.0, "Esporte");
        Jogo jogo2 = new Jogo("Minecraft", 100.0, "Arcade");
        Jogo jogo3 = new Jogo("GTA", 200.0, "RPG");

        InputStream fluxoEntrada = null;
        InputStreamReader leitorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;
        String linha = null;
        try {
            fluxoEntrada = new FileInputStream("d:\\Workspaces\\Netbeans\\log.txt");
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);
            linha = bufferEntrada.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = bufferEntrada.readLine();
            }
        } catch (FileNotFoundException ex){
            System.err.printf("FileNotFounfException: %s.%n", ex);
        } catch (IOException ex){
            System.err.printf("IOException: %s.%n");
        } finally {
            try {
                bufferEntrada.close();
            } catch (IOException ex){
                System.err.printf("IOException: %s.%n", ex);
            }
        }


        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        try {
            fluxoSaida = new FileOutputStream("d:\\Workspaces\\Netbeans\\log.txt", true);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            linha = "Vamos gerar uma nova informação e salvar no arquivo...";
            bufferSaida.write(linha);
            bufferSaida.newLine();
        } catch (FileNotFoundException ex){
            System.err.printf("FileNotFoundException: %s.%n", ex);
        } catch (IOException ex){
            System.err.printf("IOException: %s.%n", ex);
        } finally {
            try {
                bufferSaida.close();
            } catch (IOException ex){
                System.err.printf("IOException: %S.%n", ex);
            }
        }
    }
}