import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("por alberto luna");
        Funciones cuenta=new Funciones();
        int cuentaatraspasar;
        String depo;
        double deposito;
        double retiro;
        double saldo;
        String titular;
        int edad;

        String opc;
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String nu1 = JOptionPane.showInputDialog("Ingrese el numero de cuenta");
        int numeroCuenta = Integer.parseInt(nu1);


        opc=JOptionPane.showInputDialog("ingrese una opcion:1-Depositar,2-Retirar,3-Transferir,4-consultar saldo");

        switch(opc){
            case "1":
                depo = JOptionPane.showInputDialog("Ingrese el deposito:");
                deposito=Double.parseDouble(depo);
                cuenta.mostrardeposito(deposito);
                break;
                case "2":
                    String ret = JOptionPane.showInputDialog("Ingrese el retiro:");
                    double retro=Double.parseDouble(ret);
                    cuenta.mostrarretiro(retro);
                    break;
                    case "3":
                  String trasn = JOptionPane.showInputDialog("Ingrese la trasnferiencia:");
                        break;
                        case "4":
                            JOptionPane.showInputDialog(null,"su saldo es:"+cuenta.saldo);
                            break;
        }
    }
}