package trigonometria;

public final class Circulo extends Figura {
    //variables
    private double radio, diametro;

    //constructores
    public Circulo(double radio){
        this.radio = radio;
    }

    //métodos

    @Override
    public double calcularArea() {
        this.area = Math.PI * (Math.pow(this.radio, 2));
        return area;
    }

    public double calcularDiametro(){
        this.diametro = this.radio * 2;
        return this.diametro;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Radio: %.2f\nDiametro: %.2f\n", radio, diametro);
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
