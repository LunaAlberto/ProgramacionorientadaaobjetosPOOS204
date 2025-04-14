import javax.swing.JOptionPane;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        String nombre;
        String apellido;
        String apellidom;
        int largo;
        String carrera;
        String anoencurso;
        String nacimiento;
        String matricula;

        subclase2 sub = new subclase2("","","",14,"","","");

        nombre= JOptionPane.showInputDialog("Ingrese el nombre");
        apellido= JOptionPane.showInputDialog("Ingrese el apellido");
        apellidom= JOptionPane.showInputDialog("Ingrese el apellido");
        carrera= JOptionPane.showInputDialog("Ingrese el carrera");
        anoencurso = JOptionPane.showInputDialog("Ingrese el ano");
        nacimiento= JOptionPane.showInputDialog("Ingrese el nacimiento");

        sub.setNombre(nombre);
        sub.setApellido(apellido);
        sub.setCarrera(carrera);
        sub.setApellidom(apellidom);
        sub.setAnoencurso(anoencurso);
        sub.setNacimiento(nacimiento);




        matricula = sub.generarcontrasena();
        JOptionPane.showMessageDialog(null,"El numero de matricula es: "+matricula);

}
}