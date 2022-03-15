package bibliotecaInterfaz;

public final class Revista extends Elemento implements Prestar{
    //variables
    private String ISBN;

    //constructores
    public Revista(){}

    public Revista(int id, String seccion, String titulo, String ISBN) {
        super(id, seccion, titulo);
        this.ISBN = ISBN;
    }

    //métodos

    @Override
    public void mostrarElemento() {
        super.mostrarElemento();
        System.out.println("ISBN: " + ISBN);
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public boolean devolver() {
        return false;
    }
    //getter y setter

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}//fin de clase
