package model;

public class Profesor {

    private String nombre, Apellido;

    // constructor

    public Profesor() {
    }

    public Profesor(String nombre, String apellido) {
        this.nombre = nombre;
        Apellido = apellido;
    }

    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    // método toString
    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
