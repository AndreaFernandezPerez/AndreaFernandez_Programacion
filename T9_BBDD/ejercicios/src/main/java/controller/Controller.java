package controller;

import database.SchemeDB;

import java.sql.*;

public class Controller {

    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    // MÉTODOS ABRIR Y CERRAR CONEXION

    private void getConnection(){ //abre conexion a la BBDD

        String host = SchemeDB.URL_SERVER; // url a la que nos queremos conectar
        String dtbs = SchemeDB.DB_NAME; // nombre de la base de datos a la que se quiere conectar
        String user = "root";
        String pass = "";

        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        // para que la url funcione, hay que llamar al DriverManager.getConnection

        try {
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog()); // devuelve el nombre de la base de datos
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }// fin método getConnection

    private void closeConnection(){ // cierra la conexion a la BBDD

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//fin método closeConnection

}//fin clase controller
