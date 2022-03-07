package trabajadoresInterfaz;

public abstract class Trabajador extends Persona{
    //variables
    protected double sueldo;
    Departamento departamento;

    //constructores

    public Trabajador() {

    }

    public Trabajador(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    //métodos
    public abstract void calcularSueldo();

    //getter y setter

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}//fin de clase
