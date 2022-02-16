package listaMultimedia;

public final class Audio extends Elemento{

    //variables
    private int duracion;
    private String soporte;

    //constructores
    public Audio(){

    }
    public Audio(String id, String titulo, String autor, int tamanio, String formato, int duracion, String soporte){
        super(id, titulo, autor, tamanio, formato);
        this.duracion = duracion;
        this.soporte = soporte;
    }

    //métodos

    @Override
    public void mostrarDatos() {
        System.out.println("Mostramos los datos de audio");
        super.mostrarDatos();
        System.out.printf("Duración: %d\nSoporte: %s\n", duracion, soporte);
    }

    public void metodoAudio(){

    }


    //getter y setter

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}//fin de clase
