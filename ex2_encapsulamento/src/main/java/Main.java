public class Main {
    public static void main(String[] args){
        Conta conta = new Conta();

        conta.cliente1.setNome("João");
        conta.cliente1.setCpf(479657810);

        conta.cliente2.setNome("Maria");
        conta.cliente2.setCpf(848929656);

        conta.cliente3.setNome("Marcos");
        conta.cliente3.setCpf(123654789);

        conta.deposita(23.50);
        conta.extrato();

        conta.saca(10.20);
        conta.extrato();
    }
}
