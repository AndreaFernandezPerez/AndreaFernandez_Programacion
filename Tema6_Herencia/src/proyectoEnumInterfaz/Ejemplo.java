package proyectoEnumInterfaz;

public class Ejemplo {

    /* Clase Enum --> tiene objetos por defecto
    contiene métodos / consgtructores / atributos
    son como  "static"
    */

    Equipo equipo = Equipo.Madrid;
    Equipo equipo2 = Equipo.Barcelona;
    Equipo equipo3 = Equipo.Sevilla;
    Equipo equipo4 = Equipo.Getafe;
    Equipo equipo5 = Equipo.Alcorcon;

    public void mostrarDatos(){
        System.out.println(equipo.name()); //.name pasa a String el nombre del enum
        System.out.println(equipo2.name());
        System.out.println(equipo3.name());
        System.out.println(equipo4.name());
    }
    //no se pueden agregar equipo nuevos, pero si modificar sus atributos

    public void mostrarConjunto(){
        equipo5.setPresupuesto(800);
    }

}
