import java.util.ArrayList;

public final class Restaurante<T> {  //tipar tipo T?
    //variables
    private String nombre;
    private int numeroComensales, caja;
    private ArrayList<T> listaPedidos; //pendiente tipar tipo T?
    int contador = 0;

    //constructores
    public Restaurante(){
        this.listaPedidos = new ArrayList<>();
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.listaPedidos = new ArrayList<>();
    }

    //métodos
    public void colocarComensales(int numeroComensales){

        if (numeroComensales >= 50){
            new ExcepcionComensales("Restaurante lleno");
        }else{
            numeroComensales += numeroComensales;
        }
        //pendiente excepcion
    }

    public void registrarPedido(T pedido){
        listaPedidos.add(pedido);
        System.out.println("Pedido registrado");
    }

    public void verPedidos(){
        for (T item : listaPedidos) {
            System.out.println(item);
        }
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        this.numeroComensales = numeroComensales;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public ArrayList<T> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<T> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }


    //CLASE ANIDADA PEDIDO COMIDA

    class PedidoComida{
        //variables
        private double precio;
        private int numConsumicionComida;
        private Comida comida;

        //constructores

        public PedidoComida(int numConsumicionComida, String name) {
        }

        public PedidoComida(int numConsumicionComida, Comida comida) {
            this.numConsumicionComida = numConsumicionComida;
            this.comida = comida;
            if (comida.equals(Comida.menu.name())){
                precio = Comida.menu.getTarifa();
            }else if (comida.equals(Comida.bocadillo.name())){
                precio = Comida.menu.getTarifa();
            }else if (comida.equals(Comida.raciones.name())){
                precio = Comida.raciones.getTarifa();
            }
            precioRealComida();
        }

        //métodos
        public void precioRealComida(){
            this.precio = precio+(precio * Constantes.IVA_COMIDAS);
        }

        public void facturaComida(){
            System.out.println(getNombre());
            System.out.println(Constantes.CIF);
            System.out.println("Número de comensales: " + numConsumicionComida);
            System.out.println("Pedido: " + getComida());
            System.out.println("Tarifa: " + precio);
        }

        //getter y setter

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getNumConsumicionComida() {
            return numConsumicionComida;
        }

        public void setNumConsumicionComida(int numConsumicionComida) {
            this.numConsumicionComida = numConsumicionComida;
        }

        public Comida getComida() {
            return comida;
        }

        public void setComida(Comida comida) {
            this.comida = comida;
        }
    }


    //CLASE ANIDADA CONSUMICION BARRA
    class ConsumicionBarra{

        //variables
        private double precioBebida;
        private int numConsumicionBarra;
        //enum
        private String bebida;

        //constructores


        public ConsumicionBarra(int numConsumicionBarra, String bebida) {
            this.numConsumicionBarra = numConsumicionBarra;
            this.bebida = bebida;
            if (bebida == Bebidas.Refrescos.name()){
                precioBebida = Bebidas.Refrescos.getTarifas();
            }else if (bebida == Bebidas.Cervezas.name()){
                precioBebida = Bebidas.Cervezas.getTarifas();
            }else if (bebida == Bebidas.Copas.name()){
                precioBebida = Bebidas.Copas.getTarifas();
            }
            precioRealBebida();
        }

        //métodos
        public void precioRealBebida(){
            precioBebida = precioBebida+(precioBebida*Constantes.IVA_BEBIDAS);
        }

        public void facturaBebida(){
            System.out.println(getNombre());
            System.out.println(Constantes.CIF);
            System.out.println("Número de comensales: " + numConsumicionBarra);
            System.out.println("Pedido: " + bebida);
            System.out.println("Tarifa: " + precioBebida);
        }

        //getter y setter


        public double getPrecioBebida() {
            return precioBebida;
        }

        public void setPrecioBebida(double precioBebida) {
            this.precioBebida = precioBebida;
        }

        public int getNumConsumicionBarra() {
            return numConsumicionBarra;
        }

        public void setNumConsumicionBarra(int numConsumicionBarra) {
            this.numConsumicionBarra = numConsumicionBarra;
        }

        public String getBebida() {
            return bebida;
        }

        public void setBebida(String bebida) {
            this.bebida = bebida;
        }
    }



}//fin de clase restaurante
