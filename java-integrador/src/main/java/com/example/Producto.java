package com.example;

public abstract class Producto {
    private String nombre;
    private double precio;
    private String plataforma;
    private String tematica;

    // Constructor completo
    public Producto(String nombre, double precio, String plataforma, String tematica) {
        this.nombre = nombre;
        this.precio = precio;
        this.plataforma = plataforma;
        this.tematica = tematica;
    }

    // Constructor con solo nombre y precio (sobrecarga)
    public Producto(String nombre, double precio) {
        this(nombre, precio, "Desconocida", "General");
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    // Método abstracto para mostrar información
    public abstract void mostrarInformacion();
}