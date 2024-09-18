package Static;

public class Contador {
    // Variable static
    private static int cuenta = 0;

    // Constructor
    public Contador() {
        cuenta++;
    }

    // Método para obtener el valor de la variable static
    public static int obtenerCuenta() {
        return cuenta;
    }
}

class Main {
    public static void main(String[] args) {
        // Crear instancias de Contador
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        // Obtener el valor de la variable static
        System.out.println("Número de instancias: " + Contador.obtenerCuenta()); // Imprime: Número de instancias: 3
    }
}
