package Torneo;

import java.util.ArrayList;

public class Torneo {
    //variables
    private String nombre;
    private ArrayList<Partido> listaPartidos;

    //constructores

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.listaPartidos = new ArrayList();
    }

    //métodos
    public void realizarSorteo(){}
    public void jugarPArtido(){}

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Partido> getListaPartidos() {
        return listaPartidos;
    }

    public void setListaPartidos(ArrayList<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    //CLASE ANIDADA PARTIDO - ANIDADA NORMAL
    class Partido{
        //variables anidada Partido
        private boolean jugado;
        private int numeroGoles;
        private ArrayList<Equipo> listaEquipos;

        //constructores anidada Partido

        public Partido() {
            this.listaEquipos = new ArrayList<>();
        }

        //métodos anidada Partido
        public void agregarGolesLocal(){}
        public void agregarGolesVisitante(){}
        public void mostrarResultado(){}

        //getter y setter anidada Partido

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }

        public int getNumeroGoles() {
            return numeroGoles;
        }

        public void setNumeroGoles(int numeroGoles) {
            this.numeroGoles = numeroGoles;
        }

        public ArrayList<Equipo> getListaEquipos() {
            return listaEquipos;
        }

        public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
            this.listaEquipos = listaEquipos;
        }

    }//fin clase Partido

    //CLASE ANIDADA STATIC EQUIPO
    static class Equipo{
        //variables
        private int puntos, golesEncuentro, nivelAtaque, nivelDefensa;
        private String nombre;

        //constructores

        public Equipo(int puntos, String nombre) {
            this.puntos = puntos;
            this.nombre = nombre;
        }

        //métodos

        //getter y setter

        public int getPuntos() {
            return puntos;
        }

        public void setPuntos(int puntos) {
            this.puntos = puntos;
        }

        public int getGolesEncuentro() {
            return golesEncuentro;
        }

        public void setGolesEncuentro(int golesEncuentro) {
            this.golesEncuentro = golesEncuentro;
        }

        public int getNivelAtaque() {
            return nivelAtaque;
        }

        public void setNivelAtaque(int nivelAtaque) {
            this.nivelAtaque = nivelAtaque;
        }

        public int getNivelDefensa() {
            return nivelDefensa;
        }

        public void setNivelDefensa(int nivelDefensa) {
            this.nivelDefensa = nivelDefensa;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    }//fin de clase Equipo
}//fin clase Torneo
