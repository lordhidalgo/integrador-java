package com.example;

public class Cliente extends Persona {
    private String direccion;

    public Cliente(String nombre, String apellido, String email, String direccion) {
        super(nombre, apellido, email);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("+---------------------+---------------------------+");
        System.out.println("| Tipo: Cliente");
        System.out.println("+---------------------+---------------------------+");
        System.out.printf("| Nombre: %-18s | Email: %-24s |%n", getNombre() + " " + getApellido(), getEmail());
        System.out.printf("| Dirección: %-14s |%n", direccion);
        System.out.println("+---------------------+---------------------------+");
    }
}
