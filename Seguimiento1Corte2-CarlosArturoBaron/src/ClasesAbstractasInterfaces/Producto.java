package ClasesAbstractasInterfaces;

// Clase abstracta
public abstract class Producto {
    private String nombre;
    private double precio;

    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método abstracto (sin implementación)
    public abstract void mostrarDetalles();

    // Método concreto (con implementación)
    public double obtenerPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}

// Subclase concreta: Computadora
class Computadora extends Producto {
    private String procesador;

    public Computadora(String nombre, double precio, String procesador) {
        super(nombre, precio);
        this.procesador = procesador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Computadora: " + getNombre() + ", Precio: $" + obtenerPrecio() + ", Procesador: " + procesador);
    }
}

// Subclase concreta: Telefono
class Telefono extends Producto {
    private String sistemaOperativo;

    public Telefono(String nombre, double precio, String sistemaOperativo) {
        super(nombre, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Teléfono: " + getNombre() + ", Precio: $" + obtenerPrecio() + ", Sistema Operativo: " + sistemaOperativo);
    }
}

// Clase principal
class Main {
    public static void main(String[] args) {
        Producto miComputadora = new Computadora("Dell XPS", 1200.00, "Intel i7");
        Producto miTelefono = new Telefono("Samsung Galaxy", 800.00, "Android");

        miComputadora.mostrarDetalles(); // Imprime: Computadora: Dell XPS, Precio: $1200.0, Procesador: Intel i7
        miTelefono.mostrarDetalles();    // Imprime: Teléfono: Samsung Galaxy, Precio: $800.0, Sistema Operativo: Android
    }
}

