package ejercicios.coche;

public class Motor {

    //creamos variables-atributos
    private int litrosAceite;
    private int caballos;

    //creamos los constructores

    public Motor () {

    }

    public Motor (int caballos){
        this.caballos = caballos;
        this.litrosAceite = 0; // no haría falta crearlo, por defecto es 0
    }

    //creamos los métodos

    //creamos métodos getter y setter

    public int getCaballos(){return caballos;}
    public int getLitrosAceite(){return litrosAceite;}

    public void setLitrosAceite(int litrosAceite){this.litrosAceite = litrosAceite;}


}//fin de clase motor
