package Aula22;

public abstract class Figura {

    private String nome;

    public Figura(){}
    public Figura(String nome) {
        this.nome = nome;
    }

    public abstract double calcularArea();
}
