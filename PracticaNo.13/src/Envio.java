import javax.swing.JOptionPane;
import javax.swing.*;
public class Envio {

   private String codigo;
    private String destino;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private float peso;

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Envio(String codigo, String destino, float peso) {
        this.codigo = codigo;
        this.destino = destino;
        this.peso = peso;
    }


    public void codigo(String codigo) {
        this.codigo = codigo;
    }

    public void destino(String destino) {
        this.destino = destino;
    }
    public void peso(float peso) {
        this.peso = peso;
    }
}
