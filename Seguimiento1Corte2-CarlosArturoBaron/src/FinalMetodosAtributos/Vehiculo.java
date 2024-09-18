package FinalMetodosAtributos;

// Clase final que no puede ser extendida
public final class Vehiculo {
    // Atributos y métodos de la clase
    private String tipo;

    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

// Intento de heredar de la clase final (esto causará un error)
// class Coche extends Vehiculo {
//     // Código aquí
// }

