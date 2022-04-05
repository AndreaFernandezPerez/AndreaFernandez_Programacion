public class Entrada {
    public static void main(String[] args) {

        //RESTAURANTE COMIDAS
        Restaurante<Restaurante.PedidoComida> restaurante = new Restaurante("La txakolina");
        restaurante.colocarComensales(4);

        System.out.println("PRIMER PEDIDO");
        Restaurante.PedidoComida comida = restaurante.new PedidoComida(3, Comida.menu.name());
        restaurante.registrarPedido(comida);
        comida.precioRealComida();
        System.out.println(comida.getPrecio());
        comida.facturaComida();


        System.out.println("SEGUNDO PEDIDO");
        Restaurante.PedidoComida comida2 = restaurante.new PedidoComida(5, Comida.raciones.name());
        restaurante.registrarPedido(comida2);
        comida2.precioRealComida();
        System.out.println(comida2.getPrecio());
        comida2.facturaComida();

        restaurante.verPedidos();

        //RESTAURANTE BARRA
        Restaurante<Restaurante.ConsumicionBarra> bar = new Restaurante<>("La oficina");
        bar.colocarComensales(10);

        System.out.println("TERCER PEDIDO");
        Restaurante.ConsumicionBarra bebida = restaurante.new ConsumicionBarra(5, Bebidas.Cervezas.name());
        bar.registrarPedido(bebida);
        bebida.precioRealBebida();
        System.out.println(bebida.getPrecioBebida());
        bebida.facturaBebida();

        System.out.println("CUARTO PEDIDO");
        Restaurante.ConsumicionBarra bebida2 = restaurante.new ConsumicionBarra(2, Bebidas.Refrescos.name());
        bar.registrarPedido(bebida2);
        bebida2.precioRealBebida();
        System.out.println(bebida2.getPrecioBebida());
        bebida2.facturaBebida();

        bar.verPedidos();

        //RESTAURANTE GENERAL
        Restaurante barRestaurante = new Restaurante("El pueblo");
        barRestaurante.registrarPedido(comida);
        barRestaurante.registrarPedido(bebida);


    }//fin de main
}//fin de entrada
