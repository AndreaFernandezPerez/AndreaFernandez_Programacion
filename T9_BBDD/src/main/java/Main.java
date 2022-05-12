import controller.ControlerBD;
import database.SchemeDB;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        * COSAS QUE HACEN FALTA PARA CONECTARSE CON BBDD
        * Connection --> BD
        *   motor: mysqul / orable / access
        *   host 127.0.0.1
        *   puerto: por defecto 3306
        *   usuario: root
        *   pass
        *   DBase
        *
        * Si en la sentencia qwery ha ido bien
        *
        * 1 Statement
        * En este statement, los tipos no los evalua el motor. Se pueden pasar sentencias/query erróneas
        *   CRUD
        *   bool
        *   int
        *   resultset
        * 2 Resultset
        *   R --> solo vale para consultas
        * 3 Prepare Statement
        * Los tipos se comprueban antes de hacer la query
        *
        * */
        Scanner sc = new Scanner(System.in);
        String nombre = null, apellido = null, continuar = null;
        int edad = 0;

        ControlerBD controlerBD = new ControlerBD();
        // controlerBD.insertarAlumnoStatement();

        // ejercicio insertar alumnos de manera recurrente
        // método insertAlumnoStatement(alumno)
        /*
        do {
            System.out.println("Intro nombre");
            nombre = sc.next();
            System.out.println("Intro apellido");
            apellido = sc.next();
            System.out.println("Intro edad");
            edad = sc.nextInt();
            Alumno alumno = new Alumno(nombre, apellido, edad);
            controlerBD.insertAlumnoStatement(alumno);
            System.out.println("¿Quieres continuar? (s/n)");
            continuar = sc.next();
        }while (continuar.equalsIgnoreCase("s"));
        */

        //ejercicio modificar edad alumno

        /*
        System.out.println("Nombre alumno a modificar edad");
        nombre = sc.next();
        System.out.println("¿Qué edad nueva le ponemos?");
        edad = sc.nextInt();
        controlerBD.updateEdad(nombre, edad);
        */

        controlerBD.getResultados();


        sc.close();




    }//fin de main
}//fin de clase
