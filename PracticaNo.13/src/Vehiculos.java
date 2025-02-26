import javax.swing.JOptionPane;
public class Vehiculos {
    private String placa;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public float getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(float capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    private float capacidadCarga;

    public Vehiculos(String placa, String modelo, float capacidadCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
    }

    public void modelo(String modelo) {
       if(modelo.isEmpty()){
           JOptionPane.showMessageDialog(null, "El Modelo no puede estar vacio");
       }else{
           JOptionPane.showMessageDialog(null, "El Modelo es: " + modelo);
       }

    }

    public void placa(String placa) {
        if(placa.isEmpty()){
            JOptionPane.showMessageDialog(null, "El placa no puede estar vacio");
        }else{
            JOptionPane.showMessageDialog(null, "El placa es: " + placa);
        }
    }


    public void capacidadCarga(float capacidadCarga) {
        if(capacidadCarga > 0){
            JOptionPane.showMessageDialog(null, "El capacidad es: " + capacidadCarga);
        }else{
            JOptionPane.showMessageDialog(null, "La capacidad no puede ser negativa o 0");
        }
    }

}


