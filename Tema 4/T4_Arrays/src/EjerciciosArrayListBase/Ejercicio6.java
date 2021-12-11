package EjerciciosArrayListBase;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {

        ArrayList<Object[]> coches = new ArrayList<>();
        Object [] cocheUno = {"Opel", "Astra", 136};
        Object [] cocheDos = {"Audi", "Q3", 160};
        Object[] cocheTres = {"Seat", "Ibiza", 98};

        coches.add(cocheUno);
        coches.add(cocheDos);
        coches.add(cocheTres);

        for (Object item: coches) {
            System.out.println(item);
        }

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
            for (int j = 0; j < coches.size(); j++) {
                System.out.println(coches.get(i));
            }
        }


    }//fin de main
}//fin de clase
