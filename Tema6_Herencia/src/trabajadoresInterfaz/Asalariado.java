package trabajadoresInterfaz;

public final class Asalariado extends Trabajador{
    //variables
    private int pagas;

    //constructores
    public Asalariado(){

    }

    public Asalariado(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int pagas) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.pagas = pagas;
    }


    //métodos

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (this.sueldo * Admin.IRPF);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de pagas: " + pagas);
    }
    //getter y setter

    public int getPagas() {
        return pagas;
    }

    public void setPagas(int pagas) {
        this.pagas = pagas;
    }
}
