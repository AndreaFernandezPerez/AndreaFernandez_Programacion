package ejercicios.trigonometria;

public class Circulo {

    //variables
    private double radio, diametro, area;

    //constructores
    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }

    //métodos

    public double calcularArea(){
        area = (Math.PI)*Math.pow(radio,2);
        return area;
    }
    public double calcularDiametro(){
        diametro = 2*radio;
        return diametro;
    }

    //métodos get y set


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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}//fin de clase
