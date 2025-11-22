package KATA_4;

public class MainAnimales {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
