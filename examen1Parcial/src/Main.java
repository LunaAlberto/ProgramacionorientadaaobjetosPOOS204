import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("por alberto:");
/*
     si es par se divide entre 2
     si es impar se multipllica por 3 y se suma 1
     se acaba hasta que el resultado es 1
 */
        float multiplicacion;
        float divide;
        float div2;
        int num;

        //5,

        Scanner lu = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = lu.nextInt();
        while (num!=1) {

            if (num % 2 == 0) {
                num /= 2;
                System.out.println("el numero es:" + num);
            } else{
                num =num* 3+1;
                System.out.println("el numero es:" + num);
            }
        }

    }
}