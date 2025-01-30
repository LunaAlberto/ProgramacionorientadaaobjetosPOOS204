import java.util.*;
public class bitacora {

    public static void main(String[] args) {
        System.out.println("Por Alberto ");


int cuenta=0;
    /*
    6. Escriba un programa que administre una cuenta bancaria, usando una bitácora
de operaciones. (img 2)
La bitácora de operaciones tiene la siguiente forma:
D 100
R 50
D 100 significa que depositó 100 pesos
R 50 significa que retiró 50 pesos
Introducir una línea vacía indica que ha finalizado la bitácora e imprime el saldo
Final
     */
        Scanner lu =new Scanner(System.in);
        String ca;


        do {
            System.out.print("");
             ca =lu.next().trim().toUpperCase();

            if (ca.equals("D")){
                cuenta +=100;
            } else if (ca.equals("R")) {
                cuenta -=50;

            }

        }while(!ca.equals("S"));
System.out.println("cuenta: "+cuenta);

    }
}
