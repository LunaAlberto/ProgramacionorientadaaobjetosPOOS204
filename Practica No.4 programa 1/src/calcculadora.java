import java.util.*;

public class calcculadora {
    public static void main(String[] args) {

        Scanner lu = new Scanner(System.in);

        /*
 5. Escribe un programa que simule una calculadora básica utilizando un switch.
El usuario debe ingresar dos números y un operador (+, -, *, /). Según el
operador ingresado, el programa debe realizar la operación correspondiente y
mostrar el resultado. Si el operador no es válido, el programa debe mostrar un
mensaje de error.
         */
        float suma;
        float resta;
        float multiplicacion;
        float division;

        System.out.println("ingrese un simbolo: 1-+,2--,3-*,4-/ ");
        String num = lu.nextLine();
        switch (num) {
            case "+":
                System.out.println("ingrese un numero");
                int num1 = lu.nextInt();
                System.out.println("ingrese un numero");
                int num2 = lu.nextInt();

                suma = num1 + num2;

                System.out.println("suma de:"+suma);
                break;
                case "-":
                    System.out.println("ingrese un numero");
                    int num3 = lu.nextInt();
                    System.out.println("ingrese un numero");
                    int num4 = lu.nextInt();
                    resta = num3 - num4;
                    System.out.println("resta de:"+resta);
                    break;
                    case "*":
                        System.out.println("ingrese un numero");
                        int num5 = lu.nextInt();
                        System.out.println("ingrese un numero");
                        int num6 = lu.nextInt();
                        multiplicacion = num5 * num6;
                        System.out.println("multiplicacion de:"+multiplicacion);
                        break;
                        default:
            case "/":
                            System.out.println("ingrese un numero");
                            int num7 = lu.nextInt();
                            System.out.println("ingrese un numero");
                            int num8 = lu.nextInt();
                            division = num7 / num8;
                            System.out.println("division de:"+division);
                            break;

        }




    }
}
