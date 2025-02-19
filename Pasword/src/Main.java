import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, Alberto!");

        int largo;
        String caracterEspecial;
        String mayusculas;
        String opc;
        String password;

        datos d = new datos();

        do {
            opc = JOptionPane.showInputDialog("Ingrese 1 para continuar, 2 para salir");
            if (opc.equals("1")) {
                largo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número de caracteres (máximo 8):"));
                d.verificarLargo(largo);

                caracterEspecial = JOptionPane.showInputDialog("Ingresa el caracter especial:");
                d.verificarCaracterEspecial(caracterEspecial);

                mayusculas = JOptionPane.showInputDialog("Ingresa la letra en mayúscula:");
                d.verificarMayusculas(mayusculas);

                password = d.generarPassword(largo, caracterEspecial, mayusculas);
                JOptionPane.showMessageDialog(null, password);
            }
        } while (!opc.equals("2"));

        JOptionPane.showMessageDialog(null, "Ha salido del programa");
    }
}
