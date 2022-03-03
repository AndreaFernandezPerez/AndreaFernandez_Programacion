package proyectoEnumInterfaz;

public enum Equipo {

    // construidos --> valores por defecto
    Barcelona ("FC Barcelona" , 5000), Madrid("Real Madrid", 8000), Sevilla,
    Getafe, Alcorcon;

    //variables
    String nombre;
    int presupuesto;

    // contructores
    Equipo(){}

    Equipo(String nombre, int presupuesto){
        this.nombre = nombre;
        this.presupuesto = presupuesto;
    }

    //métodos
    public void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(presupuesto);
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
}
