public class Entrada {

    /*
    * HERENCIA
    * Hijos (subclase) de un padre (superclase) "obtienen métodos y atributos" del padre
    * - se utilizan equal() .equealIgnoreCAse() .toString  Java superclase --> Object
    * En java solo hay una super clase --> Object
    * Solo se hereda de la clase superior (solamente una clase)
    * Para heredar utilizo la palabra extends + nombreClase
    * Solo se rompe la herencia cuando los métodos y los atributos son private --> tendrán que ser protected o public
    *
    * La palabra super siempre hacer referencia a la superclase
    * en los constructores se pone en la primera línea
    * en los métodos se puede poner en cualquier línea del método
    * */

    public static void main(String[] args) {

        /* no va interesar crear nada de la superclase
        Coche coche = new Coche("1234xsw", "987", 100, 2000);
        coche.calcularVelocidad(80);
        System.out.println(coche.getVelocidad());
        */
        Deportivo deportivo = new Deportivo("2345bnm", "213", 200, 2550, 600);
        System.out.println(deportivo.getMatricula());
        deportivo.calcularVelocidad(120);
        System.out.println("Velocidad deportivo " + deportivo.getVelocidad());

        Electrico electrico = new Electrico("3456ytr", "345", 100, 1000, 60);
        Suv suv = new Suv ("4567sdf", "876", 150, 1600, true);
        Utilitario utilitario = new Utilitario("9848jnf", "694", 136, 1600, 5);

        electrico.calcularVelocidad(120);
        System.out.println("Velocidad electrico " + electrico.getVelocidad());

        suv.calcularVelocidad(120);
        System.out.println("Velocidad suv " + suv.getVelocidad());

        utilitario.calcularVelocidad(120);
        System.out.println("Velocidad utilitario " + utilitario.getVelocidad());

        deportivo.mostrarDatos();

        Concesionario concesionario = new Concesionario();
        concesionario.agregrarCoche(deportivo);
        concesionario.agregrarCoche(electrico);
        concesionario.agregrarCoche(suv);
        concesionario.agregrarCoche(utilitario);

        concesionario.borrarCoche("3456ygh");
        System.out.println("Listamos coches");
        concesionario.listarCoches();

    }//fin de main

}//fin de clase
