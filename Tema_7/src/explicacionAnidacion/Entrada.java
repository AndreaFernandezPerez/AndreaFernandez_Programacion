package explicacionAnidacion;

public class Entrada {
    public static void main(String[] args) {

        ClaseGeneral claseGeneral = new ClaseGeneral("General", 1, false);
        ClaseGeneral.ClaseAnidada claseAnidada = claseGeneral.new ClaseAnidada("hija", 2, true);

        claseAnidada.accesoAgeneral();
        claseGeneral.accesoHijo();



    }//fin de main
}//fin de clase