package ejercicio14;

public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.printf("🎬 Exportando '%s' en formato %s...%n", proyecto, formato);
        return new Render(formato, proyecto);
    }
}
