package ejercicios.trigonometria;

public class Triangulo {

    //variables
    private int base, altura;
    private double area;

    //constructores
    public Triangulo(){

    }
    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    //métodos
    public double calcularArea (){

        area = (base*altura)/2;
        return area;
    }

    //métodos getter y setter


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
}//fin de clase
