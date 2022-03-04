package proyectoEnumInterfaz;

public enum Posiciones {

    // objetos precargados
    //si quiero el String del tiempo .name()

    portero ("portero", 1000), defensa("defensa", 1500),
    medio("medio centro", 2000), delantero("delantero", 2500);

    //variables
    String definicion;
    int valor;

    //constructores
    //no es necesario poner public, porque los enum son públicos
    Posiciones(){}

    Posiciones(String definicion, int valor) {
        this.definicion = definicion;
        this.valor = valor;
    }


    //métodos


    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
