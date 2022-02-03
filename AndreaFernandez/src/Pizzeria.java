import java.util.ArrayList;

public class Pizzeria {

    //variables
    private ArrayList<Pizza> pedidoPizza;
    private double caja;

    //contructores
    public Pizzeria(){
        pedidoPizza = new ArrayList<>();
    }
    public Pizzeria(ArrayList Pizza, int id){
        pedidoPizza = new ArrayList<>();
        
    }

    //métodos

    public void agregarPedido(Pizza pizza){
        pedidoPizza.add(pizza);
    }

    public void verEstadoPedido(int numeroPedido){

    }

    public void servirPedido(int numeroPedido){

        for (Pizza item: pedidoPizza) {
            if (item.getId()==numeroPedido){
                item.setEstado(true);
                break;
            }
            System.out.println("Pizza servida");
        }
    }

    //métodos get y set


    public ArrayList<Pizza> getPedidoPizza() {
        return pedidoPizza;
    }

    public void setPedidoPizza(ArrayList<Pizza> pedidoPizza) {
        this.pedidoPizza = pedidoPizza;
    }

    public double getCaja() {
        return caja;
    }

    public void setCaja(double caja) {
        this.caja = caja;
    }
}//fin de clase
