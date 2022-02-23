package ejercicios.agendaRepaso;

public class Persona {
    //variables
    protected String nombre, dni;
    protected int telefono;

    //constructores
    public Persona(){

    }
    public Persona(String nombre, String dni, int telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    //métodos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Teléfono: " + telefono);
    }

    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}//fin de clase
