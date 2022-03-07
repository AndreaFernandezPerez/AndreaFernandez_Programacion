package trabajadoresInterfaz;

public final class Autonomo extends Trabajador{
    //variables
    private int cuota, factura; //factura --> lo que factura al mes

    //constructores

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, double sueldo, Departamento departamento, int cuota) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
        this.factura = factura;
    }

    //métodos

    @Override
    public void calcularSueldo() {

    }

    //getter y setter

}//fin de clase
