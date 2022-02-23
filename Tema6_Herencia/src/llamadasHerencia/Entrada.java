package llamadasHerencia;

public class Entrada {
    public static void main(String[] args) {

        Provincial provincial = new Provincial(9876, 6789, 5);
        //provincial.mostrarDatos();

        Nacional nacional = new Nacional(1234, 4321, 5, 2);
        Nacional nacional1 = new Nacional(1324, 4231, 5, 3);
        //nacional.mostrarDatos();

        Local local = new Local(4567, 7654, 5);

        Centralita centralita = new Centralita();
        centralita.registrarLlamada(provincial);
        centralita.registrarLlamada(nacional);
        centralita.registrarLlamada(nacional1);
        centralita.registrarLlamada(local);

        centralita.mostrarLlamadas("nacionales");
        centralita.mostrarCostesTotales();

    }//fin de main
}//fin de clase
