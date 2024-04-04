public class Notebook extends Produto {
    private double armazenamento;
    private String gpu;
    private String processador;

    public double getArmazenamento(){
        return armazenamento;
    }
    public void setArmazenamento(double armazenamento){
        this.armazenamento = armazenamento;
    }
    public String getGpu(){
        return gpu;
    }
    public void setGpu(String gpu){
        this.gpu = gpu;
    }
    public String getProcessador(){
        return processador;
    }
    public void setProcessador(String processador){
        this.processador = processador;
    }

    public Notebook(String nome, double preco, double armazenamento, String gpu, String processador){
        this.setNome(nome);
        this.setPreco(preco);
        this.setArmazenamento(armazenamento);
        this.setGpu(gpu);
        this.setProcessador(processador);
    }
    @Override
    public void etiquetaPreco(){
        super.etiquetaPreco();
        System.out.println("Armazenamento do Notebook: " + armazenamento);
        System.out.println("GPU: " + gpu);
        System.out.println("Processador: " + processador);
    }
}
