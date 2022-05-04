package model;

import java.io.Serializable;

//AQUI CREAMOS EL OBJETO como lo veniamos haciendo antes

// para escribirlo tiene que ser serializable, por lo que lo implementamos
public class Usuario implements Serializable {

    //variables
    private String nombre, apellido, contrasenia;

    //constructor

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
    }

    //métodos

    //getter y setter

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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    //método toString --> se llama para hacer la representación del objeto
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", contrasenia='" + contrasenia + '\'' +
                '}';
    }


}//fin de clase
