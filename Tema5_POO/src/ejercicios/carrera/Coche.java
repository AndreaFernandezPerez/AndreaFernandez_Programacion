package ejercicios.carrera;

public class Coche {

    //variables
    private int cv, velocidad;
    private String matricula, modelo;
    private double kmRecorridos;

    //contructores
    public Coche(){
        this.matricula = "0000AAA";
        this.modelo = "Sin especificar";
    }

    public Coche(String modelo, String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }

    //métodos
    public void acelerar (int acelerarVelocidad){
        this.velocidad += acelerarVelocidad;

        this.kmRecorridos = velocidad * (cv * (Math.random()*11));

        if (velocidad >= 180){
            System.out.println("Ha llegado a su velocidad máxima");
        }
    }

    public void frenar (int disminuirVelocidad){
        this.velocidad -= disminuirVelocidad;
        if (velocidad < 0){
            velocidad = 0;
            System.out.println("El coche se ha parado");
        }
    }
    public void parar (){
        this.velocidad = 0;
    }
    public void resetear(){
        this.velocidad = 0;
        this.kmRecorridos = 0;
    }
    public void mostrarDatos(){
        System.out.printf("Matrícula: %s\t Modelo: %s\t CV: %d\t Velocidad: %d\t KM: %f\n", matricula, modelo, cv, velocidad, kmRecorridos);
    }

    //métodos get y set


    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }
}// fin de clase
