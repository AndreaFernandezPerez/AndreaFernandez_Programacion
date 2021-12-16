package EjerciciosT4Parte2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17Agenda {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        ArrayList<Object[]> listaPersonas = new ArrayList<>();

        do {
            System.out.println("Que opcion quieres realizar");
            System.out.println("1. Agregar una persona");
            System.out.println("2. Buscar una persona");
            System.out.println("3. Borrar una persona");
            System.out.println("4. Listar personas");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:

                    System.out.println("Introduce el nombre");
                    String nombre = sc.next();
                    System.out.println("Introduce el apellido");
                    String apellido = sc.next();
                    System.out.println("Introduce el teléfono");
                    int telefono = sc.nextInt();
                    System.out.println("Introduce el dni");
                    String dni = sc.next();
                    Object [] persona = {nombre, apellido, telefono, dni};

                    boolean personaEncontrada = false;

                    for (Object[] item : listaPersonas) {
                        if (item[3].toString().equalsIgnoreCase(dni)){
                            personaEncontrada = true;
                            System.out.println("La persona ya está registrada");
                            break;
                        }
                    }
                    if (!personaEncontrada){
                        listaPersonas.add(persona);
                        System.out.println("Persona agregada");
                    }
                    break;
                case 2:
                    System.out.println("Introduce el dni de la persona a buscar");
                    String dniBuscado = sc.next();
                    personaEncontrada = false;
                    for (Object[] personas : listaPersonas) {
                        if (personas[3].toString().equalsIgnoreCase(dniBuscado)){
                            System.out.printf(" Nombre: %s\n Apellido: %s\n Teléfono: %d\n DNI: %s\n", personas[0],
                                    personas[1], personas[2], personas[3]);
                            break;
                        }
                        if (!personaEncontrada){
                            System.out.println("La persona no está en la agenda");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce el dni de la persona a buscar");
                    dniBuscado = sc.next();
                    personaEncontrada = false;

                    for (int i = 0; i < listaPersonas.size(); i++) {
                        if (listaPersonas.get(i)[3].toString().equalsIgnoreCase(dniBuscado)){
                            personaEncontrada = true;
                            listaPersonas.remove(i);
                            System.out.println("Se ha eliminado la persona de la agenda");
                            break;
                        }
                    }
                    if (!personaEncontrada){
                        System.out.println("La persona no está en la agenda");
                    }
                    break;
                case 4:
                    for (Object[] item: listaPersonas) {
                        System.out.printf(" Nombre: %s\n Apellido: %s\n Teléfono: %d\n DNI: %s\n", item [0], item [1], item [2], item [3]);
                    }
                    break;
            }

        }while (opcion != 0);
        sc.close();

    }//fin de main
}//fin de clase
