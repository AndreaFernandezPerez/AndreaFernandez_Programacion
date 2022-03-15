package teoria;

public class Entrada {
    public static void main(String[] args) {

        ClaseC claseC = new ClaseC();
        ClaseB claseB = new ClaseB();

        ClaseA claseA = new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("El mensaje abstracto diferente");
            }
        };

        ClaseA claseA1 = new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("mensaje diferente");
            }
        };

        claseC.registrarMensaje(claseA);
        claseC.registrarMensaje(claseA1);

        claseC.registrarMensaje(new ClaseA() {
            @Override
            public void mensajeAbstracto() {
                System.out.println("mensaje desde una anónima 100%");
            }
        });

        claseC.modificarMensaje("Este es el mensaje que quiero modificar", new Modificables() {
            @Override
            public void lanzarMayusculas(String s) {
                System.out.println(s.toUpperCase());
            }

            @Override
            public void lanzarMinusculas(String s) {
                System.out.println(s.toLowerCase());
            }
        });
        

    }//fin main
}//fin clase
