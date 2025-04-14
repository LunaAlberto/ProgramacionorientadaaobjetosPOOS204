import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String numero;
    numero = JOptionPane.showInputDialog("Digite un número:");
    convertir sub = new convertir(numero);
    String resultado = sub.con(numero);
    JOptionPane.showMessageDialog(null, resultado);


    }
}




