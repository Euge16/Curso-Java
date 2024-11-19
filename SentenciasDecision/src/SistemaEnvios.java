import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envios ***");

        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        var consola = new Scanner(System.in);

        System.out.print("Ingresar el destino del paquete (nacional/internacional): ");
        // strip() = saca espacios en blanco
        // toLowerCase() = convierte el texto a minuscula
        var destino = consola.nextLine().strip().toLowerCase();


        System.out.print("Ingresar el peso del paquete (en kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        Double costoEnvio = switch (destino){
            case "nacional" -> peso * TARIFA_NACIONAL;
            case "internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. Ingresa nacional o internacional");
                yield null; // yield retorna el valor, ya no realizamos ningun calculo, sino que simplemente
                // retornamos el valor de null y se asigna a la variable de costoEnvio

            }
        };

        if (costoEnvio != null){
            System.out.printf("El costo de envio del paquete es: $%.2f", costoEnvio);
        }

    }
}
