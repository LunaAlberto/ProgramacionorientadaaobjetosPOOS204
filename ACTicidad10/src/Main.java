import javax.swing.*;
import javax.swing.*;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Por Alberto Luna");

        int largo;
        String caracterEspecial;
        String mayusculas;
        String opc;
        String password;

        Datos d=new Datos();

        do {

            opc= JOptionPane.showInputDialog("ingresa 1 para continuar y dos para verificar y tres para salir");
            if (opc.equals("1")) {
                largo=Integer.parseInt(JOptionPane.showInputDialog("ingresa el largo"));
                d.verificarlargo(largo);

                caracterEspecial=JOptionPane.showInputDialog("ingresa el caracter especial");
                d.verificarcaracteresespeciales(caracterEspecial);

                mayusculas=JOptionPane.showInputDialog("ingresa la letra mayuscula");
                d.verificarmayusculas(mayusculas);

                password = d.generarPassword(largo,caracterEspecial,mayusculas);
                JOptionPane.showMessageDialog(null, password);

            }else if(opc.equals("2")) {
                password=JOptionPane.showInputDialog("ingresa la contraseña:");
                d.verificarseguridad(password);
            }

        }while (!opc.equals("3"));

        JOptionPane.showMessageDialog(null,"saliendo");

    }
}