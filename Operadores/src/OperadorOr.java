public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Or ***");
        /*Operador || (or)
         * El operador logico 'or' regresa verdadero solo
         * si cualquiera de los valores a evaluar es verdadero
         *       x     y     &&
         *       f     f     f
         *       f     t     t
         *       t     f     t
         *       t     t     t
         * */
        boolean a = true, b = false, c = false;
        var resultado = a || b;
        System.out.println("resultado a || b : " + resultado);
        resultado = b || c;
        System.out.println("resultado b || c : " + resultado);
    }
}
