package Aula22;

public class Circulo extends Figura{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return raio * raio * Math.PI;
    }
}
