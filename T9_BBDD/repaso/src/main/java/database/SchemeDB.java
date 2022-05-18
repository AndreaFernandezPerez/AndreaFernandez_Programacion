package database;

public interface SchemeDB {
    String dtbs= "empresa";
    String user = "root";
    String pass = "";
    String host = "127.0.0.1:3306";

    String URL = "jdbc:mysql://" + SchemeDB.host + "/" + SchemeDB.dtbs
            + "?" + "user=" + SchemeDB.user + "&password=" + SchemeDB.pass;

    String TAB_PERFILES = "perfiles";
    String TAB_USUARIOS = "usuarios";
    String COL_ID = "id";
    String COL_NOMBRE = "nombre";
    String COL_APELLIDO = "apellido";
    String COL_TELEFONO = "telefono";
    String COL_SUELDO = "sueldo";
    String COL_PAIS = "pais";
    String COL_FK_ID = "id perfil";
}
