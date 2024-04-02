public class Empresa {
    String cnpj;
    String endereco;

    Contato[] contatos = new Contato[2];

    void exibirInfos(){
        for (int i = 0; i < contatos.length; i++) {
            System.out.println("Contato numero " + (i + 1) + ":");
            System.out.println("Nome: " + contatos[i].nome);
            System.out.println("Email: " + contatos[i].email);
            System.out.println("Telefone: " + contatos[i].telefone);
            System.out.println("Data de nascimento: " + contatos[i].dataNascimento);
        }
    }

}
