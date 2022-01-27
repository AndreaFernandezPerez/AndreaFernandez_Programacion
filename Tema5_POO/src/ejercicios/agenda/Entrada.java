package ejercicios.agenda;

public class Entrada {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Andrea", "12345678p", 678912345);

        persona1.mostrarDatos();

        Agenda agenda = new Agenda();

        agenda.agregar(persona1);


    }//fin de main
}//fin de clase
