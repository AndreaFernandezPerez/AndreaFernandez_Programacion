package trigonometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿Qué opción quieres realizar?");
            System.out.println("1. Trabajar con círculos");
            System.out.println("2. Trabajar con triángulos");
            System.out.println("3. Trabajar con rectángulos");
            opcion = sc.nextInt();

            switch (opcion){
                case 1: //circulo
                    System.out.println("Introduce el radio del círculo");
                    double radio = sc.nextInt();
                    Circulo circulo = new Circulo(radio);
                    int opcionDos = 0;
                    do {
                        System.out.println("Que deseas hacer");
                        System.out.println("1. Calcular área");
                        System.out.println("2. Calcular diametro");
                        System.out.println("3. Mostrar datos");
                        System.out.println("4. Salir");
                        opcionDos = sc.nextInt();

                        switch (opcionDos){
                            case 1:
                                System.out.println(circulo.calcularArea());
                                break;
                            case 2:
                                System.out.println(circulo.calcularDiametro());
                                break;
                            case 3:
                                circulo.mostrarDatos();
                                break;
                        }
                    }while (opcionDos != 4);
                    break;
                case 2: //triangulo
                    System.out.println("Introduce la base");
                    double base = sc.nextDouble();
                    System.out.println("Introduce la altura");
                    double altura = sc.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);

                    do {
                        System.out.println("Que deseas hacer");
                        System.out.println("1. Calcular área");
                        System.out.println("2. Mostrar datos");
                        System.out.println("3. Salir");
                        opcionDos = sc.nextInt();
                        switch (opcionDos){
                            case 1:
                                System.out.println(triangulo.calcularArea());
                                break;
                            case 2:
                                triangulo.mostrarDatos();
                                break;
                        }
                    }while (opcionDos != 3);
                    break;
                case 3: //rectángulo
                    System.out.println("Introduce la base");
                    double baseRect = sc.nextDouble();
                    System.out.println("Introduce la altura");
                    double alturaRect = sc.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(baseRect, alturaRect);

                    do {
                        System.out.println("Que deseas hacer");
                        System.out.println("1. Calcular área");
                        System.out.println("2. Calcular perimetro");
                        System.out.println("3. Mostrar datos");
                        System.out.println("4. Salir");
                        opcionDos = sc.nextInt();

                        switch (opcionDos){
                            case 1:
                                System.out.println(rectangulo.calcularArea());
                                break;
                            case 2:
                                System.out.println(rectangulo.calcularPerimetro());
                                break;
                            case 3:
                                rectangulo.mostrarDatos();
                                break;
                        }
                    }while (opcionDos != 4);
                    break;
            }
        }while (opcion != 0);

        sc.close();

    }//fin de main
}//fin de clase
