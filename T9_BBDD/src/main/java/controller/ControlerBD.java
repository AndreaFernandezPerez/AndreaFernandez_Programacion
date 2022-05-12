package controller;

import database.SchemeDB;
import model.Alumno;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

// acciones CRUD create read update delete


public class ControlerBD {

    private Connection conn;
    // los statement no comprueba los tipos de datos q se pasan a mysql
    private Statement statement;
    // preparedStatement si comprueba los tipos de datos que se pasan a la BBDD
    private PreparedStatement preparedStatement;

    private ResultSet resultSet;



    private void getConnection(){ //abre conexion a la BBDD

        String host = SchemeDB.URL_SERVER; // url a la que nos queremos conectar
        String dtbs = SchemeDB.DB_NAME; // nombre de la base de datos a la que se quiere conectar
        String user = "root"; // podemos llamar a la Interfaz para poner los datos
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

    public void insertarAlumnoStatement(){

        // para poder crear una query necesitamos un Statement y tener una conexion primero
        String nombre = "Andrea";
        String apellido = "Fernandez";
        int edad = 34;

        try {
            getConnection(); // abrimos la conexion
            statement = conn.createStatement();

            // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('Borja', 'Martin', 38); nos creamos un String
            String queryFormat = String.format ("INSERT INTO %s (%s, %s, %s) VALUES (%s, %s, %d)",
                    SchemeDB.DB_NAME, SchemeDB.COL_NAME, SchemeDB.COL_APELLIDO, SchemeDB.COL_EDAD,
                    nombre, apellido, edad);
            // statement.execute(); devuelve un boolean de si la sentencia se ha realizado o no
            // .executeUpdate(), devuelve el int, indicando el número de tuplas afectadas
            int numRow = statement.executeUpdate(queryFormat);

            System.out.println(numRow);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close(); // es recomendable cerrar la conexion del statement
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection(); // cerramos la conexion
        }
    } // fin método insertarAlumno



    /* Desde la entrada, pedir al usuario datos para introducri alumnos (recursivo)
    *  el alumno se mete en base de datos
    *  mediante un modelo */

    public void insertAlumnoStatement(Alumno alumno){
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            statement = conn.createStatement();

            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s','%s',%d)",SchemeDB.TAB_ALU,
                    SchemeDB.COL_NAME,SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD,
                    alumno.getNombre(),alumno.getApellido(),alumno.getEdad());
            //int numeroRow = statement.executeUpdate(queryFormat);
            if (statement.executeUpdate(queryFormat)>0){
                System.out.println("Alumno insertado correctamente");
            }
            //System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }

    }// fin insertAlumnoStatement

    public void insertarAlumnoPrepare(){
        String nombre = "Iker";
        String apellido = "Elorduy";
        int edad  = 38;

        String query = "INSERT INTO alumnos (nombre, apellido, edad) VALUES (?,?,?)";

        try {
            getConnection();
            // no ejecuta la query --> la deja preparada
            preparedStatement = conn.prepareStatement(query);
            // despues metemos los datos y hasta que no están correctos no "entran"
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, apellido);
            preparedStatement.setInt(3, edad);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }// fin método insertarAlumnoPrepare


    /*  modificar la edad de un usuario. Para ello el sistema pedirá el nombre del usuario
    *  la nueva edad del mismo. Una vez realizada la modificacion, el sistema
    * avisará del número de usuarios que ha cambiado
    * sout: SE HAN ACTUALIZADO X USUARIOS
    *
    * borrar los usuarios. Para ello el sistema pedirá una edad y borrará todos aquellos usuarios
    * que tengan una edad inferior a la pedida por el sistema
    * el sistema avisará del número de usuarios borrados*/

    public void updateEdad(String nombre, int edad){

        /*
        * String query = "UPDATE alumnos" + "SET edad = 30, " + "WHERE nombre = 'borja'";
        * */

        String query = "UPDATE %s SET %s = ? WHERE %s = ?";
        getConnection();
        try {
            preparedStatement = conn.prepareStatement(String.format(query, SchemeDB.TAB_ALU, SchemeDB.COL_EDAD, SchemeDB.COL_NAME));
            preparedStatement.setInt(1, edad); //sustituimos la primera ? por edad
            preparedStatement.setString(2, nombre);
            int rows = preparedStatement.executeUpdate();
            System.out.println("los cambios afectados son " + rows);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }


    }// fin método updateEdad

    public void deleteElement(int edad){

        /*
         * String query = "UPDATE alumnos" + "SET edad = 30, " + "WHERE nombre = 'borja'";
         * */

        String query = "DELETE FROM %s WHERE %s < ?";
        getConnection();
        try {
            preparedStatement = conn.prepareStatement(String.format(query, SchemeDB.TAB_ALU, SchemeDB.COL_EDAD));
            preparedStatement.setInt(1, edad); //sustituimos la primera ? por edad
            int rows = preparedStatement.executeUpdate();
            System.out.println("los borrados afectados son " + rows);


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }


    }// fin método deleteElement

    public void getResultados(){

        ArrayList<Alumno> alumnos = new ArrayList<>();
        getConnection();
        try {
            statement = conn.createStatement();
            String query = "SELECT * FROM "+ SchemeDB.TAB_ALU;
            resultSet = statement.executeQuery(query);
            // System.out.println(resultSet.getRow()); // nos dice la posición donde estás ubicado
            /*resultSet.next();//me muevo a la siguiente posición / tupla
            String nombre = resultSet.getString(SchemeDB.COL_NAME);
            String apellido = resultSet.getString(SchemeDB.COL_APELLIDO);
            int edad = resultSet.getInt(SchemeDB.COL_EDAD);
            int id = resultSet.getInt(SchemeDB.COL_ID);
            System.out.println(nombre);
            System.out.println(apellido);
            System.out.println(edad);
            System.out.println(id);
            */

            // vemos todos los resultados de la tabla
            while (resultSet.next()){
                String nombre = resultSet.getString(SchemeDB.COL_NAME);
                String apellido = resultSet.getString(SchemeDB.COL_APELLIDO);
                int edad = resultSet.getInt(SchemeDB.COL_EDAD);
                int id = resultSet.getInt(SchemeDB.COL_ID);
                Alumno alumno = new Alumno(nombre, apellido, edad);
                alumnos.add(alumno);
                System.out.println(alumno.getNombre());
                System.out.println(alumno.getApellido());
                System.out.println(alumno.getEdad());
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                closeConnection();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//fin método getResultados

}// fin de clase
