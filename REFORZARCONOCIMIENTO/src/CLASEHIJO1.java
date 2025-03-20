import javax.swing.*;
import javax.swing.JOptionPane;
public class CLASEHIJO1 extends CLASEPADRE {
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    private String licencia;


    public CLASEHIJO1(String nombre, double salario, int id,String licencia) {
        super(nombre, salario, id);
        this.licencia = licencia;
    }


    public void licensiadelusuario(String licencia) {
        this.licencia = licencia;
    }

    public void mostrarliccensia(){
        JOptionPane.showMessageDialog(null,"El licencia del usuario es: "+licencia);
    }



}
