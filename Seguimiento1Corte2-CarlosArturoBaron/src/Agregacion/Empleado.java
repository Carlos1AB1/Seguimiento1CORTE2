package Agregacion;

import java.util.ArrayList;
import java.util.List;

// Clase Empleado
class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre='" + nombre + '\'' + ", id=" + id + '}';
    }
}

// Clase Departamento
class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre='" + nombre + '\'' + ", empleados=" + empleados + '}';
    }
}

// Clase principal
class Main {
    public static void main(String[] args) {
        // Crear empleados
        Empleado emp1 = new Empleado("Juan Pérez", 101);
        Empleado emp2 = new Empleado("Ana Gómez", 102);

        // Crear departamento
        Departamento dept = new Departamento("Recursos Humanos");

        // Agregar empleados al departamento
        dept.agregarEmpleado(emp1);
        dept.agregarEmpleado(emp2);

        // Mostrar detalles del departamento
        System.out.println(dept);

        // Eliminar un empleado del departamento
        dept.eliminarEmpleado(emp1);

        // Mostrar detalles del departamento después de eliminar un empleado
        System.out.println(dept);
    }
}

