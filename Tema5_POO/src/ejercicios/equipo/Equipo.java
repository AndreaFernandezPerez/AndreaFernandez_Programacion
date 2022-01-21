package ejercicios.equipo;

public class Equipo {

    //variables
    private String nombre;
    private int nivelAtaque, nivelCentro, nivelDefensa, goles;

    //constructores
    public Equipo(){

    }
    public Equipo(String nombre){
        this.nombre = nombre;
        this.nivelAtaque = (int)(Math.random()*101);
        this.nivelCentro = (int)(Math.random()*101);
        this.nivelDefensa = (int)(Math.random()*101);
    }
    public Equipo(String nombre, int nivelAtaque, int nivelCentro, int nivelDefensa){
        this.nombre = nombre;
        this.nivelAtaque = nivelAtaque;
        this.nivelCentro = nivelCentro;
        this.nivelDefensa = nivelDefensa;
    }

    //métodos
    public boolean atacar(){
        boolean gol = false;

        
        return gol;
    }

    //métodos get y set

}//fin de clase
