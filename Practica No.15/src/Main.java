import javax.swing.*;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("Por Alberto Luna");

        Empleado emp=new Empleado("",0,0);
        Conductor con=new Conductor("","",0,0);
        Administrativo adm=new Administrativo("",0,0,"");



        //Enpleado
        String nombre;
        int id;
        double salario;
        String licencia;
        String departamento;
           //empleadop


        String opc;
        String tipo;

        do {
            opc =JOptionPane.showInputDialog("Ingresa una de las opciones\n1-agregar empleados.\n2-listarlos." +
                    "\n3-Salir.");
            switch (opc) {
                case "1":
                    nombre=JOptionPane.showInputDialog("Ingresa el nombre del empleado");
                    id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del empleado"));
                    salario=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el salario del empleado"));
                    emp.nombredelempeado(nombre);
                    emp.iddeleempeado(id);
                    emp.salariodelempleado(salario);

                    tipo = JOptionPane.showInputDialog("Ingresa el tipo de empleado,Administrativo. y Conductor.");
                    if(tipo.equalsIgnoreCase("Conductor")){

                        licencia=JOptionPane.showInputDialog("Ingresa el licencia del empleado");
                        con.licen(licencia);
                    }else if(tipo.equalsIgnoreCase("Administrativo")){
                        departamento=JOptionPane.showInputDialog("Ingresa el departamento del empleado");
                        adm.departamentodelusuarrio(departamento);
                    }
                    break;

                    case "2":
                      emp.mostrarinfo();
                      con.mostrarinfoconductor();
                      adm.mostrainfooadministracion();
                        break;
                        default:
            }
        }while (!opc.equals("3"));
        JOptionPane.showMessageDialog(null, "Saliendo del programa.");

    }
}