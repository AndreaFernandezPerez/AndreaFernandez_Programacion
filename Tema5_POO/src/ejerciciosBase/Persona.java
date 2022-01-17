package ejerciciosBase;

public class Persona {

    //Variables
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    //Constructores

    //crear un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 11111111X, y 0 respectivamente
    public Persona (){
        this.nombre = "Por defecto";
        this.apellido = "Por defecto";
        this.dni = "11111111X";
    }

    //constructor que permita crear una persona con todos los datos
    public Persona (String nombre, String apellido, String dni, int edad, double peso, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    //crear un constructor que permita crear una persona sin peso ni altura
    public Persona (String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    //crear un constructo que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que pondrá 11111111X
    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        dni = "11111111X";
    }

    //Métodos

    //crear un metodo mostrarDatos que sacará por pantalla los datos de la persona formateado
    public void mostrarDatos (){
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("DNI " + dni);
        System.out.println("Edad " + edad);
        System.out.println("Peso " + peso);
        System.out.println("Altura " + altura);

        //tambien podemos poner
        //System.out.printf("Nombre: %s\nApellido: %s\nEdad: %d, nombre, apellido, edad");
    }

    public void incrementarEdad (int cantidadSumar){
        this.edad += cantidadSumar; //no es necesario poner el this, porque el parámetro no se llama igual (parámetro incrementarEdad)
    }

    //método que calcula y devuelve IMC
    public double calcularImc (){
        double imc = this.peso/Math.pow(this.altura,2);

        return imc;
    }

    //método para mostrar por consola el estado físico. Ejercicio 4
    public String estadoIMC (){
        double IMC = calcularImc()*10000; //llamamos al valor de imc del método anterior
        String estado = "";
        if (IMC < 18.5){
            estado = "inferior a normal";
        }else if (IMC > 18.5 && IMC < 24.9){
            estado = "nomal";
        }else if (IMC > 24.9 && IMC < 30.0){
            estado = "peso superior a lo normal";
        }else {
            estado = "obesidad";
        }
        return estado;
    }

    //Métodos getter y setter

    //get obtener el valor de la variable
    public String getNombre() {return nombre;}
    public String getApellido () {return apellido;}
    public String getDni() {return dni;}
    public int getEdad() {return edad;}
    public int getAltura() {return altura;}
    public double getPeso() {return peso;}

    //set modificar el valor de la variable
    public void setNombre (String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setDni (String dni) {this.dni = dni;}
    public void setEdad (int edad) {this.edad = edad;}
    public void setAltura(int altura) {this.altura = altura;}
    public void setPeso (double peso) {this.peso = peso;}

}//fin de clase Persona
