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
        this.conductor=null;

    }

    public void modelo(String modelo) {
       if(modelo.length()==0){

           JOptionPane.showMessageDialog(null, "El Modelo no puede estar vacio");
       }else{
           this.modelo = modelo;
           JOptionPane.showMessageDialog(null, "El Modelo es: " + modelo);
       }

    }

    public void placa(String placa) {
        if(placa.length()==0){

            JOptionPane.showMessageDialog(null, "El placa no puede estar vacio");
        }else{
            this.placa = placa;
            JOptionPane.showMessageDialog(null, "El placa es: " + placa);
        }
    }


    public void capacidadCarga(float capacidadCarga) {
        if(capacidadCarga >0){

            JOptionPane.showMessageDialog(null, "El capacidad es: " + capacidadCarga);
            this.capacidadCarga = capacidadCarga;
        }else{

            JOptionPane.showMessageDialog(null, "La capacidad no puede ser negativa o 0");
        }
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    private Conductor conductor;
    public void conductor(Conductor conductor) {
        this.conductor = conductor;
    }

}


