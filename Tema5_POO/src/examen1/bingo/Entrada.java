package examen1.bingo;

public class Entrada {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Andrea", "123456x", 20);
        jugador1.comprarCartones(5);
        jugador1.verCartones();

        do {
            int aleatorio = (int)(Math.random()*51);
            jugador1.comprobarNumero(aleatorio);

        }while (!jugador1.isGanador());

    }//fin de main
}//fin de clase
