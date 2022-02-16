package trigonometria;

public final class Circulo extends Figura {
    //variables
    private double radio, diametro;
    private final double PI = 3.1415;

    //constructores
    public Circulo(double radio){
        this.radio = radio;
    }

    //métodos

    @Override
    public double calcularArea() {
        area = PI * (Math.pow(radio, 2));
        return super.calcularArea();
    }

    public double calcularDiametro(){
        diametro = radio * 2;
        return diametro;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Radio: %.2f\nArea: %.2f\nDiametro: %.2f\n", radio, area, diametro);
    }
    //getter y setter

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}//fin de clase
