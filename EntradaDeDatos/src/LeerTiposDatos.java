import java.util.Locale;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        var consola = new Scanner(System.in);
        consola.useLocale(Locale.ENGLISH);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);

        // Consumimos el caracter de salto de linea
        consola.nextLine();


        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        //var enteroString = consola.nextLine();
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        // tipo flotante
        System.out.println("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Double
        System.out.println("Proporcionar un valor double: ");
        var decimal = Double.parseDouble(consola.nextLine());
        System.out.println("decimal = " + decimal);


    }
}
