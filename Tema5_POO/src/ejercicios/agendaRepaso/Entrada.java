package ejercicios.agendaRepaso;

public class Entrada {
    public static void main(String[] args) {

        Persona personaUno = new Persona("Miryam", "12345678p", 678912345);
        Persona personaDos = new Persona("Merce", "98765432q", 654321987);

        Agenda agenda = new Agenda();
        agenda.agregarPersona(personaUno);
        agenda.agregarPersona(personaDos);

        agenda.listarAgenda();
        agenda.borrarPersona("12345678p");
        agenda.listarAgenda();

        agenda.editarPersona("98765432q");
        agenda.listarAgenda();

    }//fin de main
}//fin de clase

