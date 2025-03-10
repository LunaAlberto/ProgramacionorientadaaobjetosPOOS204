import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        clasenumero1 class1 = new clasenumero1(8,"","");

        String opc;
        int largo ;
        String caracterespecial;
        String mayuscula;
        String password="";

        do {
        opc = JOptionPane.showInputDialog("Ingrese una 1 ingresar datos 2 comprobar seguridad y tres salir");
        switch (opc) {
            case "1":
                largo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el largo:"));
                caracterespecial = JOptionPane.showInputDialog("Ingrese el caracterespecial:");
                mayuscula = JOptionPane.showInputDialog("Ingrese la mayuscula:");

                password = class1.generarPassword(largo, caracterespecial, mayuscula);
                JOptionPane.showMessageDialog(null, password);

                break;
                case "2":
                    if (password.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Primero genere una contraseña.");
                    } else {
                        boolean segura = class1.verificarSeguridad(password);
                        if (segura) {
                            JOptionPane.showMessageDialog(null, "Contraseña segura");
                        } else {
                            JOptionPane.showMessageDialog(null, "Contraseña débil");
                        }
                    }

                    break;
                    default:
        }
        }while (!opc.equals("3"));
    }
}