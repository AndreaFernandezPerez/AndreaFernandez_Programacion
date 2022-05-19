package database;

public interface SchemeDB {

    String URL_SERVER = "127.0.0.1:3306";
    String DB_NAME = "empresaExam";
    String USER = "root";
    String PASS = "";
    String TAB_FAC = "factura";
    String COL_ID = "id";
    String COL_COMPANIA = "compania";
    String COL_PAIS = "pais";
    String COL_TELEFONO = "telefono";
    String COL_TOTAL = "total";

    String URL = "jdbc:mysql://" + SchemeDB.URL_SERVER + "/" + SchemeDB.DB_NAME
            + "?" + "user=" + SchemeDB.USER + "&password=" + SchemeDB.PASS;

}
