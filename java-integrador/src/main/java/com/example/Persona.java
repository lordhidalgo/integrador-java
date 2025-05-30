package com.example;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private String email;

    public Persona(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método abstracto para mostrar información
    public abstract void mostrarInformacion();

    // Métodos que solo el administrador puede implementar
    public void agregarVideojuego(String nombreJuego) {
        if (this instanceof Administrador) {
            System.out.println("El administrador " + nombre + " ha agregado el videojuego: " + nombreJuego);
        } else {
            System.out.println("No tienes permisos para agregar videojuegos.");
        }
    }

    public void verListaUsuarios() {
        if (this instanceof Administrador) {
            System.out.println("El administrador " + nombre + " está viendo la lista de usuarios.");
        } else {
            System.out.println("No tienes permisos para ver la lista de usuarios.");
        }
    }

    public void verVentasPorMes(int mes) {
        if (this instanceof Administrador) {
            System.out.println("El administrador " + nombre + " está viendo las ventas del mes " + mes);
        } else {
            System.out.println("No tienes permisos para ver las ventas por mes.");
        }
    }
}
