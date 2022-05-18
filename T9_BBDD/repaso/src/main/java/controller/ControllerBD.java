package controller;

import database.SchemeDB;

import java.sql.*;

public class ControllerBD {

    Connection connection;
    Statement statement = null;
    PreparedStatement preparedStatement = null;

    // String newConnectionURL = "jdbc:mysql://" + SchemeDB.host + "/" + SchemeDB.dtbs
        //    + "?" + "user=" + SchemeDB.user + "&password=" + SchemeDB.pass;


    private void getConnection(){

        try {
            connection = DriverManager.getConnection(SchemeDB.URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// fin método getConnection

    private void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }//fin método closeConnection

    public void insertarPerfiles(){
        getConnection();
        try {
            statement = connection.createStatement();
            String query = "INSERT INTO %s (%s) VALUES ('Gerente')";
            statement.execute(String.format(query, SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query2 = "INSERT INTO %s (%s) VALUES ('Trabajador')";
            statement.execute(String.format(query2, SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
            String query3 = "INSERT INTO %s (%s) VALUES ('Director')";
            statement.execute(String.format(query3, SchemeDB.TAB_PERFILES, SchemeDB.COL_NOMBRE));
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    } // fin método insertarPerfilees

    public void insertarUsuarios(){

        getConnection();
        String query = "INSERT INTO %s (%s, %s, %s, %s, %s) VALUES (?, ?, ?, ?, ?)";
        String queryFormat = String.format(query, SchemeDB.TAB_USUARIOS, SchemeDB.COL_NOMBRE, SchemeDB.COL_APELLIDO,
                            SchemeDB.COL_TELEFONO, SchemeDB.COL_PAIS, SchemeDB.COL_FK_ID);
        try {
            preparedStatement = connection.prepareStatement(queryFormat);
            preparedStatement.setString(1, "Heide-Marie");
            preparedStatement.setString(2, "Rausch");
            preparedStatement.setInt(3, 124);
            preparedStatement.setString(4, "Holanda");
            preparedStatement.setInt(5,1);
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }//fin método insertarUsuarios

}//fin de clase
