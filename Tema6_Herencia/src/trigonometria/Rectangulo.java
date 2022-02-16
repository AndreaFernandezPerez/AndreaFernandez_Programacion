package trigonometria;

public final class Rectangulo extends Figura{
    //variables
    private double base, altura, perimetro;

    //constructores
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //métodos

    @Override
    public double calcularArea() {
        area = base * altura;
        return super.calcularArea();
    }

    public double calcularPerimetro(){
        perimetro = (base + altura) * 2;
        return perimetro;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Base: %.2f\nAltura: %.2f\nArea: %.2f\nPerimetro: %.2f\n", base, altura, area, perimetro);
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}//fin de clase
