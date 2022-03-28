package repasoEjercicios.partido;

public final class Partido {
    //variables
    private Equipo equipoLocal, equipoVisitante;
    private boolean jugado;
    private int golesLocales, golesVisitante;

    //constructores

    //métodos
    public void agregarGolesLocal(){
        golesLocales += (int)(Math.random()*2);
    }

    public void agregarGolesVisitante(){
        golesVisitante += (int)(Math.random()*2);
    }

    public void mostrarResultado(){
        System.out.printf("%s: %d - %s: %d\n", equipoVisitante.getNombre(), golesVisitante, equipoLocal.getNombre(), golesLocales);
    }

    public void repartirPuntos(){
        if(golesVisitante == golesLocales){
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+1);
            this.equipoVisitante.setPuntos(equipoVisitante.getPuntos()+1);
        } else if (golesVisitante > golesLocales){
            this.equipoVisitante.setPuntos(equipoLocal.getPuntos()+3);
        } else if (golesLocales > golesVisitante){
            this.equipoLocal.setPuntos(equipoLocal.getPuntos()+3);
        }
    }

    public void repartirClasificacion(){
        if (equipoLocal.getPuntos() < equipoVisitante.getPuntos()){
            System.out.println("1 - Barcelona: " + equipoLocal.getPuntos());
            System.out.println("2 - Sevilla: " + equipoVisitante.getPuntos());
        }else {
            System.out.println("1 - Sevilla: " + equipoVisitante.getPuntos());
            System.out.println("2 - Barcelona: " + equipoLocal.getPuntos());
        }
    }

    //getter y setter

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public boolean isJugado() {
        return jugado;
    }

    public void setJugado(boolean jugado) {
        this.jugado = jugado;
    }

    public int getGolesLocales() {
        return golesLocales;
    }

    public void setGolesLocales(int golesLocales) {
        this.golesLocales = golesLocales;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }


    //CLASE ANIDADA

    class Equipo{
        //variables
        private int puntos;
        private String nombre;

        //constructores

        public Equipo(String nombre) {
            this.nombre = nombre;
            if (nombre.equalsIgnoreCase("Barcelona")){
                setEquipoLocal(this);
            }else if (nombre.equalsIgnoreCase("Sevilla")){
                setEquipoVisitante(this);
            }
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

    }//fin de clase anidada

}//fin de clase
