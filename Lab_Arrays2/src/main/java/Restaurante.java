public class Restaurante {
    String cnpj;
    String endereco;
    String nome;

    Fornecedor[] fornecedor = new Fornecedor[10];

    void exibirInfos(){
        System.out.println("Informações do restaurante: ");
        System.out.println("Cnpj: " + cnpj);
        System.out.println("Endereço: " + endereco);
        System.out.println("Nome: " + nome);

        for (int i = 0; i < fornecedor.length; i++) {
            if(fornecedor[i] != null){
                System.out.println("Dados do fornecedor " + (i+1) + ":");
                System.out.println("Tipo: " + fornecedor[i].tipo);
                System.out.println("Quantidade: " + fornecedor[i].quantidade);
            }
        }
    }
}
