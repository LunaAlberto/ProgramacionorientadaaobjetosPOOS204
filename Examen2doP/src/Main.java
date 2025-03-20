import javax.swing.*;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        System.out.println("Por Alberto Luna");

        Matricula mat = new Matricula(14, "", "", "", "", "", "");

        String opc;

        do {
            opc = JOptionPane.showInputDialog(null, "Introduce " +
                    "\n1-Introducir datos \n2-Mostrar matricula\n3-Salir");

            switch (opc) {
                case "1":
                    String nombre = JOptionPane.showInputDialog(null, "Introduce nombre");
                    String apellidoPaterno = JOptionPane.showInputDialog(null, "Introduce apellido paterno");
                    String apellidoMaterno = JOptionPane.showInputDialog(null, "Introduce apellido materno");
                    String anoNacimiento = JOptionPane.showInputDialog(null, "Introduce año de nacimiento");
                    String carrera = JOptionPane.showInputDialog(null, "Introduce carrera");
                    String anoencuerso = JOptionPane.showInputDialog(null, "Introduce año en curso");

                    mat.setNombre(nombre);
                    mat.setApellidoPaterno(apellidoPaterno);
                    mat.setApellidoMaterno(apellidoMaterno);
                    mat.setAnoNacimiento(anoNacimiento);
                    mat.setCarrera(carrera);
                    mat.setAnoencuerso(anoencuerso);
                    break;

                case "2":
                    mat.mostrarDatos();
                    String matricula = mat.generarMatricula();
                    JOptionPane.showMessageDialog(null, "La matrícula es: " + matricula);
                    break;
            }
        } while (!opc.equals("3"));

        JOptionPane.showMessageDialog(null, "Saliendo del programa");
    }
}
