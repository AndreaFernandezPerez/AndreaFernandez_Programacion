package repasoEjercicios.partido;

public class Entrada {

    public static void main(String[] args) {

        Partido partido = new Partido();

        Partido.Equipo Barcelona = partido.new Equipo("Barcelona");
        Partido.Equipo Sevilla = partido.new Equipo("Sevilla");

        for (int i = 0; i < 2; i++) { //un partido tiene i= 2 partes
            for (int j = 0; j < 3; j++) {//3 ataques por equipo
                partido.agregarGolesLocal();
                partido.agregarGolesVisitante();
            }
            System.out.println("El resultado en la " + (i+1) + " parte es \n");
            partido.mostrarResultado();
        }

        partido.repartirPuntos();
        partido.repartirClasificacion();

    }//fin de main

}//fin de clase
