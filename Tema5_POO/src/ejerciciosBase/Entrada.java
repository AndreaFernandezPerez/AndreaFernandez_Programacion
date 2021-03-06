package ejerciciosBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedimos los datos con un Scanner
        System.out.println("Escriba su nombre");
        String nombre = sc.next();
        System.out.println("Escriba su apellido");
        String apellido = sc.next();
        System.out.println("Escriba su dni");
        String dni = sc.next();
        System.out.println("Escriba su edad");
        int edad = sc.nextInt();
        System.out.println("Escriba su peso");
        double peso = sc.nextDouble();
        System.out.println("Escriba su altura");
        int altura = sc.nextInt();

        //creamos la persona con los datos leídos por teclado
        Persona persona1 = new Persona(nombre, apellido, dni, edad, peso, altura);
        System.out.println("Datos persona 1 con Scanner \n");
        persona1.mostrarDatos(); //mostramos los datos

        //creamos una persona con datos introoducidos directamente
        Persona persona2 = new Persona("Andrea", "Fernández");
        System.out.println("Datos persona 2 a mano\n");
        persona2.mostrarDatos();

        //crear una persona sin datos asociados
        Persona persona3 = new Persona();
        System.out.println("Datos persona 3 sin datos\n");
        persona3.mostrarDatos();

        //modificar la edad de todas las personas a 20
        persona1.setEdad(20);
        persona2.setEdad(20);
        persona3.setEdad(20);

        System.out.println("Mostramos datos modificados de la edad \n");
        persona1.mostrarDatos();
        persona2.mostrarDatos();
        persona3.mostrarDatos();

        //pedimos los datos del método incrementarEdad
        persona1.incrementarEdad(10);

        System.out.println("\nMostramos IMC");
        System.out.println(persona1.calcularImc());

        //Ejercicio 4

        System.out.println(persona1.estadoIMC());




        sc.close();

    } //fin de main
}//
