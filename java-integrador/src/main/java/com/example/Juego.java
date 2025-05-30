package com.example;

public class Juego extends Producto {

    // Constructor completo
    public Juego(String nombre, double precio, String plataforma, String tematica) {
        super(nombre, precio, plataforma, tematica);
    }

    // Constructor con solo nombre y precio (sobrecarga)
    public Juego(String nombre, double precio) {
        super(nombre, precio);
    }

    // Implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("+---------------------+---------------------------+");
        System.out.println("| Tipo: Juego");
        System.out.println("+---------------------+---------------------------+");
        System.out.printf("| Nombre: %-18s | Precio: %-24s |%n", getNombre(), getPrecio());
        System.out.printf("| Plataforma: %-14s | Temática: %-12s |%n", getPlataforma(), getTematica());
        System.out.println("+---------------------+---------------------------+");
    }
}
