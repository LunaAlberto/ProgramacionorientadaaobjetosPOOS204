import javax.swing.JOptionPane;
import java.util.Random;
class Matricula {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String anoNacimiento;
    private String carrera;
    private String anoencuerso;
    private int tamano;

    public Matricula(int tamano, String nombre, String apellidoPaterno, String apellidoMaterno, String anoNacimiento, String carrera, String anoencuerso) {
        this.tamano = tamano;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.anoNacimiento = anoNacimiento;
        this.carrera = carrera;
        this.anoencuerso = anoencuerso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setAnoNacimiento(String anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setAnoencuerso(String anoencuerso) {
        this.anoencuerso = anoencuerso;
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre);
        JOptionPane.showMessageDialog(null, "El apellido paterno es: " + apellidoPaterno);
        JOptionPane.showMessageDialog(null, "El apellido materno es: " + apellidoMaterno);
        JOptionPane.showMessageDialog(null, "El año de nacimiento es: " + anoNacimiento);
        JOptionPane.showMessageDialog(null, "La carrera es: " + carrera);
    }

    public String generarMatricula() {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(9000) + 1000; // Número aleatorio de 4 dígitos
        return (apellidoPaterno.substring(0, 2) + apellidoMaterno.substring(0, 2) +
                nombre.substring(0, 2) + anoNacimiento.substring(2, 4) +
                carrera.substring(0, 2) + anoencuerso + numeroAleatorio).toUpperCase();
    }


}


