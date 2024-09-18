package FinalMetodosAtributos;

public class Animal {
    // Método final que no puede ser sobrescrito
    public final void comer() {
        System.out.println("El animal está comiendo.");
    }
}

class Perro extends Animal {
    // Intento de sobrescribir el método final (esto causará un error)
    // @Override
    // public void comer() {
    //     System.out.println("El perro está comiendo.");
    // }
}

