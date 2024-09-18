package ConstructoresYsobrecarga;

public class Coche {
    private String marca;
    private String modelo;
    private int año;

    // Constructor sin parámetros
    public Coche() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.año = 0;
    }

    // Constructor con un parámetro
    public Coche(String marca) {
        this.marca = marca;
        this.modelo = "Desconocido";
        this.año = 0;
    }

    // Constructor con dos parámetros
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = 0;
    }

    // Constructor con tres parámetros
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para mostrar la información del coche
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año);
    }
}

