package ejercicios.agenda;

public class Entrada {
    public static void main(String[] args) {

        Persona persona = new Persona("Andrea", "47527777W", 675319999);
        persona.mostrarDatos();

        Agenda agenda = new Agenda();

        agenda.agregarPersona(persona);
        agenda.agregarPersona(new Persona("Iker", "12345678p", 654321987));

        agenda.agregarPersona(new Persona("Igor", "987654321q", 678954321));

        agenda.listar();
        if (agenda.borrarPersona2("987654321q")){

        }else {

        }

        agenda.borrarPersona("12345678P");

        //si has borrado a la persona saca un mensaje de borrado correctamente
        System.out.println("Después de borrar");
        agenda.listar();

        System.out.println("Buscando persona");
        agenda.buscarPersona("47527777W");

        System.out.println("Editar persona");
        agenda.editar("47527777W");
        System.out.println("Imprimimos la editación de la persona");
        agenda.buscarPersona("47527777W");

    }//fin de main
}//fin de clase
