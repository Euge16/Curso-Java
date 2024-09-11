import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Recetas de cocina *** ");
        //Solicitar los valores más importantes
        System.out.print("Ingresa el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientesPrincipales = consola.nextLine();
        System.out.print("Ingresa el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la dificultad (Fácil - Medio - Dificil): ");
        var dificultadReceta = consola.nextLine();

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("Nombre de receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientesPrincipales);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultadReceta);
    }
}
