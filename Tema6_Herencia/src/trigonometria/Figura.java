package trigonometria;

public abstract class Figura {

    //variables
    protected double area;

    //contructores
    public void Figura(){

    }
    //métodos
    public abstract double calcularArea();

    public void mostrarDatos(){
        System.out.println("Area: " + area);
    }

    //getter y setter
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}//fin de clase
