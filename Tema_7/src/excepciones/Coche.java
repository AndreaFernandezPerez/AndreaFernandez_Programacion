package excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Coche {

    //métodos

    public void metodoUno() throws IOException {
        File file = new File("");
        FileWriter fw = new FileWriter(file);
    }
    public void metodoDos(boolean acierto){
        if (acierto){
            System.out.println("pasado un true");
        }else {

            try {
                throw new MiExcepcion("Error localizado en saldo");
            } catch (MiExcepcion e) {
                System.out.println(e.getMessage());
                //e.printStackTrace();
            }
        }
    }
    public void metodoTres(){}
    public void metodoCuatro(){}
}//fin de clase
