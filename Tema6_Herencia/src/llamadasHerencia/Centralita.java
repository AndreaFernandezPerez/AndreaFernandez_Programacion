package llamadasHerencia;

import java.util.ArrayList;

public class Centralita {
    //variables
    private ArrayList<Llamada> listaLlamadas;
    private int costeAcumulado = 0;

    //constructores
    public Centralita(){
        this.listaLlamadas = new ArrayList<>();
    }

    //métodos
    public void registrarLlamada(Llamada llamada){
        listaLlamadas.add(llamada);
        llamada.mostrarDatos();
        this.costeAcumulado += llamada.getCoste(); //si lo ponemos aqui, no haría falta hacer el método calcular coste
                                                    // lo llamariamos con el get.coste
    }

    public void mostrarLlamadas(String tipoLlamada){
        switch (tipoLlamada){
            case "locales":
                listarLocales();
                break;
            case "provinciales":
                listarProvinciales();
                break;
            case "nacionales":
                listarNacionales();
                break;
            default:
                listarTodas();
        }
    }

    private void listarNacionales(){
        for (Llamada item: listaLlamadas) {
            if (item instanceof Nacional){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }
    private void listarLocales(){
        for (Llamada item: listaLlamadas) {
            if (item instanceof Local){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }
    private void listarProvinciales(){
        for (Llamada item: listaLlamadas) {
            if (item instanceof Provincial){
                System.out.println(item.getClass().getSimpleName());
                item.mostrarDatos();
            }
        }
    }

    private void listarTodas(){
        for (Llamada item : listaLlamadas) {
            System.out.println(item.getClass().getSimpleName());
            item.mostrarDatos();
        }
    }


    public void mostrarCostesTotales(){
        for (Llamada item: listaLlamadas) {
            costeAcumulado += item.getCoste();
        }
        System.out.println("El coste de todas las llamadas realizadas es: " + costeAcumulado);
    }

    //getter y setter

    public ArrayList<Llamada> getListaLlamadas() {
        return listaLlamadas;
    }

    public void setListaLlamadas(ArrayList<Llamada> listaLlamadas) {
        this.listaLlamadas = listaLlamadas;
    }

    public int getCosteAcumulado() {
        return costeAcumulado;
    }

    public void setCosteAcumulado(int costeAcumulado) {
        this.costeAcumulado = costeAcumulado;
    }
}//fin de clase
