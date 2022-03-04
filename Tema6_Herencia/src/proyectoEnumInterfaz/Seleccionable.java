package proyectoEnumInterfaz;

public interface Seleccionable {

    //los métodos son SIEMPRE publicos y abstractos por lo que no es necesario poner public

    //solo puedo poner cuerpo a un método con nombre default

    default void mostrarInterfaz(){

    }

    void atacar();
    void defender();
    void actitudCampo();

}
