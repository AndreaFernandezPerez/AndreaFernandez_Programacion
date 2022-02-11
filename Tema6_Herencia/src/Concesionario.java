import java.util.ArrayList;

public class Concesionario {
    //variables
    private ArrayList <Coche> listaCoches;

    //constructores

    public Concesionario(){
        this.listaCoches = new ArrayList<>();
    }

    //métodos

    public Coche existeCoche(String matricula){

        Coche cocheEncontrado = null;

        for (Coche item :listaCoches) {
            if (matricula.equalsIgnoreCase(item.getMatricula())){
                System.out.println("El coche ya existe");

                return cocheEncontrado;
            }
        }
        return cocheEncontrado; // return null;
    }

    public void agregrarCoche(Coche coche){

        if (existeCoche(coche.getMatricula())==(null)){
            listaCoches.add(coche);
        }
    }

    public void borrarCoche(String matricula){

        if (existeCoche(matricula)!= null){
            listaCoches.remove(existeCoche(matricula));
            System.out.println("Coche borrado");
        }else {
            System.out.println("Coche no encontrado");
        }
    }

    public void listarCoches(){

        for (Coche item: listaCoches) {
            item.mostrarDatos();
        }
    }


    //getter y setter

}//fin de clase
