package bibliotecaInterfaz;

public final class Libro extends Elemento implements Prestar{
    //variables
    private String ISBN, autor, editorial;
    private int paginas;

    //constructores
    public Libro(){}

    public Libro(int id, String titulo, Seccion seccion, String ISBN, String autor, String editorial, int paginas) {
        super(id, titulo, seccion);
        this.ISBN = ISBN;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }

//métodos

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("ISBN: " + ISBN);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Páginas: " + paginas);
    }

    @Override
    public boolean prestar() {
        setEstado(false);
        return isEstado();
    }

    @Override
    public boolean devolver() {
        setEstado(true);
        return isEstado();
    }

    //getter y setter

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}//fin de clase
