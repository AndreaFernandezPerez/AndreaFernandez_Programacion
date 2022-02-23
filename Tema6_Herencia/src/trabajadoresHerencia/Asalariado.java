package trabajadoresHerencia;

public final class Asalariado extends Trabajador{
    //variables
    private int sueldo, pagas;
    private boolean contratado;

    //constructores
    public Asalariado(){

    }

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int pagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.pagas = pagas;
        this.contratado = contratado;
    }
    //métodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Pagas: " + pagas);
        System.out.println("Contratado: " + contratado);
    }

    //getter y setter

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getPagas() {
        return pagas;
    }

    public void setPagas(int pagas) {
        this.pagas = pagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
