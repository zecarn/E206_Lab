public class Camiseta extends Produto{
    private String cor;
    private String tamanho;
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getTamanho(){
        return  tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public Camiseta(String nome, double preco, String cor, String tamanho){
        this.setNome(nome);
        this.setPreco(preco);
        this.setCor(cor);
        this.setTamanho(tamanho);
    }
    @Override
    public void etiquetaPreco(){
        super.etiquetaPreco();
        System.out.println("Cor da Camiseta: " + cor);
        System.out.println("Tamanho: " + tamanho);
    }


}
