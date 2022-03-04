package proyectoEnumInterfaz;

public class Entrada {
    public static void main(String[] args) {

       // Ejemplo ejemploEnum = new Ejemplo();
        // ejemploEnum.mostrarDatos();

        Persona persona = new Jugador("Andrea", "Fdez", 1234, Posiciones.defensa.name());
        Jugador jugador = new Jugador("Iker", "Elorduy", 4321, Posiciones.medio.getDefinicion());

       // Posiciones.medio.setValor(4000);
        // Jugador jugador1 = new Jugador("Ander", "Iturriaga", 1000, Posiciones.delantero.getDefinicion());

        Persona persona1 = new Entrenador("Igor", "Clemente", 5000, Vocacion.defensivo.name());
        Entrenador entrenador = new Entrenador("Koldo", "Perez", 2500, Vocacion.ofensivo.name());

        Canterano canterano = new Canterano("Nombre", "Apellido", 4500, 60);

        Seleccionable seleccionable = new Jugador("Iñigo", "Aduriz", 2000, Posiciones.defensa.getDefinicion());

        Seleccion espania = new Seleccion();
        espania.addPersona(jugador);
        espania.addPersona(canterano);
        espania.addPersona(entrenador);

        espania.comprobarAtaque();

        
    }//fin de main
}//fin de clase
