public class Main {
    public static void main(String[] args){

        Produto[] produto = new Produto[10];

        Notebook notebook1 = new Notebook("Acer", 3000.50, 32.00, "RTX 3050", "Intel Core7");
        Camiseta camiseta1 = new Camiseta("Abercrombie", 150.00, "Preta", "G");
        Notebook notebook2 = new Notebook("G5", 4500.00, 64.00, "RTX 3070", "Ryzen7");
        Camiseta camiseta2 = new Camiseta("Aeropostale", 100.00, "Azul", "P");

        produto[0] = notebook1;
        produto[1] = camiseta1;
        produto[2] = notebook2;
        produto[3] = camiseta2;

        for (int i = 0; i < produto.length; i++) {
            if(produto[i] != null){
                if(produto[i] instanceof Notebook){
                    Notebook notebook = (Notebook) produto[i];
                    notebook.etiquetaPreco();
                }
                else if(produto[i] instanceof Camiseta){
                    Camiseta camiseta = (Camiseta) produto[i];
                    camiseta.etiquetaPreco();
                }
            }

        }

    }
}
