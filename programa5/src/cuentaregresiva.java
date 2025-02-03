import java.util.*;
public class cuentaregresiva {

    public static void main(String[] args) {
        System.out.println("Por Alberto ");
       /*
 2. Escribir un programa que pida al usuario un número entero positivo y muestre
por pantalla la cuenta atrás desde ese número hasta cero separados por comas.
         */

        Scanner lu = new Scanner(System.in);

        System.out.println("ingrese un numero entero positivo:");
        int numero = lu.nextInt();

 for (int i=numero;i>=0; i--) {
     System.out.println(i+",");


 }

    }
}
