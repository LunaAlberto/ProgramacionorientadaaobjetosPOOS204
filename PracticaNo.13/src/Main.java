import javax.swing.JOptionPane;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Por Alberto Luna");
   //clase Vehículo
   //Conductor
        // Envio
       // Entrega

        String opc;


        //Vehiculos
        Vehiculos ve =new Vehiculos("123MG","Mercedes",800);
        String placa;
        String modelo;
        float capacidadCarga;
        //Vehiculos

        //cocnductor
        Conductor con=new Conductor();
        String nombre;
        String identificacion;
        String licencia;
        //cocnductor



        do {


            opc = JOptionPane.showInputDialog("Ingresa una opcion del menu:\n1-Crear vehículo\n2-Gestion de conductotrds\n" +
                    "3-Envio\n4-Entrega\n5-Actualizar\n6-Eliminar\n7-Mostrar info\n8-Salir");
            switch (opc) {
                case "1":

                    placa = JOptionPane.showInputDialog("Ingresa la placa del vehiculo");
                    modelo = JOptionPane.showInputDialog("Ingresa la modelo del vehiculo");
                    capacidadCarga = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la capacidad de carga"));
                    ve.modelo(modelo);
                    ve.placa(placa);
                    ve.capacidadCarga(capacidadCarga);
                    break;
                    case "2":

                         nombre = JOptionPane.showInputDialog("Ingresa el nombre del conductor:");
                         identificacion= JOptionPane.showInputDialog("Ingresa el identificacion del conductor:");
                         licencia=JOptionPane.showInputDialog("Ingresa el licencia del conductor:");


                        break;
                        case "3":
                            break;
                            case "4":
                                break;
                                case "5":
                                    break;
                                    case "6":
                                        break;
                                        case "7":
                                            break;
                                            case "8":
                                                break;
            }
        }while(!opc.equals("8"));

        JOptionPane.showMessageDialog(null,"Se ha finalizado el programa");

    }
}