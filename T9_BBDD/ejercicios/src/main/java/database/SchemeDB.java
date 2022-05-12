package database;

public interface SchemeDB {

    String URL_SERVER = "127.0.0.1:3306";
    String DB_NAME = "cuentas";

    String TBL_PERFILES = "perfiles";
    //String ID_PERFILES = "id";
    //String NOMBRE_PERFILES = "nombre";
    // no es necesario crear variables independientes de id y nombre, aunque sean de tablas distintas
    String TBL_USUARIO = "usuario";
    String ID = "id";
    String NOMBRE = "nombre";
    String APELLIDO = "apellido";
    String TELEFONO = "telefono";
    String SUELDO = "sueldo";
    String PAIS = "pais";
    String PERFIL = "perfil";



}//fin de interfaz
