package EjerciciosRepaso;

import java.util.Scanner;

public class Nomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldo;
        int pagas;
        double neto;

        System.out.println("Introduce tu sueldo bruto mensual");
        sueldo = sc.nextInt();
        System.out.println("Introduce el número de pagas");
        pagas = sc.nextInt();

        System.out.println("El salario bruto anual es: " + sueldo*pagas);
        neto = sueldo - (sueldo * 0.15);
        System.out.println("El salario neto mensual es: " + neto);
        System.out.println("El salario neto mensual es: " + neto * pagas);


        sc.close();

    }//fin de main
}//fin de clase
