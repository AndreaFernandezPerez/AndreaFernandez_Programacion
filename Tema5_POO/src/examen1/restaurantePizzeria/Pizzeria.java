package examen1.restaurantePizzeria;

import java.util.ArrayList;

public class Pizzeria {

    //variables
    private ArrayList<Pizza> listaPizzas;
    private double caja;

    //contructures
    public Pizzeria(){
        listaPizzas = new ArrayList<>();
    }
    //métodos
    public void agregarPedido(Pizza pizza){
        this.listaPizzas.add(pizza);
    }
    //getter y setter

}//fin de clase
