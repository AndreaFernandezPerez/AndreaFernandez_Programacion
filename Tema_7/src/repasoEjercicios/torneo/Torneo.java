package repasoEjercicios.torneo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Torneo {
    //variables
    private String nombre;
    private ArrayList<Partido> listaPartidos;
    private ArrayList<Equipo> listaEquipos;

    //constructores

    public Torneo(String nombre) {
        this.listaPartidos = new ArrayList(){};
    }

    //métodos
    public void realizarSorteo(ArrayList<Equipo> lista){
        this.listaEquipos = lista;
        //IDA
        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = 0; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }

        //VUELTA
        for (int i = 0; i < lista.size(); i++) {
            Equipo equipo1 = lista.get(i);
            for (int j = 0; j < lista.size(); j++) {
                Equipo equipo2 = lista.get(j);
                listaPartidos.add(new Partido(equipo1, equipo2));
            }
        }
        Collections.shuffle(listaPartidos);
    };

    public void imprimirClasificacion(){
        Collections.sort(listaEquipos, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo o1, Equipo o2) {
                if (o1.getPuntos() > o2.getPuntos()){
                    return -1;
                }else if (o1.getPuntos() == o2.getPuntos()){
                    if (o1.getGolesEncuentro() > o2.golesEncuentro){
                        return -1;
                    }
                }
                return 0;
            }
        });
        int contador = 1;
        for (Equipo equipo : listaEquipos) {
            System.out.printf("%d - %s -- %d %d\n", contador, equipo.getNombre(), equipo.getPuntos(), equipo.getGolesEncuentro());
            contador++;
        }
    }

    public void iniciarTorneo(){
        for (Partido item : listaPartidos) {
            item.jugarPartido();
        }
    }

    public void mostrarPartidosJugados(){
        for (Partido item : listaPartidos) {
            System.out.printf("%s:%d vs %s:%d\n", item.getLocal().getNombre(), item.golesLocal, item.getVisitante().getNombre(), item.golesVisitante);
        }
    }

    public void mostrarPartidos(){
        for (Partido item: listaPartidos){
            System.out.printf("%s vs %s\n", item.getLocal().getNombre(), item.getVisitante().getNombre());
        }
    }

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
        public void agregarGolesLocal(){
            if (local.getNivelAtaque() > visitante.getNivelAtaque()){
                this.golesLocal = (int)(Math.random()*2);
                local.setGolesEncuentro(local.getGolesEncuentro()+golesLocal);
            }
        }

        public void agregarGolesVisitante(){
            if (visitante.getNivelAtaque() > local.getNivelAtaque()){
                this.golesVisitante = (int)(Math.random()*2);
                visitante.setGolesEncuentro(visitante.getGolesEncuentro()+golesVisitante);
            }
        }

        public void jugarPartido(){
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    agregarGolesLocal();
                    agregarGolesVisitante();
                }
            }
            jugado = true;
            if (golesVisitante > golesLocal){
                visitante.setPuntos(visitante.puntos+3);
            }else if (golesLocal > golesVisitante){
                local.setPuntos(visitante.puntos+3);
            }else{
                visitante.setPuntos(visitante.puntos+1);
                local.setPuntos(local.puntos+1);
            }
        }

        public void mostrarResultado(){}

        //getter y setter


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

        public boolean isJugado() {
            return jugado;
        }

        public void setJugado(boolean jugado) {
            this.jugado = jugado;
        }

        public int getGolesLocal() {
            return golesLocal;
        }

        public void setGolesLocal(int golesLocal) {
            this.golesLocal = golesLocal;
        }

        public int getGolesVisitante() {
            return golesVisitante;
        }

        public void setGolesVisitante(int golesVisitante) {
            this.golesVisitante = golesVisitante;
        }

    }//fin de clase anidada partido

    //CLASE ANIDADA ESTATICA
    static class Equipo{
        //variables
        private String nombre;
        private int nivelAtaque, nivelDefensa;
        private int puntos, golesEncuentro;

        //constructores

        public Equipo(String nombre, int nivelAtaque, int nivelDefensa) {
            this.nombre = nombre;
            this.nivelAtaque = nivelAtaque;
            this.nivelDefensa = nivelDefensa;
        }

        //métodos

        //getter y setter

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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

    }//fin de clase anidada estática


}//fin de clase torneo
