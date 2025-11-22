package parte_uno;

public class MainEcommerce {
    public static void main(String[] args) {

        Cliente c = new Cliente("Gadiel");
        Pedido pedido = new Pedido(c);

        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 8000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Pago con tarjeta con descuento
        TarjetaCredito tarjeta = new TarjetaCredito();
        double totalConDescuento = tarjeta.aplicarDescuento(total);
        tarjeta.procesarPago(totalConDescuento);

        pedido.cambiarEstado("Enviado");
    }
}
