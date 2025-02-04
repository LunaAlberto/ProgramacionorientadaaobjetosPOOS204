import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.*;
public class Main {


    public static void main(String[] args) {
        System.out.println("por alberto luna");
        Scanner lu = new Scanner(System.in);


        String usu="Alberto";
        String pass="Luna1234";
        int opcion=1;
        double suma,resta,multiplica,divisor;

        System.out.println("ingrese el usuario:");
        String usuario = lu.nextLine();

        System.out.println("ingrese el password:");
        String password = lu.nextLine();
    if (usuario.equalsIgnoreCase(usu) && password.equalsIgnoreCase(pass)) {

        System.out.println("El usuario es correcto");
        System.out.println("ingrese una opcion:");
        int opcion2 = lu.nextInt();

        switch (opcion2) {
            case 1:
                System.out.println("ingresa el primer numero:");
                int primero = lu.nextInt();
                System.out.println("ingresa el segundo numero:");
                int segundo = lu.nextInt();
                suma = primero + segundo;
                System.out.println("La suma de los numeros es: " + suma);
                break;
                case 2:
                    System.out.println("ingresa el primer numero:");
                    int primero2 = lu.nextInt();
                    System.out.println("ingresa el segundo numero:");
                    int segundo2 = lu.nextInt();
                    resta = primero2 - segundo2;
                    System.out.println("La resta de los numeros es: " + resta);
                    break;

                    case 3:
                        System.out.println("ingresa el primer numero:");
                        int primero3 = lu.nextInt();
                        System.out.println("ingresa el segundo numero:");
                        int segundo3 = lu.nextInt();
                        multiplica = primero3 * segundo3;
                        System.out.println("La multiplica de los numeros es: " + multiplica);
                        break;
                        case 4:
                            System.out.println("ingresa el primer numero:");
                            int primero4 = lu.nextInt();
                            System.out.println("ingresa el segundo numero:");
                            int segundo4 = lu.nextInt();
                            divisor = primero4 / segundo4;
                            System.out.println("La divisor de los numeros es: " + divisor);
                            break;
        }

    } else {
        System.out.println("El usuario no es correcto");
        System.out.println("quieres volver a intentarlo?:");
        opcion=lu.nextInt();


    }

    }
}


