public class Usuario {

    //variables: definiremos todas aquellas que serán gestionadas por el usuario
    //en este apartado NO se le da valor a las variables, solo en contadas excepciones

    private String correoElectronico, nombre, apellido, password, fecha;
    private int edad; //si ponemos public, cualquier clase puede acceder a ello

    //constructores: aquellos métodos que permiten crear un objeto del tipo de la clase
    //siempre que no haya constructores escritos, hay un constructor que es el vacio (por defecto)
    //este constructor deja de existir cuando se escribe algún constructor
    // no se puede hacer un constructor con las mismas caracterísitcas que otro

    public Usuario(){
        //este constructor es recomendable escribirlo siempre, para evitar problemas, aunque esté vacio
        nombre = "Por defecto";
        correoElectronico = "Por defecto";
        edad = 18;
    }

    public Usuario(String nombre, String correoElectronico, String password){//esto es un constructor - Las variables no son las mismas que hemos creado anteriormente
        this.nombre = nombre; //relacionamos las variables de arriba con las del constructor. Cuando ponemos this. referencia a las variables definidas al principio.
                              //lo ponemos así porque las variables se llaman igual
        this.correoElectronico = correoElectronico;
        this.password = password;
    }

    public Usuario(String correoElectronico, String password, int edad){
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.edad = edad;
    }



    //métodos: todas aquellas funcionalidades, que esta clase podrá tener

    public void mostrarDatos (){  //metodo sin retorno, solo ejecuta, por el void
        System.out.println("Nombre " + nombre);
        System.out.println("Contraseña " + password);
        System.out.println("Email " + correoElectronico);
        System.out.println("Fecha " + fecha);
        System.out.println("Edad " + edad);
    }

    public String mostrarDatosRetorno (){ //metodo con retorno
        nombre = "Otra cosa" ;
        return "Nombre " + nombre + "\n" + "Apellido " + apellido;
    }

    public void saludar (String nombreSaludar){
        System.out.println("Hola " + nombreSaludar + ", ¿qué tal estás?");
    }

    public void saludar (Usuario usuario) {
        System.out.println("Hola soy "+ nombre + " y voy a saludar a " + usuario.getNombre() + ", ¿qué tal estás?");
    }


    //métodos: getter y setter --> son los métodos por los que se pueden devolver los datos de las variables

    //getter de password --> el getter coge un valor y lo devuelve
    //devuelve un valor pedido

    public String getPassword(){
        return password;
    }
    public String getCorreoElectronico(){
        return correoElectronico;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getFecha(){
        return fecha;
    }
    public int getEdad(){
        return edad;
    }

    //setter de pass --> pone un valor, no retorna nada

    public void setPassword(String password){
        this.password = password;
    }

    public void setCorreoElectronico(String correoElectronico){
        this.correoElectronico = correoElectronico;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}//fin de clase
