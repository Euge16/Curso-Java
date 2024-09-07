public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";

        // Comparacion de cadenas (==) comparan la referencia en memoria
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        /*La variable de cadena3 no esta apuntando al objeto
        * que se creo en el pool de conexiones, sino que debido a que estamos
        * reservando nuevo espacio de memoria, entonces
        * se crea un nuevo objeto y podemos observar que entonces la variable
        * de cadena3 esta apuntando a un nuevo objeto en memoria
        * Y entonces, si comparamos la referencia, por ej. de la variable cadena1 con cadena3
        * el resultado deberia ser FALSO*/
        var cadena3 = new String("Java");
        //Comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);


        // Comparar contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
