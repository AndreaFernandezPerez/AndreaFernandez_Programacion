package proyectoEnumInterfaz;

public abstract class Persona {

    //variables
    protected String nombre, apellido;
    protected double sueldo;

    //constructores

    public Persona(){}

    public Persona(String nombre, String apellido, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        calcularSueldo();
    }

    //métodos
    public abstract void calcularSueldo();

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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}//fin de clase
