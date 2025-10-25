package ejercicio13;

public class GeneradorQR {
    public CodigoQR generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("🔹 QR generado: " + qr);
        return qr;
    }
}
