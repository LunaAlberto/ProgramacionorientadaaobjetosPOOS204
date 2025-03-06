import javax.swing.*;
import javax.swing.JOptionPane;
public class Empleado {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String nombre;
  private int id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void nombredelempeado(String nombre) {
        this.nombre = nombre;
    }

    public void iddeleempeado(int id) {
        this.id = id;
    }
    public void salariodelempleado(double salario) {
        this.salario = salario;
    }
    public void mostrarinfo(){
        JOptionPane.showMessageDialog(null, "Nombre del empleado: "+nombre);
        JOptionPane.showMessageDialog(null, "ID del empleado: "+id);
        JOptionPane.showMessageDialog(null, "Salario del empleado: "+salario);
    }
}
