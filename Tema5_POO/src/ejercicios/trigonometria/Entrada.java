package ejercicios.trigonometria;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Triangulo triangulo1 = new Triangulo(5, 9);
        triangulo1.calcularArea2(); // no devuelve nada, solo ejecuta y guarda el dato del area
        System.out.println("El area es: " + triangulo1.getArea());
        triangulo1.calcularArea();//esto me devolvería el dato, pero no lo imprimiría

        Circulo circulo1 = new Circulo(5);
        circulo1.calcularArea2();
        circulo1.calcularDiametro2();
        System.out.println("El area es: " + circulo1.getArea());
        System.out.println("El diametro es: " + circulo1.getDiametro());

        Cuadrado cuadrado1 = new Cuadrado(10, 15);

        System.out.println("El área del triángulo es: " + triangulo1.calcularArea());
        System.out.printf("El área del cículo es: %.2f\n", circulo1.calcularArea());
        System.out.println("El diametro del círculo es: " + circulo1.calcularDiametro());
        System.out.println("El área del triángulo es: " + triangulo1.calcularArea());
        System.out.println("El área del cuadrado es: " + cuadrado1.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado1.calcularArea());

        do {
            System.out.println("Selecciona la opción deseada");
            System.out.println("1. Operaciones con triángulos");
            System.out.println("2. Operaciones con círculos");
            System.out.println("3. Operaciones con cuadrados");
            System.out.println("4. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el valor de la base");
                    int base = sc.nextInt();
                    triangulo1.setBase(base);
                    System.out.println("Introduce el valor de la altura");
                    int altura = sc.nextInt();
                    triangulo1.setBase(altura);

                    do {
                        System.out.println("Que operación quieres hacer");
                        System.out.println("1. Calcular el área");
                        System.out.println("2. Mostrar los datos");
                        System.out.println("3. Salir");
                        opcion = sc.nextInt();

                        switch (opcion){
                            case 1:
                                System.out.printf("El área es: %.2f\n", triangulo1.calcularArea());
                                break;
                            case 2:
                                System.out.printf("La base del triángulo es: %d\n", triangulo1.getBase());
                                System.out.println("La altura del triángulo es: " + triangulo1.getAltura());
                                break;
                        }
                    }while (opcion != 3);

                    System.out.println("Pulsa enter para continuar");
                    sc.next();
                    break;

                case 2:
                    System.out.println("Introduce el radio");
                    int radio = sc.nextInt();
                    circulo1.setRadio(radio);
                    System.out.println("Que operación quieres realizar");
                    System.out.println("1. Calcular el área");
                    System.out.println("2. Calcular el diámetro");
                    System.out.println("3. Mostrar datos");
                    opcion = sc.nextInt();

                    do {
                        switch (opcion){
                            case 1:
                                System.out.printf("El área del círculo es %.2f", circulo1.calcularArea());
                                break;
                            case 2:
                                System.out.printf("El diámetro del círculo es %.2f", circulo1.calcularDiametro());
                                break;
                            case 3:
                                System.out.printf("El radio del círculo es: %.2f", circulo1.getRadio());
                                break;
                        }
                    }while (opcion == 3);
                    break;

                case 3:
                    System.out.println("Introduce la base");
                    base = sc.nextInt();
                    cuadrado1.setBase(base);
                    System.out.println("Introduce la altura");
                    altura = sc.nextInt();
                    cuadrado1.setAltura(altura);

                    System.out.println("Que operación quieres realizar");
                    System.out.println("1. Calcular el área");
                    System.out.println("2. Calcular el perímetro");
                    System.out.println("3. Mostrar los datos");
                    System.out.println("4. Salir");
                    opcion = sc.nextInt();

                    do {
                        switch (opcion){
                            case 1:
                                System.out.printf("El área del cuadrado es: %.2f", cuadrado1.getArea());
                                break;
                            case 2:
                                System.out.printf("El perímetro del cuadrado es: %.2f", cuadrado1.getPerimetro());
                                break;
                            case 3:
                                System.out.printf("La base del cuadrado es: %d", cuadrado1.getBase());
                                System.out.printf("La altura del cuadrado es: %d", cuadrado1.getAltura());
                                break;
                        }
                    }while (opcion != 4);

                    break;
            }
        }while (opcion != 4);




        sc.close();

    }//fin de main

}//fin de clase