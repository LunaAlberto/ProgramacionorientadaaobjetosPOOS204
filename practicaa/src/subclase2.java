import javax.swing.JOptionPane;
import java.util.Random;
class subclase2 {

 public String nombre;
    public String apellido;
    public String apellidom;
    public int largo;
    public String carrera;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAnoencurso() {
        return anoencurso;
    }

    public void setAnoencurso(String anoencurso) {
        this.anoencurso = anoencurso;
    }

    public String anoencurso;

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String nacimiento;

    public subclase2(   String nombre,
    String apellido,
    String apellidom,
    int largo,
    String carrera,
    String anoencurso,
    String nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellidom = apellidom;
        this.largo = largo;
        this.carrera = carrera;
        this.anoencurso = anoencurso;
        this.nacimiento = nacimiento;

    }

    public String generarcontrasena(){
        Random rand = new Random();
      int numeroaleatori=(rand.nextInt(9000)+1000);
        return (nombre.substring(0,2) + apellido.substring(0,2) + apellidom.substring(apellidom.length()-2) +
                carrera.substring(carrera.length()/2 - 1, carrera.length()/2 + 1) +
                anoencurso.substring(0,2) + nacimiento.substring(nacimiento.length()/2+1)).toUpperCase();
    }

}



