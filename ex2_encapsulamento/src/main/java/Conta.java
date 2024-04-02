public class Conta {
    private int qtdClientes = 0;
    private double saldo = 0.00;
    Cliente cliente1 = new Cliente();
    Cliente cliente2 = new Cliente();
    Cliente cliente3 = new Cliente();

    public Conta(){
        qtdClientes++;
    }
    public void deposita(double valor){
        saldo = saldo + valor;
    }
    public void saca(double valor){
        saldo = saldo - valor;
    }
    public void extrato(){
        System.out.println("Saldo disponível: " + saldo);
    }
}
