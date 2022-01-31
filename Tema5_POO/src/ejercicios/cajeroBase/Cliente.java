package ejercicios.cajeroBase;

public class Cliente {

    //variables

    private String dni, nombre;
    private int telefono;

    //constructores

    public Cliente(){

    }
    public Cliente(String nombre, String dni){
        this.dni = dni;
        this.nombre = nombre;
    }

    //métodos

    public void mostrarDatos(){
        System.out.println("Los datos del cliente son:");
        System.out.printf("Nombre: %s\tDNI: %s\tTeléfono: %d\n", nombre, dni, telefono);
    }

    //métodos get y set


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}//fin de clase
