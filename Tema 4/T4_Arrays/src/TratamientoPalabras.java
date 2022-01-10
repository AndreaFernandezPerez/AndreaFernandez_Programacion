public class TratamientoPalabras {
    public static void main(String[] args) {

        String palabraTratar = "Ejemplo de palabra";

        palabraTratar.toLowerCase(); // pone todas las letras en minusculas
        System.out.println(palabraTratar.toLowerCase());
        palabraTratar.toUpperCase(); // pone todas las letras en minusculas
        System.out.println(palabraTratar.toUpperCase());

        String palabraComparar = "Esto es un ejemplo";

        //Las palabras NUNCA se comparan con ==
        if (palabraTratar.equals(palabraComparar)){
            System.out.println("Son iguales");
        }else {
            System.out.println("Son diferentes");
        }
        //comparamos poniendo todos los caracteres en minúscula
        if (palabraTratar.toLowerCase().equals(palabraComparar.toLowerCase())){
            System.out.println("Son iguales");
        }else {
            System.out.println("Son diferentes");
        }
        //comparamos ignorando si hay mayusculas o minusculas
        if (palabraTratar.equalsIgnoreCase(palabraComparar)){
            System.out.println("son iguales");
        }else {
            System.out.println("son diferentes");
        }

        String fraseCompleta = "Esto es una frase completa de un conjunto de palabras";

        //Saber cuantos caracteres tengo
        System.out.println(fraseCompleta.length());

        //Saber cuantas palabras tengo. Creamos un array de palabras (String) y dividimos el String con split por donde queremos cortarlas, en este caso por el espacio
        String [] palabras = fraseCompleta.split(" ");
        System.out.println("El número de palabras es: " + palabras.length);//con esto sabemos cuantas palabras tenemos (valores del array)

        //saber cuantas letras tenemos
        int letrasTotales = 0;
        for (String item: palabras) {
            item.length(); //esto es cuantas letras tengo en la palabra que me toca
            letrasTotales += item.length(); //sumamos todas las letras que tenemos
        }
        System.out.println("El número total de letras es: " + letrasTotales);

        //remplazamos valores. Podemos concatenar tantos valores como queramos
        fraseCompleta.replaceAll(" ", "").replaceAll(",", ""); //primer valor --> lo que queremos remplazar, segundo valor --> por lo que lo remplazo
        System.out.println("El número de letras es: " + fraseCompleta.replaceAll(" ", "").length());

        //Con esto pedimos la letra que queremos en una posición
        fraseCompleta.charAt(0);

        //Imprimimos todas las letras
        for (int i = 0; i < fraseCompleta.length(); i++) {
            System.out.println(fraseCompleta.charAt(i)); //contabiliza todos los valores, incluidos los espacios
            if (fraseCompleta.charAt(i) != ' '){
                System.out.println(fraseCompleta.charAt(i));
            }
        }

        //Para saber que posición tiene una letra en la primera concurrencia
        System.out.println(fraseCompleta.indexOf("a"));
        //Para saber que posición tiene una letra en la primera concurrencia empezando por el final
        fraseCompleta.lastIndexOf("a");
        //Para saber que posición tiene una letra apartir de una posición concreta
        fraseCompleta.lastIndexOf("e", 10);

        //devuelve un String comprendido desde las posiciones que le indiquemos
        fraseCompleta.substring(10, 20);

        //Ejercicio práctica
        //Sacar el nombre de usuario y el dominio, trabajando con el substring

        String correo = "borja.martin@cesjuanpablosegundo.es";
        correo.indexOf("@");//nos dice que posicion tiene el @
        String nombre = correo.substring(0, correo.indexOf("@")); //empezamos desde una posicion, e indicamos también la última
        String dominio = correo.substring(correo.indexOf("@")+1, correo.length());

        System.out.println(nombre);
        System.out.println(dominio);



    }//fin de main
}//fin de clase

