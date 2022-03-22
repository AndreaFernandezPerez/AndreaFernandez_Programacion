package Partido;

public class Partido {
    //variables
    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocal, golesVisitante;

    //constructores

    public Partido() {
    }


    //métodos
    public void agregarGolesLocal(){
        golesLocal += (int)(Math.random()*2);
    }
    public void agregarGolesVisitante(){
        golesVisitante += (int)(Math.random()*2);
    }
    public void mostrarResultado(){

    }
    //getter y setter

    //clase anidada
    class Equipo{
        //variables
        private int puntos;
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

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }//fin clase equipo

}//fin de clase partido
