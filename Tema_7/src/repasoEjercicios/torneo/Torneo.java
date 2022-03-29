package repasoEjercicios.torneo;

import java.util.ArrayList;

public class Torneo {
    //variables
    private String nombre;
    private ArrayList listaPartidos;

    //constructores

    public Torneo() {
        this.listaPartidos = new ArrayList(){};
    }

    //métodos
    public void realizarSorteo(){};

    public void jugarPartido(){};

    //getter y setter

    //CLASE ANIDADA NORMAL
    class Partido{
        //variables
        private Equipo local, visitante;
        private boolean jugado;
        private int golesLocal, golesVisitante;

        //constructores

        public Partido() {
        }

        public Partido(Equipo local, Equipo visitante) {
            this.local = local;
            this.visitante = visitante;
        }
        //métodos
        public void agregarGolesLocal(){}

        public void agregarGolesVisitante(){}

        public void mostrarResultado(){}

        //getter y setter

    }//fin de clase anidada partido

    //CLASE ANIDADA ESTATICA
    static class Equipo{
        //variables

        //constructores

        //métodos

        //getter y setter
    }


}//fin de clase torneo
