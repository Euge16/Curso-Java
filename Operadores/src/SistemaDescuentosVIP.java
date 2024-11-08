import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuento VIP ***");
        final var NUM_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuántos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresia de la tienda (true/false)? ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =
                cantidadProductos >= NUM_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP ? " + esElegibleDescuento);

    }
}
