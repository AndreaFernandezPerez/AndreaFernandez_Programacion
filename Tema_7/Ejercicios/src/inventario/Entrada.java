package inventario;

import java.util.logging.FileHandler;

public class Entrada {
    public static void main(String[] args) {

        Silla silla = new Silla("Roble", 5, 100, 4);
        silla.calcularPrecio();

        Carne filete = new Carne ("Superior", "Galicia", 120, 20);
        filete.calcularPrecio();

        Mesa mesa = new Mesa("Encina", 20, 300, 6);
        mesa.calcularPrecio();

        Lacteo leche = new Lacteo("Premium", "Asturias", 12, 24);
        leche.calcularPrecio();

        Supermercado<Alimento> supermercadoAlimentos = new Supermercado<>();
        supermercadoAlimentos.anadirGenero(filete);
        supermercadoAlimentos.anadirGenero(leche);
        //supermercadoAlimentos.mostrarPrecioFinales();
        //supermercadoAlimentos.listarDatos();

        Supermercado<Mueble> supermercadoMuebles = new Supermercado<>();
        supermercadoMuebles.anadirGenero(mesa);
        supermercadoMuebles.anadirGenero(silla);
       // supermercadoMuebles.mostrarPrecioFinales();
       // supermercadoMuebles.listarDatos();

        Supermercado<Inventariable> supercadoGenerico = new Supermercado<>();
        supercadoGenerico.anadirGenero(silla);
        supercadoGenerico.anadirGenero(mesa);
        supercadoGenerico.anadirGenero(leche);
        supercadoGenerico.anadirGenero(filete);
        supercadoGenerico.listarDatos();
        supercadoGenerico.mostrarPrecioFinales();


    }//fin de main
}//fin de clase
