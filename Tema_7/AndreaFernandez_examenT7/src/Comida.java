public enum Comida {

    menu(10), raciones(5), bocadillo(3);

    int tarifa;

    Comida (int tarifa){
        this.tarifa = tarifa;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }
}
