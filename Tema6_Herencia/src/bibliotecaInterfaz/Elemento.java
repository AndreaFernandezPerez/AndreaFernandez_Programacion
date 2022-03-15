package bibliotecaInterfaz;

public abstract class Elemento {
    //variables
    protected int id;
    protected String titulo;
    protected boolean estado;
    protected Seccion seccion;

    //constructores
    public Elemento(){}

    public Elemento(int id, String titulo, Seccion seccion) {
        this.id = id;
        this.titulo = titulo;
        this.estado = true;
        this.seccion = seccion;
    }

    //métodos
    public void mostrarElemento(){
        System.out.println("ID: " + id);
        System.out.println("Sección: " + seccion);
        System.out.println("Título: "  + titulo);
        System.out.println("Estado: " + estado);
    }

    //getter y setter



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}//fin de clase
