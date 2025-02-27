import javax.swing.JOptionPane;
import javax.swing.*;
public class Conductor {

    private String nombre;

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

    private String identificacion;

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    private String licencia;


    public Conductor(String nombre,String identificacion,String licencia){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.licencia = licencia;
    }

    public void nombre(String nombre){
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(null,"El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
            JOptionPane.showMessageDialog(null,"El nombre es correcto"+nombre);
        }

    }

    public void identificacion(String identificacion){
        if(identificacion.isEmpty()){
            JOptionPane.showMessageDialog(null,"El nombre no puede estar vacio");
        }else{
            this.identificacion = identificacion;
            JOptionPane.showMessageDialog(null,"El nombre es correcto"+identificacion);
        }
    }

    public void licencia(String licencia){
        if(licencia.isEmpty()){
            JOptionPane.showMessageDialog(null,"La licensia no puede estar vacia");
        }else{
            this.licencia = licencia;
            JOptionPane.showMessageDialog(null,"correcto"+licencia);
        }
    }



}
