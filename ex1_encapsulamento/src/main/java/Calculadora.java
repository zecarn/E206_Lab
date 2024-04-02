public class Calculadora {
    private double PI = 3.14;

    public double circunferencia(double raio){
        return PI * (raio*raio);
    }

    public double volume(double raio){
        return (4/3) * PI * (raio*raio*raio);
    }

}
