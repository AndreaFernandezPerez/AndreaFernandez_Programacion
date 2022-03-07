package interfazInicial;

public abstract class Elemento {
    //variables
    protected int identificadorm, tamanio;
    protected String titulo, autor, formato;

    //constructores

    public Elemento(){}

    public Elemento(int identificadorm, int tamanio, String titulo, String autor, String formato) {
        this.identificadorm = identificadorm;
        this.tamanio = tamanio;
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
    }


    //métodos

    //getter y setter

    public int getIdentificadorm() {
        return identificadorm;
    }

    public void setIdentificadorm(int identificadorm) {
        this.identificadorm = identificadorm;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
