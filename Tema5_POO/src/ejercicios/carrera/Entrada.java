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
            System.out.printf("El ganador es %s %s con %.2f\n", cocheA.getModelo(),cocheA.getMatricula(),cocheA.getKmRecorridos());
        }else {
            System.out.printf("El ganador es %s %s con %.2f\n", cocheB.getModelo(),cocheB.getMatricula(),cocheB.getKmRecorridos());
        }

        System.out.println("El ganador de la etapa");
        int kmEtapa = 10000;

        do {
            cocheA.acelerar((int)(Math.random()*11));
            cocheB.acelerar((int)(Math.random()*11));

        }while (cocheA.getKmRecorridos() <= kmEtapa || cocheB.getKmRecorridos() <= kmEtapa );

        if (cocheA.getKmRecorridos() >= cocheB.getKmRecorridos()){
            System.out.printf("El ganador es %s %s con %f km recorridos \n", cocheA.getModelo(), cocheA.getMatricula(), cocheA.getKmRecorridos());
        }else if (cocheB.getKmRecorridos() >= cocheA.getKmRecorridos()){
            System.out.printf("El ganador es %s %s con %f km recorridos\n", cocheB.getModelo(), cocheB.getMatricula(), cocheB.getKmRecorridos());
        }



    }//fin de main
}//fin de clase
