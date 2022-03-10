package trabajadoresInterfaz;

public final class Jefe extends Trabajador implements Comision{

    //variables
    private int numTrabajadores;

    //constructores

    public Jefe(){}

    public Jefe(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int numTrabajadores) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.numTrabajadores = numTrabajadores;
    }

    //métodos
    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de trabajadores: " + numTrabajadores);
    }

    @Override
    public double votar() {
        double voto = (Math.random()*11)/3;
        return voto;
    }

    @Override
    public void obtenerBeneficio(int beneficio) {
        this.sueldo += (beneficio * 0.10);
        System.out.println("El beneficio obtenido es: " + beneficio*0.10);
    }
    //getter y setter

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }
}
