import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("por alberto luna");
        Funciones f = new Funciones();

        String opc;
        String nombre;
        String marca;
        String color;
        Double peso;
        Double precio;
        String departamento;
        String buscaarnombre;

        do {
            opc = JOptionPane.showInputDialog("Ingrese una opción: 1-para registrar electrodoméstico, " +
                    "2-para consultar todo, " +
                    "3-para consultar ventas, 4-para salir");

            if (opc.equals("1")) {
                nombre = JOptionPane.showInputDialog("Ingrese el nombre del artículo:");
                marca = JOptionPane.showInputDialog("Ingrese la marca del artículo:");
                color = JOptionPane.showInputDialog("Ingrese el color del artículo:");
                peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso del artículo:"));
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
                departamento = JOptionPane.showInputDialog("Ingrese el departamento:");
                f.registrarElectrodomestico(nombre, marca, color, peso, precio, departamento);

            } else if (opc.equals("2")) {
                f.consultarTodo();


            } else if (opc.equals("3")) {
                JOptionPane.showMessageDialog(null, "Total de ventas: " + f.totalVentas);
            }

        } while (!opc.equals("4"));
    }
}
