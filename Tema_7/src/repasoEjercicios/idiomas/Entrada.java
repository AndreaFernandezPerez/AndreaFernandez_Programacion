package repasoEjercicios.idiomas;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Idioma castellano = new Idioma("Castellano", 100000)  {
            @Override
            public void saludar() {

                System.out.println("El saludo en " + getNombre() + " es " + getPalabras().get(0));
            }

            @Override
            public void despedir() {

                System.out.println("La despedida es: " + getNombre()+ " es " + getPalabras().get(1));
            }
        };

        Idioma ingles = new Idioma("Ingles", 80000) {
            @Override
            public void saludar() {

                System.out.println("El saludo en " + getNombre() + " es " + getPalabras().get(0));
            }

            @Override
            public void despedir() {

                System.out.println("La despedida es: " + getNombre()+ " es " + getPalabras().get(1));
            }
        };

        Idioma aleman = new Idioma("Aleman", 40000) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es " + getPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("La despedida es: " + getNombre()+ " es " + getPalabras().get(1));
            }
        };

        ArrayList<Idioma> idiomas = new ArrayList<>();

        castellano.ingresarPalabra("Hola");
        castellano.ingresarPalabra("Adios");
        castellano.ingresarPalabra("Gracias");

        ingles.ingresarPalabra("hello");
        ingles.ingresarPalabra("bye");
        ingles.ingresarPalabra("thank");

        aleman.ingresarPalabra("hallo");
        aleman.ingresarPalabra("tschüss");
        aleman.ingresarPalabra("danke");

        idiomas.add(castellano);
        idiomas.add(ingles);
        idiomas.add(aleman);

        for (Idioma item : idiomas) {
            item.saludar();
        }

        for (Idioma item : idiomas) {
            item.despedir();
        }

        for (Idioma item : idiomas) {
            item.listarPalabras();
        }


        Dialecto catalan = new Dialecto(castellano, 10000);
        catalan.calcularNumeroHablantes(30, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                catalan.setNumeroHablantes(catalan.getNumeroHablantes()*n);
            }
        });
        System.out.println(catalan.getNumeroHablantes());

    }//fin de main
}//fin de clase
