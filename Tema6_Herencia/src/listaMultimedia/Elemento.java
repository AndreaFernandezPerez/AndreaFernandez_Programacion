package listaMultimedia;

public abstract class Elemento { //con abstract no se puede instanciar

    //variables
    protected int tamanio;
    protected String id, titulo, autor, formato;

    //constructores
    public Elemento(){

    }
    public Elemento(String id, String titulo, String autor, int tamanio, String formato){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.tamanio = tamanio;
        this.formato = formato;
    }

    //métodos

    public void mostrarDatos(){
        System.out.printf("Id: %s\nTítulo: %s\nAutor: %s\nTamaño: %d\nFormato: %s\n", id, titulo, autor, tamanio, formato);
    }

    //getter y setter


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}//fin de clase
