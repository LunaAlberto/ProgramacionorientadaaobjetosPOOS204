import javax.swing.JOptionPane;
public class Funciones {


    /////////se crearon metodos get y set se colocaron los metodos en privados
    private int getNnumerocuenta() {
        return nnumerocuenta;
    }

    private void setNnumerocuenta(int nnumerocuenta) {
        this.nnumerocuenta = nnumerocuenta;
    }

    private int nnumerocuenta;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    private String Titular;

    ///


    public Funciones(String t,int nCuenta,double s){
        Titular = t;
        nnumerocuenta = nCuenta;
        saldo = s;
    }

    public void depositar(double monto){
        if(monto >0){
            saldo += monto;
            JOptionPane.showInputDialog(null,"se agrego su deposito:"+saldo);



        }else{
            JOptionPane.showMessageDialog(null,"monto no valido");

        }
    }

    public void retirar(double monto){
        if(monto >0 && monto <=saldo){
            saldo -= monto;
            JOptionPane.showInputDialog(null,"se agrego su retiro:"+saldo);

        }else {
            JOptionPane.showMessageDialog(null,"monto no valido");
        }



    }
    public void trasnferir(Funciones destino,double monto){
        if(monto >0 && monto <=saldo){
            saldo -= monto;
            destino.saldo+=monto;
            JOptionPane.showMessageDialog(null,"trasnferiencia de saldo"+saldo);

        }else {
            JOptionPane.showMessageDialog(null,"monto no valido");
        }

    }
    public double calcularSaldo(){
        return saldo;
    }

}
