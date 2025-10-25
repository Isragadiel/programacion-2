package ejercicio5;

public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placa;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = new PlacaMadre(modeloPlaca, chipset);
    }

    public PlacaMadre getPlaca() { return placa; }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() { return propietario; }

    @Override
    public String toString() {
        return String.format("Computadora{marca='%s', numeroSerie='%s', placa=%s}", marca, numeroSerie, placa);
    }
}
