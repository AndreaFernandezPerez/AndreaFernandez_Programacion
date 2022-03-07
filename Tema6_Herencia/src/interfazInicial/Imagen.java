package interfazInicial;

public final class Imagen extends Elemento implements Ejecutable{
    //variables
    private int isbn;

    //constructores

    public Imagen() {
    }

    public Imagen(int identificadorm, int tamanio, String titulo, String autor, String formato, int isbn) {
        super(identificadorm, tamanio, titulo, autor, formato);
        this.isbn = isbn;
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


    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}//fin de clase
