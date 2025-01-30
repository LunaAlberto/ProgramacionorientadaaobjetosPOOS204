
import java.util.*;
import java.util.Scanner;
public class tabladel10 {
    public static void main(String[] args) {
        System.out.println("Por Alberto ");
        Scanner input = new Scanner(System.in);

        /*
        3. Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.
         */


        System.out.println("Ingrese 10 para empezar");
        int empezar = input.nextInt();

        for (int i = 1; i <= empezar; i++) {
            System.out.println(empezar+"*"+i+"="+(empezar*i));
        }

    }
}
