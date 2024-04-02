import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Restaurante restaurante = new Restaurante();

        Scanner entrada = new Scanner(System.in);

        String novo;

        System.out.println("Informações do restaurante: ");
        System.out.print("Cnpj: ");
        restaurante.cnpj = entrada.nextLine();
        System.out.print("Endereço: ");
        restaurante.endereco = entrada.nextLine();
        System.out.print("Nome: ");
        restaurante.nome = entrada.nextLine();

        for (int i = 0; i < restaurante.fornecedor.length; i++) {
            System.out.println("Digite 'new' para inserir um novo fornecedor: ");
            novo = entrada.nextLine();

            if(novo == "new"){
                restaurante.fornecedor[i] = new Fornecedor();
                System.out.println("Para fornecedor " + (i+1) + " insira:");

                System.out.print("Tipo: ");
                restaurante.fornecedor[i].tipo = entrada.nextLine();

                System.out.print("Quantidade: ");
                restaurante.fornecedor[i].quantidade = entrada.nextInt();
            }
            else{
                i = restaurante.fornecedor.length;
            }
        }

        restaurante.exibirInfos();

    }
}
