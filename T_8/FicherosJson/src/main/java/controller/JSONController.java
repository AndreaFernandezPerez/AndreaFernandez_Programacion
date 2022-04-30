package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import model.Asignatura;
import model.Conocimiento;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class JSONController {

    ArrayList<Asignatura> listaAsignaturas;

    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";

    //Esto es para pasar un STRING a un JSON


    public void pasarStringJSON(){
        // STRING -- JSON (org.json) Para convertir String en JSON
        JSONObject jsonObject = new JSONObject(jsonString);
        // System.out.println(jsonObject);

        String nombre = jsonObject.getString("nombre");
        int edad = jsonObject.getInt("edad");
        JSONArray hobbies = jsonObject.getJSONArray("hobbies");
        System.out.println(nombre);
        System.out.println(edad);

        for (int i = 0; i < hobbies.length(); i++) {
            System.out.println(hobbies.getString(i));
        }
    }

    public void lecturaJSON(){
        File file = new File("src/main/resources/persona.json");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            // bufferedReader.readLine() --> Lee línea completa
            String linea = null;
            StringBuffer lecturaCompleta = new StringBuffer();

            while ((linea = bufferedReader.readLine()) != null){
                // cada vez que leas una línea, las vas metiendo en el StringBuffer
                lecturaCompleta.append(linea);
            }
            //pasar un Strig a JSON

            JSONObject jsonObject = new JSONObject(lecturaCompleta.toString());
            //System.out.println(jsonObject);
            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");
            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);

                /*
                String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println(concepto);
                System.out.println(experiencia);
                System.out.println("Los detalles del conocimientos " + concepto + " son:");
                JSONArray detalles = conocimiento.getJSONArray("detalle");
                for (int j = 0; j < detalles.length(); j++) {
                    String detalle = detalles.getString(j);
                    System.out.println(detalle);
                }
                */

                //convertimos más rápidamente a .java
                Gson gson = new Gson();
                Conocimiento conocimientoJava = gson.fromJson(conocimiento.toString(), Conocimiento.class);
                System.out.println(conocimientoJava.getConcepto());
                System.out.println(conocimientoJava.getExperiencia());
                for (String item : conocimientoJava.getDetalles()) {
                    System.out.println(item);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }// fin método lecturaJSON


    // leer el fichero entero
    // leer array de asignaturas

    public void leerJSONAsignaturas(String ciclo, int curso){

        // fichero que quiero leer
        File file = new File("src/main/resources/asignaturasDos.json");
        // leer el documento, siempre lo inicializamos en nulo, y lo inicializamos despues
        BufferedReader br = null;
        listaAsignaturas = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(file));
            String linea = null;
            StringBuffer lineaCompleta = new StringBuffer();

            while ((linea = br.readLine())!=null){
                lineaCompleta.append(linea);
            }

            // una vez que hemos leido el json

            JSONObject jsonAsignaturas = new JSONObject(lineaCompleta.toString());
            System.out.println(jsonAsignaturas); //saca to do el json

            JSONArray asignaturas = jsonAsignaturas.getJSONArray("asignaturas");
            System.out.println(asignaturas);


            // capturar todas las asignaturas individualmente y tener la posibilidad de tratarlas
            // como objetos JAVA, cada una independiente
            // y ver su curso y su ciclo
            for (int i = 0; i < asignaturas.length(); i++) {
                //con esto tenemos las asignaturas individuales
                JSONObject asignaturaJSON = asignaturas.getJSONObject(0);

                // asi convertimos a .java
                // creamos en el model una clase llamada asignatura, y tambien otra a nombre profesor
                // xq es otro json
                Gson gson = new Gson();
                // creamos una asignatura y tomamos el String, y la clase con la que nos guiamos
                //leemos
                Asignatura asignatura = gson.fromJson(asignaturaJSON.toString(), Asignatura.class);
                // comprobamos
                //caracteristicasAsignatura(asignatura, ciclo, curso);

                //leo e incluyo
                listaAsignaturas.add(asignatura);

                caracteristicasAsignaturasDos(ciclo,curso);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }//fin de método leerJSONAsignaturas

    public void caracteristicasAsignatura(Asignatura asignatura, String ciclo, int curso){

        if (asignatura.getCiclo().contains(ciclo) && asignatura.getCurso() == curso){
            System.out.println(asignatura.getSiglas());
            System.out.println(asignatura.getCurso());
            System.out.println(asignatura.getCiclo());

        }

    }// fin método caracteristicasAsignaturas

    // Pedir al usuario un curso y un ciclo del que quiere ver las asignaturas
        // dam
        // 1
    // el sistema debe mostrar las asignaturas del ciclo y curso pedido con el siguiente formato
        // nombre : x
        // profesor : x
        // siglas : x
        // duracin : x
        // conocimientos : xx xx xx

    // TODO pendiente corregir
    /*
    public void caracteristicasAsignaturasDos(String ciclo, int curso){
        for (Asignatura item : listaAsignaturas) {
            if (item.getCurso() == curso && item.getCiclo().contains(ciclo)){
                System.out.println(asignatura.getSiglas());
                System.out.println(asignatura.getCurso());
                System.out.println(asignatura.getCiclo());
                System.out.println("Conocimientos");
                for (String itemCon : item.getConocimientos()) {

                }
            }
        }
    }// fin de método caracteristicasAsignaturas
*/

    public void lecturaJSONAPI(int numero){

        String urlString = "https://randomuser.me/api/?results=10" + numero;

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // contestacion
            // leemos lineas a linea a traves de un flujo de datos de entrada
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String lectura = bufferedReader.readLine();
            // convertimos String a JSON objet
            JSONObject jsonObject = new JSONObject(lectura);
            System.out.println(jsonObject);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}// fin de clase
