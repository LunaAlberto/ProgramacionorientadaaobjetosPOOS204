import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Por Alberto ");

        /*
1. Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla todos los números impares desde 1 hasta ese número separados
por comas.
         */
        Scanner lu = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo:");
        int num = lu.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i % 2!=0) {
                System.out.print(i+",");
            }
        }


    }
}