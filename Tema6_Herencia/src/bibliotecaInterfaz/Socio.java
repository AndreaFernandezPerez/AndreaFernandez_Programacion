package bibliotecaInterfaz;

import java.util.ArrayList;

public final class Socio extends Persona{
    //variables
    private int numSocio;
    private ArrayList<Prestar> prestamos;

    //constructores

    public Socio() {}

    public Socio(String nombre, String apellido, String dni, int numSocio) {
        super(nombre, apellido, dni);
        this.numSocio = numSocio;
        this.prestamos = new ArrayList<>();
    }

    //métodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Número de socio: " + numSocio);
        System.out.println("Préstamos ");
        for (Prestar item : prestamos) {

        }
    }


    //getter y setter

    public ArrayList<Prestar> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestar> prestamos) {
        this.prestamos = prestamos;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
}//fin de clase
