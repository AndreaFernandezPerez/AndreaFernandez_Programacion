package EjerciciosT4Parte2;

public class Ejercicio12Champions {
    public static void main(String[] args) {
        String [] bomboUno = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String [] bomboDos = {"Real Madrid", "Tottenham", "Napoles", "B.Dortmund", "O.Lyon", "Chelsea", "Atalanta", "Atletico de Madrid"};

        String [] equiposSalidosB1 = new String [bomboUno.length];
        String [] equiposSalidosB2 = new String [bomboDos.length];

        for (int i = 0; i < bomboUno.length; i++) {
            int aleatorioUno = (int)(Math.random()*bomboUno.length);
            int aleatorioDos = (int)(Math.random()*bomboDos.length);

            String equipoGeneradoB1 = bomboUno[aleatorioUno];
            String equipoGeneradoB2 = bomboUno[aleatorioDos];

            for (int j = 0; j < equipoGeneradoB1.length(); j++) {
                if (equipoGeneradoB1.equalsIgnoreCase(equiposSalidosB1[i])){
                    aleatorioUno = (int)(Math.random()*bomboUno.length);
                }
            }

            System.out.println(bomboUno[aleatorioUno]+ " - " + bomboDos[aleatorioDos]);

        }


    }//fin de main
}//fin de clase
