public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condicion ? exp1 (verdadera) : exp2 (falsa)

        // Determinar si un numero es par o no
        var numero = 5;
        var resultado = (numero % 2 == 0) ? "Par": "Impar";
        System.out.println("El numero " + numero + " es "+ resultado);

        // Calcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Eres mayor de edad": "Eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = -5;
        resultado = (numero > 0) ? "Positivo": (numero < 0) ? "Negativo": "Cero";
        System.out.println("\nEl valor "+ numero + " es " + resultado);
    }
}