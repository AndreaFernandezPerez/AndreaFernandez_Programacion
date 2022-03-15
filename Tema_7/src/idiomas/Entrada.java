package idiomas;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Idiomas idioma1 = new Idiomas("Castellano", 500) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es " + getListaPalabras().get(0));

            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        Idiomas idioma2 = new Idiomas("Inglés", 250) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("El despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        Idiomas idioma3 = new Idiomas("Aleman", 150) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        ArrayList<Idiomas> listaIdiomas = new ArrayList<>();
        listaIdiomas.add(idioma1);
        listaIdiomas.add(idioma2);
        listaIdiomas.add(idioma3);

        idioma1.ingresarPalabra("hola");
        idioma1.ingresarPalabra("adiós");
        idioma1.ingresarPalabra("gracias");

        idioma2.ingresarPalabra("hello");
        idioma2.ingresarPalabra("bye");
        idioma2.ingresarPalabra("thank");

        idioma3.ingresarPalabra("hallo");
        idioma3.ingresarPalabra("tschüss");
        idioma3.ingresarPalabra("danke");

        for (Idiomas item : listaIdiomas) {
            item.saludar();
        }

        for (Idiomas item : listaIdiomas) {
            item.despedir();
        }

        System.out.println("listamos todas las palabras");
        for (Idiomas item : listaIdiomas) {
            item.listarPalabras();
        }


    }//fin de main
}//fin de clase
