import java.util.Scanner;

public class SistemaTiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuentos ***");

        final var MONTO_COMPRA_DESC = 1000.00;

        var consola = new Scanner(System.in);
        System.out.print("¿Cuál es el monto de tu compra? ");
        var montoCompra = Double.parseDouble(consola.nextLine());
        System.out.print("¿Eres miembro de la tienda (true/false)? ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        var descuento = 0.0;

        if (montoCompra >= MONTO_COMPRA_DESC && eresMiembro) {
            descuento = 0.1; // Descuento del 10%
        } else if (eresMiembro) {
            descuento = 0.05; // Descuento del 5%
        }

        if (descuento != 0) {
            var montoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    %n¡Felicidades! Has obtenido un descuento del %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f%n
                    """, descuento * 100, montoCompra, montoDescuento, montoFinal);
        } else {
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento.
                    ¡Te invitamos a hacerte miembro de la tienda!
                    Monto final de la compra: $%.2f%n
                    """, montoCompra);
        }
    }
}
