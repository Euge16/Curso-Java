import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("*** Sistema de Empleados ***");
        System.out.print("Ingresar nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        System.out.print("Ingresar edad del empleado: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa salario del empleado: ");
        var salario = Double.parseDouble(consola.nextLine());

        System.out.print("Es jefe de departamento (true o false)?: ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        System.out.println("\nDatos del empleado: ");
        System.out.println("\tNombre del Empleado: " + nombreEmpleado );
        System.out.println("\tEdad: " + edad + " años");
        System.out.printf("\tSalario: $%.2f%n", salario);
        System.out.println("\tEs jefe de departamento?: " + esJefe);

    }
}
