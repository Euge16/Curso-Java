public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplzar subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena1.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena1.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena); // Imprime "Adios Mundo"
        /*nuevaCadena = Adios Mundo
        * esto quiere decir, como ya sabemos que las cadenas son
        * inmutables, asi que las modificaciones que hicimos en la linea
        * var nuevaCadena = cadena1.replace("Mundo","a todos");
        * a la cadena origina -cadena1- realmente generó una nueva cadena y
        * no hizo ninguna modificacion sobre la cadena original, de tal manera
        * que tambien esta modificacion esta trabajando con la cadena original
        * y no modifica la cadena original, sino que genera una nueva cadena
        * por lo tanto, los nuevos resultados cuando reemplazamos una subcadena son nuevas
        * cadenas en si mismo*/
    }
}
