package trigonometria;

public abstract class Figura {

    //variables
    protected double area;

    //contructores
    public void Figura(){

    }
    //métodos
    public double calcularArea(){
        return area;
    }

    public void mostrarDatos(){

    }


    //getter y setter
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}//fin de clase
