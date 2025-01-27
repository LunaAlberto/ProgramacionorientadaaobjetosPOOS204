import java.util.*;
import java.beans.JavaBean;
public class Main {


    /*
  2. Codifica un programa que pregunte el nombre completo del usuario en la
consola y después muestre por pantalla el nombre completo del usuario tres
veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y
otra solo con la
primera letra del nombre y de los apellidos en mayúscula. El usuario puede
introducir su nombre combinando mayúsculas y minúsculas como quiera.
     */

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Nombre completo:");
        String nombre = sc.nextLine();

        String resultadoM = nombre.toLowerCase();
        String resultadom = nombre.toUpperCase();

        System.out.println(resultadoM);
        System.out.println(resultadom);

        String re;
        re = nombre.toUpperCase().charAt(0)+System.out.println("Nombre:"+ re );














    }
}