public class ArraysMultidimensionales {
    public static void main(String[] args) {

        int [][] arrayMulti = new int[3][3]; //primer valor filas, segundo columanas
        int [][] arrayMultiDiferente = {{1,2,3,4,},{5,6,7},{8,9}};

        //modificamos los valores de alguna posición del array
        arrayMulti [0][0] = 7; //en la fila cero y la columna cero el valor será 7
        arrayMulti [2][1] = 8;
        arrayMulti [1][2] = 6;

        //quiero ver el valor de una posición

        System.out.println("Vemos el valor de una posición");
        System.out.println(arrayMulti[1][2]);

        //Vemos todos los valores de un array

        System.out.println("Vemos los valores de array multidimensional con diferentes columnas por fila"); //estos casos siempre tienen que estar declarados los valores
        System.out.println(arrayMulti[0]);

        // sacamos todos los valores del array Multidimensional

        System.out.println("Vemos los valores de todo el array por filas");
        //Hacemos un primer for para "ver" las filas
        for (int i = 0; i < arrayMulti.length; i++) {
            //una vez dentro, hacemos otro for para ver las columnas
            //si ponemos arrayMulti.length, solo cogería el número de filas, para especificar las columnas arrayMulti[i].length, vemos el largo de cada una de las filas
            for (int j = 0; j < arrayMulti[i].length; j++) {
                System.out.print(arrayMulti[i][j] + " ");
            }
            System.out.println("\n");
        }

        System.out.println("Vemos los valores de todo el array por filas");
        //Hacemos un primer for para "ver" las filas
        for (int i = 0; i < arrayMultiDiferente.length; i++) {
            //una vez dentro, hacemos otro for para ver las columnas
            //si ponemos arrayMulti.length, solo cogería el número de filas, para especificar las columnas arrayMulti[i].length, vemos el largo de cada una de las filas
            for (int j = 0; j < arrayMultiDiferente[i].length; j++) {
                System.out.print(arrayMultiDiferente[i][j] + " ");
            }
            System.out.println("\n");
        }


    }//fin de main
}//fin de clase
