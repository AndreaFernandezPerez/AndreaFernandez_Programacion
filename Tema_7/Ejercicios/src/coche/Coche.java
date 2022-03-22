package coche;

public class Coche {
    //variables
    private double precio;
    private int velocidad;
    private String marca, modelo;
    private Motor motor;

    //constructores

    public Coche() {
    }

    public Coche(int precio, String marca, String modelo) {
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;

    }

    //métodos
    public void mostrarDatosCoche(){
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        if (motor!=null){
            this.motor.mostrarDatosMotor();
        }else {
            System.out.println("El coche no tiene motor");
        }

    }

    //getter y setter

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        if(motor.cv > 0 && motor.cv <50){
            precio *= 1.25;
        }else if(motor.cv >=50 && motor.cv <100){
            precio *= 1.30;
        }else if (motor.cv > 100 && motor.cv <20){
            precio *= 1.40;
        }else {
            precio *= 1.60;
        }
    }
    //clase anidada

    class Motor{
        //variables
        private int cv, cc;

        //contructores

        public Motor() {
        }

        public Motor(int cv, int cc) {
            this.cv = cv;
            this.cc = cc;
            setMotor(this);  //es la manera de asociar la clase padre con la hija
        }


        //métodos

        public void mostrarDatosMotor(){
            System.out.println("CV: " + cv);
            System.out.println("CC: " + cc);
        }

        //getter y setter


        public int getCv() {
            return cv;
        }

        public void setCv(int cv) {
            this.cv = cv;
        }

        public int getCc() {
            return cc;
        }

        public void setCc(int cc) {
            this.cc = cc;
        }

    }//fin de clase motor

}//fin de clase coche
