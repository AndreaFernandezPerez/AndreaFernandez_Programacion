import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Truco magia = new Truco();


        do {
            System.out.println("¿Qué deseas saber?");
            System.out.println("1. Cómo te llamas");
            System.out.println("2. A qué te dedicas");
            System.out.println("3. Donde trabajas");
            System.out.println("4. Qué es esto");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    magia.nombre();
                    break;
                case 2:
                    magia.profesion();
                    break;
                case 3:
                    magia.lugarTrabajo();
                    break;
                case 4:
                    magia.pregunta();
                    break;
            }
        }while (opcion != 0);


        sc.close();

    }//fin main
}//fin de clase
