package Torneo;

import java.util.ArrayList;

public class Torneo {
    //variables
    private String nombre;
    private ArrayList<Partido> listaPartidos;

    //constructores

    public Torneo() {
    }

    public Torneo(String nombre) {
        this.nombre = nombre;
        this.listaPartidos = new ArrayList();
    }

    //métodos
    public void realizarSorteo(ArrayList<Equipo> lista){
        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = i+1; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }
    }

    public void mostrarPartidos(){
        for (Partido item : listaPartidos) {
            System.out.printf("%s vs %s\n", item.getLocal(), item.visitante);
        }
    }

    public void jugarPartido(){}

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
        private Equipo local, visitante;

        //constructores anidada Partido
        public Partido(Equipo local, Equipo visitante) {
            this.local = local;
            this.visitante = visitante;
        }

        //métodos anidada Partido
        public void jugarPartido(){}

        public void generarGolLocal(){

        }
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

        public Equipo getLocal() {
            return local;
        }

        public void setLocal(Equipo local) {
            this.local = local;
        }

        public Equipo getVisitante() {
            return visitante;
        }

        public void setVisitante(Equipo visitante) {
            this.visitante = visitante;
        }

    }//fin clase Partido

    //CLASE ANIDADA STATIC EQUIPO

    static class Equipo{

        //variables
        private int puntos, golesEncuentro, nivelAtaque, nivelDefensa;
        private String nombre;

        //constructores

        public Equipo(int nivelAtaque, int nivelDefensa, String nombre) {
            this.nivelAtaque = nivelAtaque;
            this.nivelDefensa = nivelDefensa;
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
