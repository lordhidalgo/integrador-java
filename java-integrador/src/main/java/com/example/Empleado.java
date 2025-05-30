package com.example;

public class Empleado extends Persona {
    private String puesto;

    public Empleado(String nombre, String apellido, String email, String puesto) {
        super(nombre, apellido, email);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("+---------------------+---------------------------+");
        System.out.println("| Tipo: Empleado");
        System.out.println("+---------------------+---------------------------+");
        System.out.printf("| Nombre: %-18s | Email: %-24s |%n", getNombre() + " " + getApellido(), getEmail());
        System.out.printf("| Puesto: %-19s |%n", puesto);
        System.out.println("+---------------------+---------------------------+");
    }
}
