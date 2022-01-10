public class Entrada {

    //ámbito de clase. Lo que definamos aquí se podrá usar dentro de toda la clase, independientemente del método
    //String nombre = "Broja";

    public static void main(String[] args) {
        //ámbito de método. Lo que definamos aquí solo podrá ser usado en este apartado

        Usuario usuario1 = new Usuario(); //este será el constructor por defecto si no hay ninguno escrito
        //nombre=null, password=null, correo=null, edad=0... --> estás son las varibales de la clase Usuario

        Usuario usuario2 = new Usuario(); //creamos un segundo objeto de tipo Usuario
        //nombre="Por defector" correo="Por defecto"

        Usuario usuario3 = new Usuario("Borja", "borja.martin@ces.es", "pass");
        //nombre="Borja", password="pass", correo="borja.martin@ces.es, edad=0, fecha=null
        //los valores de edad y fecha siguen existiendo aunque sean null

        Usuario usuario4 = new Usuario("borja.martin@ces.es", "pass", 20);
        //nombre=null correo="borja.martin@ces.es" edad=20 fecha=null

        /* Lo siguiente no se debería poder hacer --> es decir no deberian ser variables public
        System.out.println(usuario1.password);
        usuario1.password = "constrasenia";
        //nombre="Por defecto" pass="contrasenia" correo="Por defecto" edad=0 fecha=null
        System.out.println(usuario1.password);
         */

        usuario1.setPassword("contrasenia");
        System.out.println(usuario1.getPassword());


    }//fin de main

}//fin de clase Entrada
