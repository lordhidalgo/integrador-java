package com.example;

public class Main {
    public static void main(String[] args) {
        Persona admin = new Administrador("Luis", "Martínez", "luis.martinez@example.com");
        Persona cliente = new Cliente("Juan", "Pérez", "juan.perez@example.com", "Calle 123");
        Persona empleado = new Empleado("Ana", "Gómez", "ana.gomez@example.com", "Desarrollador");

        empleado.mostrarInformacion();

        admin.mostrarInformacion();
        admin.agregarVideojuego("Aventura Épica");
        admin.verListaUsuarios();
        admin.verVentasPorMes(10);

        System.out.println();

        cliente.mostrarInformacion();
        cliente.agregarVideojuego("Carrera Veloz");
        cliente.verListaUsuarios();
            cliente.verVentasPorMes(10);
    
            // Crear instancias de Juego utilizando diferentes constructores
            Producto juego1 = new Juego("Aventura Épica", 49.99, "PC", "Aventura");
            Producto juego2 = new Juego("Carrera Veloz", 39.99);
    
            // Uso de polimorfismo
            Producto[] productos = {juego1, juego2};
            for (Producto producto : productos) {
                producto.mostrarInformacion();
            }
        }
    }
    