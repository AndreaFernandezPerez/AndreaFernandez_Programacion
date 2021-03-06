package model;

public class Usuarios {

    private  int id;
    private String nombre;
    private String apellido;
    private int telefono;
    private int sueldo;
    private String pais;
    private int id_perfil;


    public Usuarios() {
    }

    public Usuarios(int id, String nombre, String apellido, int telefono, int sueldo, String pais, int id_perfil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.pais = pais;
        this.id_perfil = id_perfil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono=" + telefono +
                ", sueldo=" + sueldo +
                ", pais='" + pais + '\'' +
                ", id_perfil=" + id_perfil +
                '}';
    }
}//fin de clase usuarios
