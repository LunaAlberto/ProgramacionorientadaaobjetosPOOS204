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

        Scanner lu = new Scanner(System.in);

        int num;

        do {
            System.out.println("Por favor, introduzca el primer numero");
            num  = lu.nextInt();

            if (num % 2 == 0) {
                num /=2;
                System.out.println("el numero es:"+num);

                } else if (num % 2 != 0) {

                num*=3;
                num+=1;

                System.out.println("el numero es:"+num);

            }
            if (num % 2 == 0) {
                num /=2;
                System.out.println("el numero es:"+num);

            } else if (num % 2 != 0) {

                num*=3;
                num+=1;

                System.out.println("el numero es:"+num);

            }
            if (num % 2 == 0) {
                num /=2;
                System.out.println("el numero es:"+num);

            } else if (num % 2 != 0) {

                num*=3;
                num+=1;

                System.out.println("el numero es:"+num);

            }
        }while(num == 1);

    }
}