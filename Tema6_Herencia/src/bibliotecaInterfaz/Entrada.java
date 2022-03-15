package bibliotecaInterfaz;

public class Entrada {
    public static void main(String[] args) {

        Socio socio1 = new Socio("Andrea", "Fernandez", "12345678p", 1);
        Trabajador trabajador1 = new Trabajador("Iker", "Elorduy", "98765432q");

        Libro libro1 = new Libro(1, "Confabulacion",  Seccion.General, "asdf", "Carlos del Amor", "Planeta", 300);
        Revista revista1 = new Revista(2, "kiosko", "El jueves", "fdsa");
        //DVD dvd1 = new DVD(3, "Willow", Seccion.General, 1987, GeneroPeliculas.intriga);
        DVD dvd2 = new DVD();
        CD cd1 = new CD(4, "b", "Monkey", 2003, EstiloMusical.musical);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarPersona(socio1);
        biblioteca.registrarPersona(trabajador1);

        biblioteca.registrarElemento(libro1);
        biblioteca.registrarElemento(revista1);
       // biblioteca.registrarElemento(dvd1);
        biblioteca.registrarElemento(cd1);

        biblioteca.realizarPrestamo(socio1, libro1);
        biblioteca.elementosPrestados();


    }//fin de main
}//fin de clase
