public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador Not ***");
        /*Operador ! (not)
         * El operador logico '!' es un operador unario,
         * e invierte el valor logico
         *       x     !x
         *       f      t
         *       t      f
         * */
        boolean a = false;
        var resultado = !a;
        System.out.println("resultado !a: " + resultado);
    }
}
