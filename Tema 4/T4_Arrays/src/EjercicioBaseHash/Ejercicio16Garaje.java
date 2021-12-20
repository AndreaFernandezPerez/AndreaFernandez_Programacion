package EjercicioBaseHash;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Ejercicio16Garaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        Hashtable <String, Object[]> listaGaraje = new Hashtable();


        do {
            System.out.println("Que opción quieres realizar");
            System.out.println("1. Añadir coche al taller");
            System.out.println("2. Listar coches");
            System.out.println("3. Buscar coches");
            System.out.println("4. Mostrar costes");
            System.out.println("5. Eliminar coche");
            System.out.println("6. Vaciar garaje");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Introduce la marca");
                    String marca = sc.next();
                    System.out.println("Introduce el modelo");
                    String modelo = sc.next();
                    System.out.println("Introduce matrícula");
                    String matricula = sc.next();
                    System.out.println("Introduce el coste");
                    Double coste = sc.nextDouble();
                    Object [] coche = {marca, modelo, matricula, coste};
                    System.out.println("Coche recepcionado");
                    listaGaraje.put(coche[2].toString(), coche);
                    break;
                case 2:
                    Enumeration<Object[]> listaMatriculaEnum = listaGaraje.elements();
                    System.out.println("Listamos coches");
                    while (listaMatriculaEnum.hasMoreElements()){
                        Object[] contieneListaMatricula =  listaMatriculaEnum.nextElement();
                        for (Object item : contieneListaMatricula) {
                            System.out.println(item);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Introduce la matrícula del coche a buscar");
                    String matriculaBuscar = sc.next();

                    boolean matriculaEsta = listaGaraje.containsKey(matriculaBuscar);

                    if (matriculaEsta){
                        for (Object item : listaGaraje.get(matriculaBuscar)) {
                            System.out.println(item);
                        }
                    }
                    if (!matriculaEsta){
                        System.out.println("El coche no se encuentra en el garaje");
                    }
                    break;
                case 4:
                    double costeAcumulado = 0.0;
                    Enumeration<Object[]> recorrerCostes = listaGaraje.elements();

                    while (recorrerCostes.hasMoreElements()){
                        recorrerCostes.nextElement();
                    }

                    break;
            }

        }while (opcion != 7);




        sc.close();

    }//fin de main
}//fin de clase
