public enum Bebidas {

    Copas(7), Cervezas(3), Refrescos(2);

    int tarifas;

    Bebidas (int tarifas){
    }

    public int getTarifas() {
        return tarifas;
    }

    public void setTarifas(int tarifas) {
        this.tarifas = tarifas;
    }
}
