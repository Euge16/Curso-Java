import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio lechga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("Precio tomates: ");
        var precioTomates = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicamos algun descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioTomates;

        // Aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje/100.00);

        // Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cálculo con impuestos (21%)
        var impuestos = subtotalConDescuento * 0.21;

        // Calculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuestos;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -----------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (21%%): $%.2f
                Costo total de la comprea: $%.2f
                """, subtotal, descuento,descuentoPorcentaje, impuestos, costoTotalCompra);


    }
}
