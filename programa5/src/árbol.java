import java.util.*;
public class árbol {
    public static void main(String[] args) {

         System.out.println("Por Alberto ");

        Scanner sof = new Scanner(System.in);
int i=1;

        /*
        7. Imprime un árbol de navidad formado con Asteriscos haciendo uso del while,
Solicitando al usuario la cantidad de * de la base (img 3)
         */

        System.out.println("ingrese la cantidad de * en la base:");
        int base = sof.nextInt();

        while (i <= (base+1)/2) {
for (int j = 1; j <= (base+1)/2-i; j++) {

System.out.print(" ");
}
for (int j = 1; j <= 2*i-1; j++) {
System.out.print("*");
}
System.out.println();
            i++;
        }
    }
}
