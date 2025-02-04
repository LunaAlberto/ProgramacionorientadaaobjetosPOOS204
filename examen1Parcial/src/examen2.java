
import java.util.*;
public class examen2 {
    public static void main(String[] args) {
        System.out.println("por alberto:");
        Scanner lu = new Scanner(System.in);
        /*
        descomponer la alabra 1-A
        2-L
        3-B
        4-E
        5-R
        6-T
        7-O:
         */
        System.out.println("ingrese la frase:");
        String letras = lu.nextLine();
        for(int i = 0; i < letras.length(); i++) {
            System.out.print((i+1)+","+letras.charAt(i));
        }
    }
}
