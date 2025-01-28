
import java.util.*;
import java.util.Scanner;
public class palindromo {
    public static void main(String[] args) {

        /*
4. Codifica un programa que solicite una cadena de caracteres e imprima como
resultado si la cadena es palíndromo o no
         */

        System.out.println("Por alberto luna");
        Scanner ln = new Scanner(System.in);

        System.out.println("Ingrese su frase de palindromo");
        String pa = ln.nextLine();

String palabrainvertida = new StringBuilder(pa).reverse().toString();

if(palabrainvertida.equalsIgnoreCase(pa)){
    System.out.println("es palindromo");


}else {
    System.out.println("no es palindromo");
}



    }
}
