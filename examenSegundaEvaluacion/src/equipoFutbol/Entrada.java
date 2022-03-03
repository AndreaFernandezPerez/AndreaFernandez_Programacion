package equipoFutbol;

public class Entrada {
    public static void main(String[] args) {

        Seleccion athletic = new Seleccion();
        Posicion posicionDefensa = Posicion.defensa;

        Jugador judadorUno = new Jugador("Iker", "Blas", "12345678p", 25, posicionDefensa.name());
        Jugador jugadorDos = new Jugador("Ander", "Iturliz", "01928374t", 27, Posicion.portero.name());
        Jugador jugadorTres = new Jugador("Koldo", "Arzubia", "65748392j", 21, Posicion.medio.name());
        Jugador jugadorCuatro = new Jugador("Alai", "Etxebarria", "27463521d", 18, Posicion.delantero.name());

        athletic.contratar(judadorUno);
        athletic.contratar(jugadorDos);
        athletic.contratar(jugadorTres);
        athletic.contratar(jugadorCuatro);

        Entrenador entrenadorUno = new Entrenador("Igor", "Pez", "98765432q", 43, Vocacion.defensivo.name());
        Entrenador entrenadorDos = new Entrenador("Ibai", "Clemente", "67584930b", 51, Vocacion.ofensivo.name());

        athletic.contratar(entrenadorUno);
        athletic.contratar(entrenadorDos);

        // athletic.verPosicion("delantero");
        athletic.verPlantilla();

        athletic.mostrarGastos();




    }//fin de main
}//fin de entrada
