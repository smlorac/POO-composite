package Aula22;

public class PrincipalMesa {
    public static void main(String[] args) {

        Trem t = new Trem();

        Figura retangulo = new Retangulo(5, 4);
        Figura circulo1 = new Circulo(1);
        Figura circulo2 = new Circulo(1);
        Figura circulo3 = new Circulo(1);
        Figura retangulo2 = new Retangulo(6, 4);
        Figura triangulo = new Triangulo(2, 2);

        Figura vagao = new Elemento("Vagão");
        ((Elemento)vagao).inserirFigura(retangulo);
        ((Elemento)vagao).inserirFigura(circulo1);
        ((Elemento)vagao).inserirFigura(circulo2);
        ((Elemento)vagao).inserirFigura(circulo3);

        Figura locomotiva = new Elemento("Locomotiva");
        ((Elemento)locomotiva).inserirFigura(retangulo2);
        ((Elemento)locomotiva).inserirFigura(circulo1);
        ((Elemento)locomotiva).inserirFigura(circulo2);
        ((Elemento)locomotiva).inserirFigura(triangulo);

        t.addFigura(vagao);
        t.addFigura(locomotiva);
        System.out.println("Superficie da locomotiva:");
        System.out.println(locomotiva.calcularArea());
        System.out.println("Superficie total:");
        System.out.println(t.superficieTotal());

    }
}
