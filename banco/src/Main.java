import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        System.out.println("hola");
        String nombre;
        String opc;
        int nnumerocuenta;
        double montoDepodsitado;
        double montoRetirado;
        double monyotrasnferir;
        nombre=JOptionPane.showInputDialog("ingrese su nombre:");
        nnumerocuenta=Integer.parseInt(JOptionPane.showInputDialog("ingrese numeor de cuenta"));
        Funciones f = new Funciones(nombre,nnumerocuenta,0);

       do{
           opc=JOptionPane.showInputDialog("ingrese opcio:1 depositar,2 retirar 3 trasnferir ,4 consultar saldo ,5 salir");
           switch(opc){
               case "1":
                   montoDepodsitado = Double.parseDouble(JOptionPane.showInputDialog("ingrese monto a depositar"));
                   f.depositar(montoDepodsitado);
                   break;
                   case "2":
                       montoRetirado=Double.parseDouble(JOptionPane.showInputDialog("ingrese monto a retirar"));
                       f.retirar(montoRetirado);

                       break;
                       case "3":

                           monyotrasnferir=Double.parseDouble(JOptionPane.showInputDialog("ingrese el monto:"));
                           Funciones destinoo=new Funciones("cuenta de destino",99999,1000);
                           f.trasnferir(destinoo,monyotrasnferir);
                           break;
                           case "4":
                               JOptionPane.showMessageDialog(null,f.calcularSaldo());
                               break;
                               case "5":
                                   JOptionPane.showMessageDialog(null,"gracias por su visita:");
                                   break;
           }

       }while (!opc.equals("5"));

    }
}