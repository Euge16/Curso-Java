public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (su valor por default es 0)
        byte tipoByte = 127;
        // Atajo -> soutv
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; //L o l para indicar tipo Long
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante (su valor por default es 0.0)
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouable = 3.1315;
        System.out.println("tipoDouable = " + tipoDouable);


        //Caracter (valor por default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano (valor por default es falase)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object (Referencia)
        String nombre = null; //valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Maria Eugenia";
        System.out.println("nombre = " + nombre);

    }
}
