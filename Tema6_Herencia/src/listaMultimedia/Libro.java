package listaMultimedia;

public final class Libro extends Elemento{ //final, el siguiente que hereda no puede modificar nada

    //variables
    private int numPag, isbn;

    //constructores
    public Libro(){

    }
    public Libro(String id, String titulo, String autor, int tamanio, String formato, int numPag, int isbn){
        super(id, titulo, autor, tamanio, formato);
        this.numPag = numPag;
        this.isbn = isbn;
    }

    //métodos

    @Override
    public void mostrarDatos() {
        System.out.println("Mostramos los datos de Libro");
        super.mostrarDatos();
        System.out.printf("Num. páginas: %d\nISBN: %d\n", numPag, isbn);
    }

    public void metodoLibro(){

    }

    //getter y setter


    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}//fin de clase
