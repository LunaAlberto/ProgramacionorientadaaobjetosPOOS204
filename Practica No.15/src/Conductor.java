import javax.swing.*;
import javax.swing.JOptionPane;
public class Conductor extends Empleado {
        public String getLicencia() {
            return licencia;
        }

        public void setLicencia(String licencia) {
            this.licencia = licencia;
        }

        private String licencia;

        public Conductor(String licencia, String nombre, int id, double salario) {
            super(nombre, id, salario);
            this.licencia = licencia;
        }

        public void licen(String licencia) {

            this.licencia = licencia;
        }

    public void mostrarinfoconductor(){
           JOptionPane.showMessageDialog(null,"La licencia es:"+licencia);
    }

    }

