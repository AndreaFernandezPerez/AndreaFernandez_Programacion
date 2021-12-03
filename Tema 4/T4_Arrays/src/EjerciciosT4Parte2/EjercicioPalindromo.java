package EjerciciosT4Parte2;

public class EjercicioPalindromo {
    public static void main(String[] args) {
        String frase = "La ruta nos aporto otro paso natural";
        boolean palindromo = false;
        //La ruta nos aporto otro paso natural

        frase = frase.replaceAll(" ", "").toLowerCase();

        for (int i = 0; i < frase.length()/2; i++) {
            //System.out.println(frase.charAt(i)); --> con .charAt(i) nos imprime todas las letras

            if (frase.charAt(i) == frase.charAt(frase.length()-1-i)){
                palindromo = true;
            }else {
                palindromo = false;
                break;
            }
        }
        if (palindromo){ //siempre se pregunta primero si es verdadero --> ispalindromo
            System.out.println("La frase es palíndroma");
        }else {
            System.out.println("La frase no es palíndroma");
        }



    }//fin de main
}//fin de clase
