package ejercicio5ClasesAnidadas;

public class Terreno {
    //variables
    private Casa casa;
    private int m2, valoracion;
    private String orientacion;

    //constructores

    public Terreno() {
    }

    public Terreno(int m2, int valoracion, String orientacion) {
        //habrá que añadir o no la casa
        this.m2 = m2;
        this.valoracion = valoracion;
        this.orientacion = orientacion;
    }

    //métodos
    public void revalorizarCasa(){

    }

    public void construirCasa(){}

    //getter y setter


    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    //CLASE ANIDADA
    class Casa{
        //variables
        private int m2, habitaciones;
        private boolean piscina = false;

        //constructores

        public Casa() {
        }

        public Casa(int m2, int habitaciones, boolean piscina) {
            this.m2 = m2;
            this.habitaciones = habitaciones;
            this.piscina = piscina;
        }
        //métodos
        public void construirHabitacion(int metros){}

        public void construirPiscina(){}

        public void construirAnexo(int metros){}

        //getter y setter

    }//fin de clase anidada
}//fin de clase
