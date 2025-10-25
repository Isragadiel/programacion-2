package ejercicio5;

public class PlacaMadre {
    private final String modelo;
    private final String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return String.format("PlacaMadre{modelo='%s', chipset='%s'}", modelo, chipset);
    }
}
