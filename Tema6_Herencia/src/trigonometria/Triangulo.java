package trigonometria;

public final class Triangulo extends Figura{
    //variables
    private double base, altura;

    //constructores
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //métodos

    @Override
    public double calcularArea() {
        area = (base * altura)/2;
        return super.calcularArea();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Base: %.2f\nAltura: %.2f\nArea: %.2f", base, altura, area);
    }

    //getter y setter

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}//fin de clase
