public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador and ***");
        /*Operador && (and)
        * El operador logico 'and' regresa verdadero solo
        * si ambos valores a evaluar son verdaderos
        *       x     y     &&
        *       f     f     f
        *       f     t     f
        *       t     f     f
        *       t     t     t
        * */
        boolean a = true, b = false, c = true;
        var resultado = a && b;
        System.out.println("resultado a && b : " + resultado);
        resultado = a && c;
        System.out.println("resultado a && c : " + resultado);

    }
}
