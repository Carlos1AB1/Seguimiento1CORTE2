package HerenciaYpolimorfismo;


public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public String getNombre() {
        return nombre;
    }
}

// subclase
class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre); // Llama al constructor de la superclase
        this.raza = raza;
    }

    // Método sobreescrito
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }

    public String getRaza() {
        return raza;
    }
}

// Clase principal para ejecutar el programa
class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genérico");
        Perro perro = new Perro("Rex", "Labrador");

        animal.hacerSonido(); // Llama al método de la superclase
        perro.hacerSonido();  // Llama al método sobreescrito en la subclase

        System.out.println("Nombre del animal: " + animal.getNombre());
        System.out.println("Nombre del perro: " + perro.getNombre());
        System.out.println("Raza del perro: " + perro.getRaza());
    }
}

