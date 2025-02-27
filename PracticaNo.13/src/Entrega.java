import javax.swing.JOptionPane;
import java.util.*;
public class Entrega {

   private  String numeroguia;
    private String estado;

    public String getNumeroguia() {
        return numeroguia;
    }

    public void setNumeroguia(String numeroguia) {
        this.numeroguia = numeroguia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



    public Entrega(String numeroguia, String estado) {
        this.numeroguia = numeroguia;
        this.estado = estado;
    }

    public void numeroguia(String numeroguia) {
        this.numeroguia = numeroguia;
    }

    public void estado(String estado) {
       if(estado.isEmpty()) {

       }else{
           this.estado = estado;
       }

    }

    public void actualizarestado(String estado) {
        if (estado.equalsIgnoreCase("entransito") || estado.equalsIgnoreCase("entregado")) {
            this.estado = estado;
        }else{
            JOptionPane.showMessageDialog(null, "Estado incorrecto");
        }
    }


}
