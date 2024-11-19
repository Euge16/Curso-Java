import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Estacion del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona el valor del mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());
        /*var estacion = "";
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Verano";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Otoño";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Invierno";
        } else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Primavera";
        } else {
            estacion = "Estacion desconocida: " + mes;
        }

        // Imprimir resultado
        System.out.printf("La estacion para el mes %d es %s", mes, estacion);*/

        // Revision del mes usando la sintaxis switch mejorada
        var estacion = switch(mes){
            case 1, 2, 12 -> "Verano";
            case 3, 4, 5 -> "Otoño";
            case 6, 7, 8 -> "Invierno";
            case 9, 10, 11 -> "Primavera";
            default -> "Estacion desconocida";
        };
        System.out.printf("La estacion para el mes %d es %s", mes, estacion);

    }
}
