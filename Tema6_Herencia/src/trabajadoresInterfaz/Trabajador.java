package trabajadoresInterfaz;

public abstract class Trabajador extends Persona{
    //variables
    protected double sueldo;
    protected Departamento departamento;

    //constructores

    public Trabajador() {

    }

    public Trabajador(String nombre, String apellido, String dni, double sueldo, Departamento departamento) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.departamento = departamento;
        calcularSueldo();
    }

    //métodos
    public abstract void calcularSueldo();

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Departamento: " + departamento.getNombre());
    }

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
