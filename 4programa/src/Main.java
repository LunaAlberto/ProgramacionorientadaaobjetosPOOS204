
import java.util.*;
import java.beans.JavaBean;
public class Main {

    /*
    4. Codifica un programa que pregunte el nombre del usuario y después de que
el usuario lo introduzca muestre por pantalla <NOMBRE> tiene <n> letras,
donde<NOMBRE> es el nombre de usuario en mayúsculas y <n> es el número
de letras que tienen el nombre.
     */
    public static void main(String[] args) {
        System.out.println("Por alberto luna");
        Scanner sc = new Scanner(System.in);
System.out.println("introduzca su nombre completo:");
String usuario = sc.nextLine();



System.out.println("su nombre es:"+usuario);
System.out.println("y contiene un total de letras de:");
System.out.println(usuario.length());
System.out.println("Donde el nombre del usuario es:");
String mayusculas;
        mayusculas = usuario.toUpperCase();
        System.out.println("el nombre del usuario es:"+mayusculas);

    }
}