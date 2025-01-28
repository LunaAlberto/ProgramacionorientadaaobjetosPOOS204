import java.util.*;
public class Main {
    public static void main(String[] args) {
int mu=75;
int pa=112;

int totaldem,totaldep,total;

        /*
        5. Una juguetería tiene mucho éxito en dos de sus productos: payasos y
muñecas. Suele hacer venta por correo y la empresa de logística les cobra por
peso de cada paquete así que deben calcular el peso de los payasos y muñecas
que saldrán encada paquete a demanda. Cada payaso pesa 112 g y cada
muñeca 75 g.
Escribir un programa que lea el número de payasos y muñecas vendidos en el
último pedido y calcule el peso total del paquete que será enviado.
         */
        System.out.println("Por alberto luna");

        Scanner lu = new Scanner(System.in);

        System.out.println("Ingrese el numero de muñecas vendidos:");
        int munecas = lu.nextInt();

        System.out.println("Ingrese el numero de payasitos vendidos:");
        int payasitos = lu.nextInt();

        totaldem=mu * munecas;
        totaldep=pa*payasitos;
            total= totaldem+totaldep;

        System.out.println("el peso total del paquete de muñecas es de:"+totaldem+"KG");
        System.out.println("el peso total del paquete de payasitos es de:"+totaldep+"KG");
            System.out.println("el peso total del paquete es de :"+total+"KG");





    }
}