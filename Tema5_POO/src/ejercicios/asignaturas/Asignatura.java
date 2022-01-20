package ejercicios.asignaturas;

public class Asignatura {

    //variables

    private int id;
    private double calificacion;

    //constructores

    public Asignatura (){

    }
    public Asignatura (int id) {
        this.id = id;  //hace falta declarar la variable id?
    }

    //métodos

    //getter y setter


    public int getId() {
        return id;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

}//fin de clase
