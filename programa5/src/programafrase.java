import java.util.*;
public class programafrase {
    public static void main(String[] args) {
        System.out.println("Por Alberto ");
    /*
    5. Escribir un programa en el que se pregunte al usuario por una frase y una letra,
y muestre por pantalla el número de veces que aparece la letra en la frase.
     */

        Scanner lu = new Scanner(System.in);
int i=0,c = 0;
        System.out.print("Ingrese un texto ");
        String texto = lu.nextLine().toUpperCase();

        System.out.print("Ingrese una letra ");
        char letra = lu.nextLine().toUpperCase().charAt(i);
        while (i<texto.length()) {
            if (texto.charAt(i)==letra) {
                c++;

            }
            i++;
        }
        System.out.println(c);

    }
}


