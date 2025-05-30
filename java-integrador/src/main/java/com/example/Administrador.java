package com.example;

public class Administrador extends Persona {

    public Administrador(String nombre, String apellido, String email) {
        super(nombre, apellido, email);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo: Administrador");
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Email: " + getEmail());
    }

    // Implementación específica para administrador
    @Override
    public void agregarVideojuego(String nombreJuego) {
        System.out.println("El administrador " + getNombre() + " ha agregado el videojuego: " + nombreJuego);
    }

    @Override
    public void verListaUsuarios() {
        System.out.println("El administrador " + getNombre() + " está viendo la lista de usuarios.");
    }

    @Override
    public void verVentasPorMes(int mes) {
        System.out.println("El administrador " + getNombre() + " está viendo las ventas del mes " + mes);
    }
}

