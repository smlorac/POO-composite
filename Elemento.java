package Aula22;

import java.util.ArrayList;

public class Elemento extends Figura{

    private ArrayList<Figura> listaFiguras = new ArrayList<>();

    public Elemento(String nome) {
        super(nome);
    }

    @Override
    public double calcularArea() {
        double total = 0;
        for (Figura figura: listaFiguras){
            total += figura.calcularArea();
        }
        return total;
    }

    public void inserirFigura(Figura f){
        listaFiguras.add(f);
    }

}
