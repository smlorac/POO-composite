package Aula22;

public class Retangulo extends Figura{

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }


    @Override
    public double calcularArea() {
        return altura * largura;
    }
}
