package interfazInicial;

public final class Audio extends Elemento implements Ejecutable{
    //variables
    private int duración;
    private String soporte;

    //constructores

    public Audio() {
    }

    public Audio(int identificadorm, int tamanio, String titulo, String autor, String formato, int duración, String soporte) {
        super(identificadorm, tamanio, titulo, autor, formato);
        this.duración = duración;
        this.soporte = soporte;
    }

    //métodos


    @Override
    public boolean ejecutar() {
        return false;
    }

    @Override
    public void parar() {

    }

    @Override
    public void reiniciar() {

    }

    //getter y setter

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }
}//final de clase
