package KATA_dos;

public class MainFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(4, 6)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }
}
