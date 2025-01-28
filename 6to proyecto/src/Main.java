import java.util.*;
public class Main {
    /*
    6. Crea un programa que pida al usuario que introduzca una frase en y muestre
en pantalla la frase invertida.
     */
    public static void main(String[] args) {

        String s2="";
        System.out.println("Por alberto luna");

        Scanner lu = new Scanner(System.in);

        System.out.println("Introduzca cual quier frase:");
        String frase = lu.nextLine();
        for (int i = frase.length() - 1; i >= 0; i--) {
            s2 = s2 + frase.charAt(i);
        }
        System.out.println("este es el texto: "+frase);

        System.out.println("este es el texto al reves: "+s2);

    }
}