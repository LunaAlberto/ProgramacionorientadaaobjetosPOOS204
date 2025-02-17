public class Funciones {

    public String datos;
    int numerodecuenta;
    int cuentaatraspasar;
    double deposito;
    double retiro;
    double saldo;
    String titular;
    int edad;
    String nombre;
    double mostrarsaldo;

    //funciones

    Funciones f = new Funciones();

    public void mosntrarinfo(){
        System.out.println("Titular:"+titular);
        System.out.println("numero de cuenta:"+numerodecuenta);
    }
    public double mostrarsaldo(){
        return saldo;
    }

    public void mostrarretiro(double monto){
        if(monto<=saldo){
            saldo-=monto;
            System.out.println("Saldo actual: "+saldo);

        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrardeposito(double monto){
        saldo+=monto;
        System.out.println("Saldo actual: "+saldo);
    }

    public void trasbferencia(Funciones destino,double monto){
        if(monto<=saldo){
            saldo-=monto;
            destino.saldo+=monto;
            System.out.println("Saldo actual: "+destino.saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
