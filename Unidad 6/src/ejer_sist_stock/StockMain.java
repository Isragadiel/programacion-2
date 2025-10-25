package ejer_sist_stock;

import java.util.List;

public class StockMain {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        // 1. Crear al menos cinco productos con diferentes categorías y agregarlos al inventario.
        Producto p1 = new Producto("P001", "Arroz 1kg", 1200.0, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Auriculares Bluetooth", 2500.0, 15, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera algodón", 1800.0, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Lámpara de mesa", 3500.0, 8, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche 1L", 800.0, 100, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 2. Listar todos los productos mostrando su información y categoría.
        System.out.println("=== Listado de productos ===");
        inventario.listarProductos();

        // 3. Buscar un producto por ID y mostrar su información.
        System.out.println("\n=== Buscar producto P002 ===");
        Producto buscado = inventario.buscarProductoPorId("P002");
        if (buscado != null) buscado.mostrarInfo();

        // 4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("\n=== Filtrar por categoría ALIMENTOS ===");
        List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(Producto::mostrarInfo);

        // 5. Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("\n=== Eliminar producto P004 ===");
        boolean eliminado = inventario.eliminarProducto("P004");
        System.out.println("Eliminado: " + eliminado);
        inventario.listarProductos();

        // 6. Actualizar el stock de un producto existente.
        System.out.println("\n=== Actualizar stock P003 a 45 ===");
        inventario.actualizarStock("P003", 45);
        Producto pActualizado = inventario.buscarProductoPorId("P003");
        if (pActualizado != null) pActualizado.mostrarInfo();

        // 7. Mostrar el total de stock disponible.
        System.out.println("\nTotal de stock: " + inventario.obtenerTotalStock());

        // 8. Obtener y mostrar el producto con mayor stock.
        System.out.println("\nProducto con mayor stock:");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) mayorStock.mostrarInfo();

        // 9. Filtrar productos con precios entre $1000 y $3000.
        System.out.println("\n=== Productos entre $1000 y $3000 ===");
        List<Producto> rangoPrecio = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        rangoPrecio.forEach(Producto::mostrarInfo);

        // 10. Mostrar las categorías disponibles con sus descripciones.
        System.out.println("\n=== Categorías disponibles ===");
        inventario.mostrarCategoriasDisponibles();
    }
}
