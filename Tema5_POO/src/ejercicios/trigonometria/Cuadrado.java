package ejercicios.trigonometria;

public class Cuadrado {

    //variables

    private int base, altura;
    private double area, perimetro;

    //constructores

    public Cuadrado(){

    }
    public Cuadrado(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //métodos
    public double calcularArea (){
        area = base * altura;
        return area;
    }

    public double calcularPerimetro(){
        perimetro = Math.pow(area, 2) + Math.pow(base, 2);
        return perimetro;
    }

    //métodos get y set


    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}//fin de clase
