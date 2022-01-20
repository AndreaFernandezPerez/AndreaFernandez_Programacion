package ejercicios.carrera;

public class Entrada {
    public static void main(String[] args) {

        Coche cocheA = new Coche();
        Coche cocheB = new Coche("Opel", "1234QWR", 120);

        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        cocheA.setModelo("Audi");
        cocheA.setMatricula("9876zxc");
        cocheA.setCv(98);

        cocheA.setVelocidad((int)(Math.random() * (30 -10) +10));
        cocheB.setVelocidad((int)(Math.random() * (30 -10) +10));

        //ejecutamos el método acelerar para actualizar los datos de los km
        cocheA.acelerar(cocheA.getVelocidad());
        cocheB.acelerar(cocheB.getVelocidad());

        cocheA.mostrarDatos();
        cocheB.mostrarDatos();

        if (cocheA.getKmRecorridos() > cocheB.getKmRecorridos()){
            System.out.printf("El ganador es %s %s con %.2f", cocheA.getModelo(),cocheA.getMatricula(),cocheA.getKmRecorridos());
        }else {
            System.out.printf("El ganador es %s %s con %.2f", cocheB.getModelo(),cocheB.getMatricula(),cocheB.getKmRecorridos());
        }

    }//fin de main
}//fin de clase
