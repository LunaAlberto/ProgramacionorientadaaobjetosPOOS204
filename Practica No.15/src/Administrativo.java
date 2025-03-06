import javax.swing.JOptionPane;
import javax.swing.*;
public class Administrativo extends Empleado{

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    private String departamento;

    public Administrativo( String nombre, int id, double salario,String departamento){
        super(nombre, id, salario);
        this.departamento = departamento;
    }

    public void departamentodelusuarrio(String departamento){
        this.departamento=departamento;
    }

    public void mostrainfooadministracion(){
        JOptionPane.showMessageDialog(null,"Departamento:"+departamento);
    }

}
