public class SentenciaIf {
    public static void main(String[] args) {
        // Uso de la sentencia if - else if - else
        var edad = 16;

        if (edad >= 18) {
            System.out.print("Eres mayor de edad");
        } else if (edad >= 13 && edad < 18) {
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
