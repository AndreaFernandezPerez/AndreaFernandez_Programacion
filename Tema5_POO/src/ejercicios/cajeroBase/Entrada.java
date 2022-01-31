package ejercicios.cajeroBase;

public class Entrada {
    public static void main(String[] args) {

        //creamos un cliente

        Cliente clienteUno = new Cliente();
        Cliente clienteDos = new Cliente("Andrea", "12345678W");

        clienteUno.mostrarDatos();
        clienteDos.mostrarDatos();

    }//fin de main
}//fin de clase
