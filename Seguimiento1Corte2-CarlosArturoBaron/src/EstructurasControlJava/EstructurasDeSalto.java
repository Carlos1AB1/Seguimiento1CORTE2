package EstructurasControlJava;

public class EstructurasDeSalto {
    public static void main(String[] args) {
        // Bucle con break
        System.out.println("Bucle con break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Sale del bucle cuando i es 3
            }
            System.out.println("i = " + i);
        }

        // Bucle con continue
        System.out.println("\nBucle con continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;  // Salta la iteración cuando i es 3
            }
            System.out.println("i = " + i);
        }

        // return para terminar un método
        System.out.println("\nUsando return para terminar el programa:");
        mostrarMensaje();
    }

    public static void mostrarMensaje() {
        System.out.println("Este mensaje se muestra");
        return;  // Termina la ejecución de este método
        // Cualquier código aquí no se ejecutará
    }
}
