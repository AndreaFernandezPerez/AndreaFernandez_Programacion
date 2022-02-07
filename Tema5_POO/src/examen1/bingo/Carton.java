package examen1.bingo;

import java.util.ArrayList;

public class Carton {
    //variables

    private ArrayList<Integer> listaNumeros;
    private int numeroAciertos;

    //constructores

    public Carton(){
        listaNumeros = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int aleatorio = (int)(Math.random()*51);
            listaNumeros.add(aleatorio);
        }
    }

    //metodos
    public void verNumeros(){
        for (Integer integer:listaNumeros) {
            System.out.println(integer);
        }
    }
    public void comprobarCarton(int numeroCarton){
        for (Integer integer: listaNumeros) {
            if (integer == numeroCarton){
                numeroAciertos++;
            }
        }
    }

    //métodos get y set

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }
}
//fin de clase}

