package FuncionesCadena;

public class EjemploCadena {
    public static void main(String[] args) {
        String cadena = "   Java es genial   ";

        // Longitud
        System.out.println("Longitud: " + cadena.length());

        // Acceso a caracteres
        System.out.println("Carácter en índice 5: " + cadena.charAt(5));

        // Subcadena
        System.out.println("Subcadena (0, 4): " + cadena.substring(0, 4));

        // Buscar una subcadena
        System.out.println("Índice de 'es': " + cadena.indexOf("es"));

        // Reemplazar texto
        System.out.println("Reemplazo 'genial' por 'fantástico': " + cadena.replace("genial", "fantástico"));

        // Convertir a mayúsculas y minúsculas
        System.out.println("Mayúsculas: " + cadena.toUpperCase());
        System.out.println("Minúsculas: " + cadena.toLowerCase());

        // Eliminar espacios en blanco
        System.out.println("Sin espacios: '" + cadena.trim() + "'");

        // Comprobar igualdad
        System.out.println("Igual 'Java es genial': " + cadena.trim().equals("Java es genial"));

        // Dividir la cadena
        String[] partes = cadena.trim().split(" ");
        for (String parte : partes) {
            System.out.println("Parte: " + parte);
        }

        // Concatenar cadenas
        String saludo = "Hola";
        String mensaje = saludo.concat(" ").concat("Mundo");
        System.out.println("Concatenado: " + mensaje);

        // Comprobar si contiene una subcadena
        System.out.println("Contiene 'genial': " + cadena.contains("genial"));

        // Comparar cadenas
        System.out.println("Comparación con 'Java es genial': " + cadena.trim().compareTo("Java es genial"));

        // Obtener un número como cadena
        int numero = 123;
        String numeroComoCadena = String.valueOf(numero);
        System.out.println("Número como cadena: " + numeroComoCadena);
    }
}

