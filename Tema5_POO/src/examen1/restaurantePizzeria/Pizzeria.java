package examen1.restaurantePizzeria;

import java.util.ArrayList;

public class Pizzeria {

    //variables
    private ArrayList<Pizza> listaPizzas;
    private double caja;
    private int contador = 0;

    //contructures
    public Pizzeria(){

        listaPizzas = new ArrayList<>();
    }
    //métodos
    public void agregarPedido(Pizza pizza){
        pizza.setId(contador);
        this.listaPizzas.add(pizza);
        contador++;
    }

    public void servirPizza(int id){
        for (Pizza pizza : listaPizzas) {
            if (pizza.getId() == id){
                pizza.setEstado(true);
                pizza.calcularPrecio();
                caja += pizza.getPrecio();
            }
        }
    }

    public void verPendientes(){
        for (Pizza pizza : listaPizzas) {
            if(!pizza.isEstado()){
                pizza.verDatos();
            }
        }
    }

    //getter y setter

    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}//fin de clase
