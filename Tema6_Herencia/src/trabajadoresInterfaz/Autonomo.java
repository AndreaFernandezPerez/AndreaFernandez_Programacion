package trabajadoresInterfaz;

public final class Autonomo extends Trabajador{
    //variables
    private double cuota;
    private String factura;

    //constructores
    public Autonomo(){}

    public Autonomo(String nombre, String apellido, String dni, double sueldo, Departamento departamento, double cuota) {
        super(nombre, apellido, dni, sueldo, departamento);
        this.cuota = cuota;
        this.realizarFactura();
    }
    //métodos

    @Override
    public void calcularSueldo() {
        this.sueldo = this.sueldo - (cuota + (cuota*Admin.IVA)) - (this.sueldo * Admin.IRPF);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cuota: " + cuota);
        System.out.println("Factura: " + factura);
    }

    public void realizarFactura(){
        this.factura = String.format("Factura realizada por un importe de %.2f a la empresa con CIF %s", this.sueldo, Admin.CIF);

    }
    //getter y setter


    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
}//fin de clase
