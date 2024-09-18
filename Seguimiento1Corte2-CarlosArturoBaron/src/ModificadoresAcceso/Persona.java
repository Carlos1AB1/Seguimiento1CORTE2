package ModificadoresAcceso;

// Clase Persona (usaremos diferentes modificadores de acceso)
public class Persona {
    // Atributos con diferentes niveles de acceso
    public String nombre;       // Accesible desde cualquier lugar
    private int edad;           // Accesible solo dentro de esta clase
    protected String direccion; // Accesible dentro de esta clase, subclases y paquete

    // Constructor de la clase Persona
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Método público para mostrar la información (accesible desde cualquier lugar)
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion);
    }

    // Método privado: Solo accesible dentro de esta clase
    private void mostrarEdad() {
        System.out.println("Edad: " + edad);
    }

    // Método protegido: Accesible dentro de subclases y paquete
    protected void cambiarDireccion(String nuevaDireccion) {
        this.direccion = nuevaDireccion;
        System.out.println("Dirección actualizada a: " + direccion);
    }

    // Método público que accede a un método privado
    public void mostrarEdadPublico() {
        mostrarEdad();  // Accede al método privado desde dentro de la clase
    }
}

// Clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    private String carrera;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, String direccion, String carrera) {
        super(nombre, edad, direccion); // Llama al constructor de la clase padre (Persona)
        this.carrera = carrera;
    }

    // Método que muestra la información del estudiante
    public void mostrarDatosEstudiante() {
        // Puede acceder a 'nombre' porque es public
        System.out.println("Nombre: " + nombre + ", Carrera: " + carrera);

        // Puede acceder a 'direccion' porque es protected
        System.out.println("Dirección: " + direccion);

        // No puede acceder directamente a 'edad' porque es private, pero puede usar métodos públicos
        mostrarEdadPublico();
    }

    // Método para cambiar la dirección (usando el método protegido de la clase padre)
    public void actualizarDireccion(String nuevaDireccion) {
        cambiarDireccion(nuevaDireccion);  // Accede a método protected de la clase Persona
    }
}

// Clase principal para ejecutar el programa
class Main {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona("Laura", 30, "Calle 123");
        persona.mostrarInformacion(); // Acceder a método público

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante("Carlos", 21, "Avenida 456", "Ingeniería");
        estudiante.mostrarDatosEstudiante();  // Acceder a método público de la clase hija

        // Cambiar la dirección del estudiante (método protegido)
        estudiante.actualizarDireccion("Avenida 789");

        // No se puede acceder al atributo 'edad' ni al método privado 'mostrarEdad' directamente
        // persona.edad = 25;         // Error, porque 'edad' es private
        // persona.mostrarEdad();     // Error, porque 'mostrarEdad' es private
    }
}

