package Aula22;

import java.util.ArrayList;

public class Trem {

    private ArrayList<Figura> listaFiguras = new ArrayList<>();

    public Trem() {
    }

    public void addFigura(Figura f){
        listaFiguras.add(f);
    }

    public double superficieTotal(){
        double total = 0;
        for (Figura figura: listaFiguras){
            total += figura.calcularArea();
        }
        return total;
    }
}
