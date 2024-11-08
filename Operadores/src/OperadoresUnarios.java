public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        // Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operadores unarios incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);
        // Pos-incremento
        a = 3;
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = "+ a);

        // Pre-decremento
        b = -2;
        resultado = --b; //primero se decrementa y despues se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya se decremento = " + b);
        // Pos-decremento
        b = -2;
        resultado = b--; //primero se usa el valor y despues se decremeta
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b);

    }
}
