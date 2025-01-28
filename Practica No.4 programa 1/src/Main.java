import java.util.*;
public class Main {
    /*
  1. Escribir un programa que almacene la cadena de caracteres una contraseña
en una variable, después que solicite al usuario una contraseña e imprima en
pantalla si la contraseña introducida por el usuario coincide con la guardada en
la variable sin tener en cuenta mayúscula y minúscula.
     */

    public static void main(String[] args) {
        System.out.println("Por alberto luna");
        Scanner lu = new Scanner(System.in);
        String pas = "luna";
        String usu = "alberto";


        System.out.println("Ingrese el usuario:");
        String usuario = lu.nextLine();

        System.out.println("Ingrese el password:");
        String  password = lu.nextLine();

        if (password.equalsIgnoreCase(pas)&& usuario.equalsIgnoreCase(usu)) {
            System.out.println("El usuario es: " + usuario);
           System.out.println("La contraseña introduccida por el usuario si conincide:");
        }else {
            System.out.println("La contraseña introduccida no conicide:");
        }
    }
}