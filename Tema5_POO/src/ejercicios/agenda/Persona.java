package ejercicios.agenda;

public class Persona {

    //variables
    private String nombre, dni;
    private int telefono;

    //contructores

    public Persona(){

    }

    public Persona(String nombre, String dni, int telefono){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    //métodos

    public void mostrarDatos(){
        System.out.printf("Nombre: %s\tDNI: %s\tTeléfono: %d\n", nombre, dni, telefono);
    }

    //métodos get and set


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
