import javax.swing.JOptionPane;
import javax.swing.*;
public class Conductor {

    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    String identificacion;

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    String licencia;


    public void Conductor(String nombre,String identificacion,String licencia){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public void nombre(String nombre){
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"El nombre no puede estar vacio");
        }else{
            JOptionPane.showMessageDialog(null,"El nombre es correcto");
        }

    }

    public void identificacion(String identificacion){
        if(identificacion.isEmpty()){
            JOptionPane.showMessageDialog(null,"El nombre no puede estar vacio");
        }else{
            JOptionPane.showMessageDialog(null,"El nombre es correcto");
        }
    }






}
