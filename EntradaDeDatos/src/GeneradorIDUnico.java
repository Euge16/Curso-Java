import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Generador de ID Unico ***");
        var consola = new Scanner(System.in);
        var random = new Random();


        //Solicitar
        System.out.print("Ingresa nombre: ");
        var nombre = consola.nextLine();
        System.out.print("Ingresa apellido: ");
        var apellido = consola.nextLine();
        System.out.print("Ingresa año de nacimiento (YYYY) : ");
        var anioNacimiento = consola.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var anioNacimiento2 = anioNacimiento.trim().toUpperCase().substring(2);

        // Generar valor aleatorio entre 1 y 9999
        var numeroAleatorio = random.nextInt(9999)+1;

        // Formato de 4 digitos
        var numeroAleatorioFormato = String.format("%04d",numeroAleatorio);

        // Generar ID unico
        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        //Imprimir el ID unico
        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de identificacion (ID) generado por el sistema es:
                \t%s
                \tFelicitaciones
                """,nombre, idUnico);

    }
}
