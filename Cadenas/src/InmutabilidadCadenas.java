public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // Inmutabilidad de Cadenas
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("cadena1 modificada = " + cadena1);
        System.out.println("cadena2 = " + cadena2);

        /* Concepto de inmutabilidad:
        * Una vez que hemos definido un objeto en memoria, sus
        * caracteres no se pueden modificar, pero lo que si podemos
        * hacer es asignar una nueva referencia para cambiar los caracteres de nuestra
        * cadena
        * */
    }
}
