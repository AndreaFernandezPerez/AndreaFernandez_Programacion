package idiomas;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {

        Idiomas castellano = new Idiomas("Castellano", 500) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es " + getListaPalabras().get(0));

            }

            @Override
            public void despedir() {
                System.out.println("La despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        Idiomas ingles = new Idiomas("Inglés", 250) {
            @Override
            public void saludar() {
                System.out.println("El saludo en " + getNombre() + " es " + getListaPalabras().get(0));
            }

            @Override
            public void despedir() {
                System.out.println("El despedida en " + getNombre() + " es " + getListaPalabras().get(1));
            }
        };

        Idiomas aleman = new Idiomas("Aleman", 150) {
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
        listaIdiomas.add(castellano);
        listaIdiomas.add(ingles);
        listaIdiomas.add(aleman);

        castellano.ingresarPalabra("hola");
        castellano.ingresarPalabra("adiós");
        castellano.ingresarPalabra("gracias");

        ingles.ingresarPalabra("hello");
        ingles.ingresarPalabra("bye");
        ingles.ingresarPalabra("thank");

        aleman.ingresarPalabra("hallo");
        aleman.ingresarPalabra("tschüss");
        aleman.ingresarPalabra("danke");

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

        Dialecto catalán = new Dialecto(castellano, 50000);
        catalán.saludar();
        catalán.calcularNumeroHablantes(30, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                catalán.setNumeroHablantes(catalán.getNumeroHablantes()*n);
            }
        });

        Dialecto valenciano = new Dialecto(castellano, 20000);
        valenciano.saludar();
        valenciano.calcularNumeroHablantes(30, new Cuantificable() {
            @Override
            public void cuantificarHablantes(int n) {
                valenciano.setNumeroHablantes(valenciano.getNumeroHablantes()*(n/2));
            }
        });


    }//fin de main
}//fin de clase
