package ClasesYmas;

public class Clases_Metodos_Atributos_Instancias {
    // Atributos (variables de instancia)
    String marca;
    String modelo;
    String color;
    int velocidad;

    // Constructor para inicializar el objeto
    public Clases_Metodos_Atributos_Instancias(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;  // La velocidad inicial es 0
    }

    // Método para acelerar el coche
    public void acelerar(int incremento) {
        velocidad += incremento;  // Incrementa la velocidad
        System.out.println("El coche ha acelerado. Velocidad actual: " + velocidad + " km/h");
    }

    // Método para frenar el coche
    public void frenar(int decremento) {
        velocidad -= decremento;  // Reduce la velocidad
        if (velocidad < 0) {
            velocidad = 0;  // La velocidad no puede ser negativa
        }
        System.out.println("El coche ha frenado. Velocidad actual: " + velocidad + " km/h");
    }

    // Método para mostrar información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Velocidad: " + velocidad + " km/h");
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        // Crear una instancia de la clase Coche
        Clases_Metodos_Atributos_Instancias miCoche = new Clases_Metodos_Atributos_Instancias("Toyota", "Corolla", "Rojo");

        // Mostrar información inicial del coche
        miCoche.mostrarInformacion();

        // Acelerar y frenar el coche
        miCoche.acelerar(50);  // Aumentar velocidad en 50 km/h
        miCoche.frenar(20);    // Reducir velocidad en 20 km/h
        miCoche.mostrarInformacion();  // Mostrar información actualizada
    }
}
