package ejercicios.asignaturas;

public class Profesor {

    //variables

    //constructores

    public Profesor(){

    }

    //métodos

    public void ponerNotas(Alumno alumno){

        alumno.getAsignatura1().setCalificacion(Math.random()*11);
        alumno.getAsignatura2().setCalificacion(Math.random()*11);
        alumno.getAsignatura3().setCalificacion(Math.random()*11);
    }

    public double calcularMedia (Alumno alumno){
        double media = (alumno.getAsignatura1().getCalificacion() +
                alumno.getAsignatura2().getCalificacion() +
                alumno.getAsignatura3().getCalificacion())/3;
        return media;
    }

    //getter y setter

}//fin de clase
