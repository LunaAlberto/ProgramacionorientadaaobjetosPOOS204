//importaciones

import java.util.*;
import java.beans.JavaBean;

//clase principal

import java.util.Random;
import java.util.Scanner;

public class Main {
    // metodo main
    /*
    un comentario de varias lineas
     */




    public static void main(String[] args) {

        System.out.println("Alberto Luna Rufino");
        String cadenas = "Alberto"+ "Luna"+ "Rufino";

        System.out.println(cadenas);
        System.out.println(cadenas.length());

        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));

        int x=5,x2;
        double y=1.25,y2;
        String z="204",z1;

        x2 = Integer.parseInt(z);
        z1 = String.valueOf(y);

        double asd=Double.valueOf(x2);
        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

//conversion implicita
        int num = 12;
        double numD = num;
        System.out.println("conversion implicita"+numD);

        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);


        //generamos numeros y los guardamos

        Random rdn = new Random();
       int numAleatorio= rdn.nextInt();
       double numDouble=rdn.nextDouble();

       System.out.println("numero aleatorio entero: " + numAleatorio);
       System.out.println("numero aleatorio double: " + numDouble);

       //4.solicitud de datos
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce cualquier dato:");
        String dato = sc.nextLine();

        System.out.println("introduce dato entero:");
        int datoentero = sc.nextInt();
        System.out.println("introduce dato en decimal:");
        double datodecimal = sc.nextDouble();


        System.out.println("cualquier dato:"+dato);
        sc.nextLine();

        System.out.println("dato entero:"+datoentero);

        //5 boolean,operador logico y de comparacion

        System.out.println(10 > 9); //true
        System.out.println(10 == 9); //false
        System.out.println(10 < 9); //false
        System.out.println(10 >= 9);//true
        System.out.println(10 <= 9);//false
        System.out.println(10 != 10);//true

        int p = 3;

        System.out.println(p < 5 && p > 10);
        System.out.println(p < 5 || p > 10);
        System.out.println(!(p < 5 && p > 10));












        System.out.println("Hello, Alberto luna");

    }
}