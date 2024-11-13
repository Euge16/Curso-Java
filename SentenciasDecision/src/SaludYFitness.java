import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASA = 0.04;

        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Cuantos pasos has caminado hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Si :)" : "No :(";

        // Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASA;

        // Mostramos la informacion
        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios  alcanzada: %s
                ------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas,
                metaAlcanzada, META_PASOS_DIARIO);
    }
}
