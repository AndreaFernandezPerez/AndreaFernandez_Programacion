package examen1.restaurantePizzeria;

import java.util.ArrayList;

public class Entrada {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        int contador = 0;
        ArrayList<Ingrediente> listaIngredientesMargarita = new ArrayList<>();

        listaIngredientesMargarita.add(new Ingrediente("jamon", 1));
        listaIngredientesMargarita.add(new Ingrediente("queso", 0.50));
        listaIngredientesMargarita.add(new Ingrediente("piña", 1.50));
        Pizza margarita1 = new Pizza("Andrea", listaIngredientesMargarita);
        contador++;
        Pizza margarita2 = new Pizza( "Iker", listaIngredientesMargarita);
        contador++;

        pizzeria.agregarPedido(margarita1);
        pizzeria.agregarPedido(margarita2);


        pizzeria.servirPizza(2);

        pizzeria.verPendientes();

        pizzeria.getCaja();

    }//fin de main
}//fin de clase
