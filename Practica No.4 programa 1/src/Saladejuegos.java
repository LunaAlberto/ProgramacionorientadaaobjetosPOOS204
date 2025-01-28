
import java.util.*;
public class Saladejuegos {
    public static void main(String[] args) {

        /*
 3. Escribir un programa para una empresa que tiene salas de juegos para todas
las edades y quiere calcular de forma automática el precio que debe cobrar a
sus clientes por entrar. El programa debe preguntar al usuario la edad del cliente
y mostrar el precio de la entrada. Si el cliente es menor de 4 años puede entrar
gratis, si tiene entre 4 y 18 años debe pagar $110 y si es mayor de 18 años, $190
         */

        System.out.println("Por alberto luna");
        Scanner ln = new Scanner(System.in);

        System.out.println("cual es la edad del cliente:");
        int edad = ln.nextInt();

        if (edad < 4) {

            System.out.println("El cliente puede entrar gratis,disfrute sus visita:");
        }else if (edad >= 4 && edad <=18) {

            System.out.println("El cliente debe pagar $110 para poder entrar:"+edad);
        }else if (edad >= 19 ) {

            System.out.println("El cliente debe pagar $190 para poder entrar:"+edad);
        }






    }
}
