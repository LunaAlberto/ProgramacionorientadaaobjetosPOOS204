import java.util.*;
public class Numeropara {
    public static void main(String[] args) {

        /*
        2. Escribir un programa que pida al usuario un número entero y muestre por
        pantalla si es par o impar.
         */

        System.out.println("Por alberto luna");
        Scanner ln = new Scanner(System.in);

        System.out.print("Ingrese un número : ");
        int n = ln.nextInt();

        if (n % 2 == 0) {

           System.out.println(n + " es par");
        }else {
            System.out.println(n + " es impar");
        }

    }
}
