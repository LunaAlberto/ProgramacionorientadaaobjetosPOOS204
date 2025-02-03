import java.util.*;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {

        System.out.println("Por Alberto ");
        Scanner lu = new Scanner(System.in);
        int pisos;

        /*
         4. Escribir un programa que pida al usuario un número entero y muestre por
pantalla un triángulo rectángulo como el de más abajo, de altura el número
introducido. (img 1)
         */

        System.out.print("Ingresa un  numero entero:");
        int numero = lu.nextInt();
      for (int i = 1; i<=numero; i+=2) {
    for (int j=i; j>0; j-=2) {
        System.out.print(j + "");
    }
System.out.println();
}


    }
}
