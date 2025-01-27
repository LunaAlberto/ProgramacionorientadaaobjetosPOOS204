import java.util.*;
import java.beans.JavaBean;
/*
1. Crea un programa que pregunte al usuario por el número de horas trabajadas
y el coste por hora. Después debe mostrar por pantalla la paga que le
corresponde.
 */

public class Main {
    int horastrabajadas;

    public static void main(String[] args) {
        System.out.println("Por Alberto Luna");
        float totalapagar = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce el numero de horas trabajadas:");
        int hora = sc.nextInt();

        System.out.println("introduce el costo por hora:");
        float costo = sc.nextFloat();

        totalapagar = hora * costo;

        System.out.println("El total a pagar es de:" + totalapagar);

    }
}