package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class EjercicioTres {

    String urlCartelera = "https://api.themoviedb.org/3/movie/now_playing?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";
    String urlProximo = "https://api.themoviedb.org/3/movie/upcoming?api_key=4ef66e12cddbb8fe9d4fd03ac9632f6e&language=en-US&page=1";



    public void lecturaCartelera(){


        try {
            URL url = new URL(urlCartelera);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//fin método lectura cartelera

}// fin de clase
