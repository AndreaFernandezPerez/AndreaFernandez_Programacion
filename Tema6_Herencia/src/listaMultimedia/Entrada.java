package listaMultimedia;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        ArrayList<Elemento> listaElementos = new ArrayList<>();
        Libro libro = new Libro("1", "Libro", "Autor libro", 10, "digital", 300, 1234);
        Elemento libroElemento = new Libro ("2", "Revista", "Autor revista", 15, "papel", 100, 4321);
        Audio audio = new Audio("2","Audio", "Autor audio", 8, "digital", 5, "mp3");

        listaElementos.add(libro);
        listaElementos.add(audio);
        listaElementos.add(libroElemento);

        for (Elemento item : listaElementos) {
            item.mostrarDatos();
        }
        //.getClass() dice a que clase pertenece --> Libro.class
        System.out.println(libro.getClass());
        //esto un objeto de tipo String
        System.out.println(libro.getClass().getName());
        //esto dice el libro completp
        System.out.println(libro.getClass().getCanonicalName());
        //instance of es un boolean que compara si es lo mismo o no
        System.out.println(libro instanceof Libro);

        System.out.println(libroElemento instanceof Libro);

        //esto sirve para categorizar --> solo queremos sacar los libros
        for (Elemento item: listaElementos) {
            if (item instanceof Libro){
                ((Libro)item).metodoLibro();
            }else if (item instanceof Audio){
                item.mostrarDatos();
                ((Audio)item).metodoAudio();
            }else if (item instanceof Video){
                item.mostrarDatos();
            }
        }




    }//fin de main
}//fin de clase
