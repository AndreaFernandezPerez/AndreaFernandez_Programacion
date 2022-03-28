package genericos;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Coleccion<Disco, Double, Boolean> coleccionDiscos = new Coleccion();
        coleccionDiscos.agregarCosas(new Disco());


        Coleccion<Camiseta, Character, String> coleccionCamiseta = new Coleccion();
        coleccionCamiseta.agregarCosas(new Camiseta());

       // Coleccion<Coche> coleccionCoche = new Coleccion();
      //  coleccionCoche.agregarCosas(new Coche());


        //si no tipamos podría entrar cualquier objeto
        Coleccion coleccionPartido = new Coleccion();
     //   coleccionPartido.agregarCosas(new Partido());
     //   coleccionPartido.agregarCosas(new Disco());
     //   coleccionPartido.agregarCosas(new Camiseta());

       // Coleccion<Coleccionable> coleccionColeccionables = new Coleccion();
      //  coleccionColeccionables.agregarCosas(new Disco());
     //   coleccionColeccionables.agregarCosas(new Camiseta());

        //no se podría agregar un coche, porque no formaría parte de un Coleccionable, no extienden/hereda
      //  coleccionColeccionables.agregarCosas(new Coche());

     //   Coleccion<Integer> coleccionNumeros = new Coleccion<>();

        ColeccionEspecifica<Camiseta> listaEspecifica = new ColeccionEspecifica<Camiseta>();

    }//fin main
}//fin de clase
