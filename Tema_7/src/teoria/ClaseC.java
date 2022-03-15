package teoria;

public class ClaseC {

    public void registrarMensaje(ClaseA claseA){

        claseA.mostrarMensaje();
        claseA.mensajeAbstracto();
    }

    public void modificarMensaje(String s, Modificables modificables){
        modificables.lanzarMayusculas(s);
        modificables.lanzarMinusculas(s);
    }
}
