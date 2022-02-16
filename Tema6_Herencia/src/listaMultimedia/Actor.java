package listaMultimedia;

public class Actor {

    //variables
    private String nombre, apellidos;

    //constructores
    public Actor(){

    }
    public Actor(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    //métodos
    public void mostrarDatos(){
        System.out.printf("Nombre: %s\nApellidos: %s", nombre, apellidos);
    }

    //getter and setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}//fin de clase
