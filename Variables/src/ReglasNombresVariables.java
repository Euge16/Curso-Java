public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas de nombres de variables
        String nombreCompleto = "Maria Eugenia";
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Maria Eugenia 2"; //No aplica las buenas practicas, la variable empieza en mayuscula
        System.out.println("NombreCompleto = " + NombreCompleto);

        //String nombre-cliente = "Maria"; //Incorrecto
        String nombre_cliente = "Maria"; //Correcto, no aplica buenas practicas
        String _apellido = "Lopez"; //Correcto y aceptable
        String $apellido = "Lopez"; //Correcto y aceptable

        int totPzs = 10; //Correcto, no aplica buenas practicas
        int totalPiezas = 10; //Correcto, aplica las buenas practicas
        boolean casado = true; //Correcto, aun puede mejorar
        boolean esCasado = true; //Correcto y aplica buenas practicas
        boolean isCasado = true; //Correcto y aplica buenas practicas *
        boolean tieneSaldo = true; //Correcto y aplica buenas practicas
        boolean hasSaldo = true; //Correcto y aplica buenas practicas *


    }
}
