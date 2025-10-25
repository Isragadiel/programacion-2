package ejercicio14;

public class Render {
    private final String formato;
    private final Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return String.format("Render{formato='%s', proyecto=%s}", formato, proyecto);
    }
}
