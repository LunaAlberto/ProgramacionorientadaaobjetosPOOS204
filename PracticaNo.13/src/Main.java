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
        String conductormaestro;


        //Vehiculos
        Vehiculos ve =new Vehiculos("","",0);
        String placa;
        String modelo;
        float capacidadCarga;
        //Vehiculos

        //cocnductor
        Conductor con=new Conductor("","","");
        String nombre;
        String identificacion;
        String licencia;
        //conductor

        //Envio Con código, destino y peso.
        String codigo;
        String destino;
        float peso;
        String yes;
        Envio env=new Envio("","",0);
        //Envio


        //Entrega

        Entrega ent=new Entrega("","pendiente");
        String numeroguia;
        String estado;
        String est;

        //Entrega

        do {


            opc = JOptionPane.showInputDialog("Ingresa una opcion del menu:\n1-Crear vehículo\n2-Gestion de conductotrds\n" +
                    "3-asignar conductor\n4-Entrega\n5-Envios\n6-Actualizar estado\n7-Mostrar info\n8-Salir");
            switch (opc) {
                case "1":
                    placa = JOptionPane.showInputDialog("Ingresa la placa del vehiculo");
                    modelo = JOptionPane.showInputDialog("Ingresa la modelo del vehiculo");
                    capacidadCarga = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la capacidad de carga"));
                   ve.placa(placa);
                   ve.modelo(modelo);
                   ve.capacidadCarga(capacidadCarga);
                    break;
                    case "2":

                         nombre = JOptionPane.showInputDialog("Ingresa el nombre del conductor:");
                         identificacion= JOptionPane.showInputDialog("Ingresa el identificacion del conductor:");
                         licencia=JOptionPane.showInputDialog("Ingresa el licencia del conductor:");
                         con.nombre(nombre);
                         con.identificacion(identificacion);
                         con.licencia(licencia);
                        break;
                        case "3":
                            ve.conductor(con);
                            JOptionPane.showMessageDialog(null, "se agrego Conductor");

                            break;
                            case "4":

                                yes=JOptionPane.showInputDialog("Su Envio contiene peso?SI O NO:");
                                if(yes.toLowerCase().equals("si")){

                                    codigo=JOptionPane.showInputDialog("Ingresa el codigo:");
                                    destino=JOptionPane.showInputDialog("Ingresa el destino:");
                                    peso=Float.parseFloat(JOptionPane.showInputDialog("Ingresa el peso"));
                                    env.codigo(codigo);
                                    env.destino(destino);
                                    env.peso(peso);
                                }else if(yes.toLowerCase().equals("no")){
                                    codigo=JOptionPane.showInputDialog("Ingresa el codigo:");
                                    destino=JOptionPane.showInputDialog("Ingresa el destino:");
                                    env.codigo(codigo);
                                    env.destino(destino);
                                }
                                break;
                                case "5":


                                        numeroguia = JOptionPane.showInputDialog("Ingresa el numero deguia:");
                                        estado = JOptionPane.showInputDialog("Ingresa el estado:");
                                    ent.estado(estado);
                                        ent.numeroguia(numeroguia);

                                    break;
                                    case "6":
                                        estado = JOptionPane.showInputDialog("Ingresa el estado(en transito o entregado):");
                                        ent.actualizarestado(estado);


                                        break;
                                        case "7":

                                            if(ve.getConductor()==null){
                                                JOptionPane.showMessageDialog(null," No hay conductor:");

                                            }else{
                                                conductormaestro = ve.getConductor().getNombre();
                                                JOptionPane.showMessageDialog(null," Conductor:"+conductormaestro);

                                            }
                                            JOptionPane.showMessageDialog(null, "El vehiculo:\n"+"La placa:"+ve.getPlaca()+
                                                    "\nEl modelo:"+ve.getModelo()+
                                                    "\nCapasidad de carga:"+ve.getCapacidadCarga());

                                            JOptionPane.showMessageDialog(null, "Conductor:\n"+"Nombre:"+con.getNombre()+
                                                    "\nLa identificacion:"+con.getIdentificacion()+
                                                    "\nLicencia:"+con.getLicencia());

                                            if(env.getPeso()>0) {
                                                JOptionPane.showMessageDialog(null, "El envio:\n" + "\nCodigo:" + env.getCodigo() +
                                                        "\nLa dirección:" + env.getDestino() + "\nEl peso es de:" + env.getPeso());
                                            }else{
                                                JOptionPane.showMessageDialog(null, "El envio:\n" + "\nCodigo:" + env.getCodigo() +
                                                        "\nLa dirección:" + env.getDestino() + "\nNo tiene peso:");
                                            }

                                            JOptionPane.showMessageDialog(null, "El estado:\n" + "\nnumero de guia:" + ent.getNumeroguia() +
                                                    "\nestado:" + ent.getEstado());


                                            break;
                                            case "8":
                                                break;
            }
        }while(!opc.equals("8"));

        JOptionPane.showMessageDialog(null,"Se ha finalizado el programa");

    }
}