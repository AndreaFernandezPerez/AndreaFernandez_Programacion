package ejerciciosBase;

public class Persona {

    //Variables
    private String nombre, apellido, dni;
    private int edad, altura;
    private double peso;

    //Constructores
    public Persona (){
        nombre = "Por defecto";
        apellido = "Por defecto";
        dni = "11111111X";
        edad = 0;
        altura = 0;
        peso = 0.0;
    }

    public Persona (String nombre, String apellido, String dni, int edad, double peso, int altura){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona (String nombre, String apellido, String dni, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public Persona (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        dni = "11111111X";
    }

    //Métodos

    public void mostrarDatos (){
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + apellido);
        System.out.println("DNI " + dni);
        System.out.println("Edad " + edad);
        System.out.println("Peso " + peso);
        System.out.println("Altura " + altura);
    }

    //Métodos getter y setter

    public String getNombre() {return nombre;}
    public String getApellido () {return apellido;}
    public String getDni() {return dni;}
    public int getEdad() {return edad;}
    public int getAltura() {return altura;}
    public double getPeso() {return peso;}

    public void setNombre (String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setDni (String dni) {this.dni = dni;}
    public void setEdad (int edad) {this.edad = edad;}
    public void setAltura(int altura) {this.altura = altura;}
    public void setPeso (double peso) {this.peso = peso;}

}//fin de clase Persona
