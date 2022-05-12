package database;

/* En la interfaz creamos los datos de la base de datos de mysqls
*  incluido el nombre del database y la tabla
* */

public interface SchemeDB {

    String URL_SERVER = "127.0.0.1:3306";
    String DB_NAME = "colegio";
    String TAB_ALU = "alumnos";
    String COL_NAME = "nombre";
    String COL_APELLIDO = "apellido";
    String COL_ID = "id";
    String COL_EDAD = "edad";

}//fin de interfaz
