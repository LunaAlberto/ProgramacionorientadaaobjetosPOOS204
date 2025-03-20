import javax.swing.*;
import java.util.Random;

public class Matricula {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String anoNacimiento;
    private String carrera;
    private String anoEnCurso;

    public Matricula(String nombre, String apellidoPaterno, String apellidoMaterno,
                     String anoNacimiento, String carrera, String anoEnCurso) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anoNacimiento = anoNacimiento;
        this.carrera = carrera;
        this.anoEnCurso = anoEnCurso;
    }

    public String generarMatricula() {
        Random rand = new Random();
        String tresLetrasCarrera = carrera.length() >= 3 ? carrera.substring(0, 3).toUpperCase() : carrera.toUpperCase();
        String dosDigitosAnoCurso = anoEnCurso.substring(2, 4);
        String dosDigitosAnoNac = anoNacimiento.substring(2, 4);
        String primeraLetraNombre = nombre.substring(0, 1).toUpperCase();
        String tresLetrasApellido = apellidoPaterno.length() >= 3 ? apellidoPaterno.substring(0, 3).toUpperCase() : apellidoPaterno.toUpperCase();
        String tresDigitosRandom = String.format("%03d", rand.nextInt(1000));

        return tresLetrasCarrera + dosDigitosAnoCurso + dosDigitosAnoNac + primeraLetraNombre + tresLetrasApellido + tresDigitosRandom;
    }
}

public class Main {
    public static void main(String[] args) {
        String nombre, apellidoPaterno, apellidoMaterno, anoNacimiento, carrera, anoEnCurso, opcion;

        do {
            opcion = JOptionPane.showInputDialog(null,
                    "1 - Introducir datos\n2 - Mostrar matrícula\n3 - Salir");

            switch (opcion) {
                case "1":
                    nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
                    apellidoPaterno = JOptionPane.showInputDialog("Introduce tu apellido paterno:");
                    apellidoMaterno = JOptionPane.showInputDialog("Introduce tu apellido materno:");
                    anoNacimiento = JOptionPane.showInputDialog("Introduce tu año de nacimiento (YYYY):");
                    carrera = JOptionPane.showInputDialog("Introduce tu carrera:");
                    anoEnCurso = JOptionPane.showInputDialog("Introduce el año en curso (YYYY):");

                    Matricula mat = new Matricula(nombre, apellidoPaterno, apellidoMaterno, anoNacimiento, carrera, anoEnCurso);
                    String matriculaGenerada = mat.generarMatricula();

                    JOptionPane.showMessageDialog(null, "Tu matrícula generada es:\n" + matriculaGenerada);
                    break;

                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intenta de nuevo.");
            }
        } while (!opcion.equals("3"));
    }
}
