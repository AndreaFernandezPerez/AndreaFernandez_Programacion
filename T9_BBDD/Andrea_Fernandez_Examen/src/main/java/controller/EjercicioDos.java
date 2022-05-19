package controller;

import database.SchemeDB;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;

public class EjercicioDos {

    private String urlJson = "https://run.mocky.io/v3/f608b6c0-260b-4600-a929-be12fac14261";
    private Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void leerJSON(){

        try {
            URL url = new URL(urlJson);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader bufferedReader;
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer stringBuffer = new StringBuffer();
            String linea = null;

            while ((linea = bufferedReader.readLine())!= null){
                stringBuffer.append(linea);
            }

            String response = stringBuffer.toString();
            JSONObject responseJSON = new JSONObject(response);
            JSONArray arrayResultados = responseJSON.getJSONArray("results");

            for (int i = 0; i < arrayResultados.length(); i++) {
                JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                //System.out.println(objetoResultado);
                String id = objetoResultado.getString("_id");
                String compania = objetoResultado.getString("company");
                String pais = objetoResultado.getString("country");
                String telefono = objetoResultado.getString("phone");
                int total = objetoResultado.getInt("invoice");
                /*
                System.out.println(id);
                System.out.println(compania);
                System.out.println(pais);
                System.out.println(telefono);
                System.out.println(total);
                */
                insertarFactura(id, compania, pais, telefono, total);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }// fin leerJSON

    private void getConnection(){
        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = SchemeDB.USER;
        String pass = SchemeDB.PASS;

        try {
            conn = DriverManager.getConnection(SchemeDB.URL);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    } //fin getConnection

    private void closeConnection(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }// fin closeConnection

    public void insertarFactura(String id, String compania, String pais, String telefono, int total){
        getConnection();
        try {
            statement = conn.createStatement();
            String query = String.format("INSERT INTO %s (%s,%s, %s, %s, %s) VALUES ('%s', '%s', '%s', '%s', %d)",
                    SchemeDB.TAB_FAC, SchemeDB.COL_ID, SchemeDB.COL_COMPANIA, SchemeDB.COL_PAIS, SchemeDB.COL_TELEFONO, SchemeDB.COL_TOTAL,
                    id, compania, pais, telefono, total);
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }// fin importar factura

    public void buscarTotal(int total){
        
    }// fin buscarTotal

}// fin clase
