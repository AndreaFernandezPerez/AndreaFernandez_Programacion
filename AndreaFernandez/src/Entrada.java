import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {

        Ingrediente ingrediente1 = new Ingrediente("queso", 0.50);
        Ingrediente ingrediente2 = new Ingrediente("piña", 1.00);
        Ingrediente ingrediente3 = new Ingrediente("york", 0.75);
        Ingrediente ingrediente4 = new Ingrediente("tomate", 0.60);

        //Crea una pizza margarita con 3 ingredientes
        Pizza margarita = new Pizza();
        margarita.agregarIngrediente(ingrediente1);
        margarita.agregarIngrediente(ingrediente2);
        margarita.agregarIngrediente(ingrediente3);
        margarita.setId(1);

        System.out.println("Los ingredientes de la pizza margarita son:");
        margarita.verDatos();

        //Crea una pizza cuatro queso con 6 ingredientes
        Pizza cuatroQuesos = new Pizza();
        cuatroQuesos.agregarIngrediente(ingrediente4);
        cuatroQuesos.agregarIngrediente(ingrediente1);
        cuatroQuesos.agregarIngrediente(ingrediente2);
        cuatroQuesos.agregarIngrediente(ingrediente3);
        cuatroQuesos.agregarIngrediente(new Ingrediente("atun", 1.50));
        cuatroQuesos.agregarIngrediente(new Ingrediente("aceitunas", 0.85));
        cuatroQuesos.setId(2);

        System.out.println("Los ingredientes de la pizza cuatro quesos son:");
        cuatroQuesos.verDatos();

        //Crea una piza hawaiana con 4 ingredientes
        Pizza hawaiana = new Pizza();
        hawaiana.agregarIngrediente(ingrediente2);
        hawaiana.agregarIngrediente(ingrediente3);
        hawaiana.agregarIngrediente(ingrediente4);
        hawaiana.agregarIngrediente(new Ingrediente("carne picada", 1.75));
        hawaiana.setId(3);

        System.out.println("Los ingredientes de la pizza hawaiana quesos son:");
        hawaiana.verDatos();


    }//fin de main
}//fin de clase
