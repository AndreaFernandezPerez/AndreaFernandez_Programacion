import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double REFRESCO = 1.20;
        final double CAFE = 1.0;
        final double BOCADILLO = 3.20;
        final double MENU = 9.50;
        int opcion;
        int refresco = 0, cafe = 0, bocadillo = 0, menu, comensales, sumaCafe = 0, sumaRef = 0, sumaBocadillo = 0, sumaMenu = 0;
        double totalRef = 0.0, totalCafe = 0.0, totalBocadillo = 0.0, totalMenu = 0.0;

        do {
            System.out.println("1. Pedir café");
            System.out.println("2. Pedir refresco");
            System.out.println("3. Pedir bocadillo");
            System.out.println("4. Pedir menú");
            System.out.println("5. Pedir la cuenta");
            System.out.println("¿Qué deseas?");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("¿Cuántos cafés quieres?");
                    cafe = sc.nextInt();
                    sumaCafe += cafe;
                    totalCafe = (double) sumaCafe*CAFE;
                    break;
                case 2:
                    System.out.println("¿Cuántos refrescos quieres?");
                    refresco = sc.nextInt();
                    sumaRef += refresco;
                    totalRef = (double) sumaRef*REFRESCO;

                    break;
                case 3:
                    System.out.println("¿Cuántos bocadillos quieres?");
                    bocadillo = sc.nextInt();
                    sumaBocadillo += bocadillo;
                    totalBocadillo = (double) sumaBocadillo*BOCADILLO;
                    break;
                case 4:
                    System.out.println("¿Cuántos menús quieres?");
                    menu = sc.nextInt();
                    sumaMenu += menu;
                    totalMenu = (double) sumaMenu*MENU;
                    break;
                case 5:
                    System.out.println("¿Cuántas comensales son?");
                    comensales = sc.nextInt();
                    double media = (totalBocadillo+totalCafe+totalMenu+totalRef)/comensales;
                    System.out.println("Bocadillos: " + sumaBocadillo);
                    System.out.println("Refrescos: " + sumaRef);
                    System.out.println("Cafés: " + sumaCafe);
                    System.out.println("Menús: " + sumaMenu);
                    System.out.println("Precio total: " + (totalBocadillo + totalRef + totalCafe + totalMenu));
                    System.out.printf("Precio por persona: %.2f", media);

                    break;

            }//fin de switch

        }while (opcion != 5);


            sc.close();
    }//fin de main
}//fin de clase
