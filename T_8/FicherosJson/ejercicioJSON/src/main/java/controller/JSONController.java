package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONController {

    public void leerUsuarios(int numero, String genero){

        //String url = "https://randomuser.me/api/?results="+numero+"$gender="+genero;
        // mejor usar String.format
        String urlFormat = String.format("https://randomuser.me/api/?results=%s&gender%s", numero, genero);

        BufferedReader reader = null;
        try {
            URL url = new URL(urlFormat);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String linea = null;

            while ((linea = reader.readLine())!=null){
                stringBuilder.append(linea);
            }

            JSONObject jsonObject = new JSONObject(stringBuilder.toString());
            JSONArray resultados = jsonObject.getJSONArray("results");
            for (int i = 0; i < resultados.length(); i++) {
                JSONObject objetoResultado = resultados.getJSONObject(i);
                String mail = objetoResultado.getString("email");
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }// fn método leerUsuarios

}// fin jsoncontroller
