import javax.swing.JOptionPane;
public class CLASEHIJO2 extends CLASEPADRE {

    public String getCondustor() {
        return Condustor;
    }

    public void setCondustor(String condustor) {
        Condustor = condustor;
    }

    private String Condustor;

    public CLASEHIJO2(String nombre, double salario, int id,String Condustor) {
        super(nombre, salario, id);
        this.Condustor = Condustor;
    }

    public void conductorusuario(String Condustor) {
        this.Condustor = Condustor;
    }

    public void mostrarIMNFO(){
        JOptionPane.showMessageDialog(null,"La licensia es:"+Condustor);
    }


}
