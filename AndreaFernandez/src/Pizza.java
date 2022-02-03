import java.util.ArrayList;

public class Pizza {

    //variables
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> listaIngredientes;
    private int id;
    private boolean estado;

    //contructores
    public Pizza(){
        listaIngredientes = new ArrayList<>();
    }
    public Pizza(int id){
        listaIngredientes = new ArrayList<>();
        this.id = id;
    }
    //métodos
    public void agregarIngrediente(Ingrediente ingrediente){
        listaIngredientes.add(ingrediente);
    }

    public void verDatos(){
        for (Ingrediente item :listaIngredientes) {
            System.out.printf("%s ",item.getNombre());
            precio += item.getPrecio();
        }
        System.out.println();
        System.out.printf("El coste de la pizza es: %.2f \n", precio);
    }

    //métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}//fin de clase
