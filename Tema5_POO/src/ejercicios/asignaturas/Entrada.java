package ejercicios.asignaturas;

public class Entrada {

    public static void main(String[] args) {

        Asignatura programacion = new Asignatura(1);
        //calificación = 0; id = 1;

        Asignatura entornos = new Asignatura(2);

        Asignatura bbdd = new Asignatura(3);

        Alumno borja = new Alumno(programacion, entornos, bbdd);
        //asignatura1=programacion --> que tiene 2 atributos que son id y calificacion
        //asg2= programacion (id/calificacion)

        Alumno andrea = new Alumno(4,5,6);
        //as1 = id= 4 calificación = 0

       // borja.getAsignatura1(); //con esto estamos cogiendo programacion de borja
       // borja.getAsignatura3().getId();

        Profesor profesor = new Profesor();

        profesor.ponerNotas(borja);

        System.out.println(borja.getAsignatura1().getCalificacion());
        System.out.println(borja.getAsignatura2().getCalificacion());
        System.out.println(borja.getAsignatura3().getCalificacion());

        System.out.println(profesor.calcularMedia(borja));

        if (profesor.calcularMedia(borja)>5){
            System.out.println("Borja pasa de curso");
        }else {
            System.out.println("Borja no pasa de curso");
        }

    }//fin de main

}//fin de clase
