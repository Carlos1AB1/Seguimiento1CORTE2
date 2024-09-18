package ArrayList;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList de tipo String
        ArrayList<String> lista = new ArrayList<>();

        // Agregar elementos a la lista
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");
        lista.add("Durazno");

        // Imprimir la lista
        System.out.println("Lista original: " + lista);

        // Acceder a un elemento por índice
        String primerElemento = lista.get(0);
        System.out.println("Primer elemento: " + primerElemento);

        // Modificar un elemento
        lista.set(2, "Mango");
        System.out.println("Lista después de modificar el tercer elemento: " + lista);

        // Eliminar un elemento por índice
        lista.remove(1);
        System.out.println("Lista después de eliminar el segundo elemento: " + lista);

        // Verificar si un elemento está en la lista
        boolean contieneMango = lista.contains("Mango");
        System.out.println("¿La lista contiene Mango? " + contieneMango);

        // Obtener el tamaño de la lista
        int tamaño = lista.size();
        System.out.println("Tamaño de la lista: " + tamaño);

        // Recorrer la lista con un bucle for
        System.out.println("Elementos de la lista:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Elemento en índice " + i + ": " + lista.get(i));
        }

        // Recorrer la lista con un bucle for-each
        System.out.println("Elementos de la lista (for-each):");
        for (String elemento : lista) {
            System.out.println(elemento);
        }

        // Limpiar la lista
        lista.clear();
        System.out.println("Lista después de limpiar: " + lista);
    }
}

