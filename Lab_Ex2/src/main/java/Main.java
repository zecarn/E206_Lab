import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Empresa empresa = new Empresa();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a cnpj da empresa: ");
        empresa.cnpj = entrada.nextLine();

        System.out.println("Entre com o endereço da empresa: ");
        empresa.endereco = entrada.nextLine();

        for (int i = 0; i < 2; i++) {
            empresa.contatos[i] = new Contato();
            System.out.println("Informações do contato numero " + (i + 1) + ": ");

            System.out.println("Nome: ");
            empresa.contatos[i].nome = entrada.nextLine();

            System.out.println("Email: ");
            empresa.contatos[i].email = entrada.nextLine();

            System.out.println("Telefone: ");
            empresa.contatos[i].telefone = entrada.nextLine();

            System.out.println("Data de Nascimento: ");
            empresa.contatos[i].dataNascimento = entrada.nextLine();
        }

        empresa.exibirInfos();
    }

}
