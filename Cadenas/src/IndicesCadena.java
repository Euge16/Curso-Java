public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // REcupera el caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);

        // Recuperar el último caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        // Recuperar la letra M
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
