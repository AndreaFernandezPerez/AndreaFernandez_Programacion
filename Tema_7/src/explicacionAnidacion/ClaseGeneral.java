package explicacionAnidacion;

public class ClaseGeneral {
    //variables
    private String nombre;
    private int numero;
    private boolean acierto;
    private ClaseAnidada claseAnidada;

    //constructor

    public ClaseGeneral(String nombre, int numero, boolean acierto) {
        this.nombre = nombre;
        this.numero = numero;
        this.acierto = acierto;
    }

    //métodos

    public void mostrarDatosGeneral(){
        System.out.println(nombre);
        System.out.println(numero);
        System.out.println(acierto);
    }

    public void accesoHijo(){
        claseAnidada.mostrarDatosHija();
    }

    //getter y setter

    public ClaseAnidada getClaseAnidada() {
        return claseAnidada;
    }

    public void setClaseAnidada(ClaseAnidada claseAnidada) {
        this.claseAnidada = claseAnidada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isAcierto() {
        return acierto;
    }

    public void setAcierto(boolean acierto) {
        this.acierto = acierto;
    }


    //clase anidada

    class ClaseAnidada{

        //variables
        String nombreHija;
        int numeroHija;
        boolean aciertohija;

        //constructor

        public ClaseAnidada(String nombreHija, int numeroHija, boolean aciertohija) {
            this.nombreHija = nombreHija;
            this.numeroHija = numeroHija;
            this.aciertohija = aciertohija;
            setClaseAnidada(this);
        }

        //métodos

        public void mostrarDatosHija(){
            System.out.println(nombreHija);
            System.out.println(numeroHija);
            System.out.println(aciertohija);
        }

        public void accesoAgeneral(){
            mostrarDatosGeneral();
        }

        //getter y setter

        public String getNombreHija() {
            return nombreHija;
        }

        public void setNombreHija(String nombreHija) {
            this.nombreHija = nombreHija;
        }

        public int getNumeroHija() {
            return numeroHija;
        }

        public void setNumeroHija(int numeroHija) {
            this.numeroHija = numeroHija;
        }

        public boolean isAciertohija() {
            return aciertohija;
        }

        public void setAciertohija(boolean aciertohija) {
            this.aciertohija = aciertohija;
        }
    }//fin clase anidada

}//fin de clase
