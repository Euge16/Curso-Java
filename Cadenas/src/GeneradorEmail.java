public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        // Nombre completo del usuario
        var nombreCompleto = "Maria Eugenia Lopez";
        System.out.println("Nombre usuario: " + nombreCompleto);

        // Normalizar el nombre del usuario
        // Limpiar los espacion en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar los espacion en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ",".");
        // Convertimos a minúsculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("Nombre usuario normalizado = " + nombreNormalizado);

        // Datos de la empresa
        var nombreEmpresa = "Global Mentoring";
        System.out.println("\nNombre empresa: "+nombreEmpresa);
        var dominio = ".com.ar";
        System.out.println("Extension del dominio: "+ dominio);

        // Quitar los espacios en blanco y convertimos a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ",".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + dominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        // Creamos el email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);

    }
}
