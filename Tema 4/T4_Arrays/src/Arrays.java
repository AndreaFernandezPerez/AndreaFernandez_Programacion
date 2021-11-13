public class Arrays {
    public static void main(String[] args) {
        /**
         * int numeroDos = 9; solo guarda una cosa
         * String palabra = "blabla"; solo guarda una cosa
         *
         * Los arrays es un conjunto de datos (colección) con un tamaño fijo. Todas las posiciones están rellenas (aunque solo utilicemos algunos huecos)
         *
         * Para inicializar un array de números
         * int [] numeros
         * Para inicializar un arrray de palabras
         * String [] palabras
         *
         * boolean [] aciertos
         *
         * char [] letras
         *
         * Es necesario decir qué o cuantos elementos hay
         *
         * Se puede crear arrays de lo que nos interese
         */

        //Como declaramos los arrays

        int [] numeros = new int [10]; //array de 10 posiciones, no se podrán guardar más lo que está guardado es [0,0,0,0,0,0,0,0,0,0,]
        int [] numerosDos = {1,2,3,4,5,6,7,8,9,10};//otra manera de inicializarlo pero ya con los datos introducidos
        boolean [] aciertos = new boolean[5]; // lo que se ha guardado es [false, false, false, false, false], porque es el dato menos lesivo
        String [] palabras = new String [3];// [null, null, null] como es un tipo complejo, NO tiene valor
        double [] decimales = new double[2];//en este caso no es necesario poner new double [], y si lo pongo NO hay que poner el número entre los corchetes

        //tipo[]cosas = guardar diferentes tipos (int string boolean)
        Object [] cositas = {1, "hola", numerosDos};

        /**
         * De los arrays nos interesa saber:
         * 1. El valor de una posicion
         * 2. Cuantos elementos tiene (longitud)
         * 3. Como doy valor a una posicion (modificarlos)
         * 4. Como saco todos los valores
         */

        //Para saber cual es la longitud
        int longitudArray = numerosDos.length; // con esto preguntamos por la longitud (sus posiciones) del array
        System.out.println(longitudArray);

        //Como sacar el valor de una posicion. RECUERDA: SIEMPRE se empieza en cero
        System.out.println(numerosDos[5]);// con esto me diria el valor que hay en la posicion que solicitamos

        //Como sacar todos los valores en el menor número de líneas posibles
        for (int i = 0; i < numerosDos.length; i++) { //aquí tomará el valor de la variable -1. En este caso significa, hasta menor que 10
            System.out.println(numerosDos[i]);
        }

        //modificar una posición concreta del array
        numerosDos[7] = 88; //A partir de este momento, en vez de estar en valor 8 en la posición 7, ahora habrá un 88.

        //meter en un array de 15 posiciones, 15 número aleatorios entre el 0 y el 50, en el menor número de líneas posibles

        int [] numerosAleatorios = new int [15];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int aleatorio = (int)(Math.random()*51);
            numerosAleatorios [i] = aleatorio;
            System.out.println(numerosAleatorios[i]);
        }
        //una vez generados los números, indicar cuantos pares e impare hay en la colección

        int numeroPares = 0, numeroImpar = 0;
        for (int i = 0; i < 15; i++) {
            if (numerosAleatorios[i] %2 == 0){
                numeroPares++;
            }else {
                numeroImpar++;
            }
        }
        System.out.printf("El número de pares que hay es %d%n y el número de impares es %d", numeroPares, numeroImpar);


    }//fin de main
}// fin de clase
