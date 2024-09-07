public class TiendaLinea {
    public static void main(String[] args) {
        //Detalle del producto
        System.out.println("*** Tienda en Linea (Detalle Producto) ***");
        String nombreProducto = "Notebook Samsung";
        double precio = 1836.99;
        int cantidadDisponible = 50;
        boolean disponibleVenta = true;

        //Imprimir el detalle del producto
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);

        //Modifico los valores
        nombreProducto = "Laptop Samsung";
        precio = 2115.99;
        cantidadDisponible = 0;
        disponibleVenta = false;
        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);



    }
}
