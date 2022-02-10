public class Coche {
    //esta es la super clase
    // una clase abstract nunca puede ser creada en el main

    //variables
    // importante no poner los atributos private, porque entonces no es posible heredar

    protected String matricula, bastidor;
    protected int velocidad, cv, cc;

    //constructores

    public Coche(){

    }
    public Coche(String matricula, String bastidor, int cv, int cc){
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.cv = cv;
        this.cc = cc;
    }

    //métodos

    public void calcularVelocidad(int velocidad){
        this.velocidad += velocidad;
    }

    public void mostrarDatos(){
        System.out.printf("Matricula: %s\n Bastidor: %s\n Cv: %d\n CC: %d\n", matricula, bastidor, cv, cc);
    }

    //getter y setter

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}//fin de clase
