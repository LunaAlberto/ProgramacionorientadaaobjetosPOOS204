import javax.swing.JOptionPane;
import javax.swing.*;
import java.util.Random;
public class clasenumero1 {

    private int largo ;

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getCaracterespecial() {
        return caracterespecial;
    }

    public void setCaracterespecial(String caracterespecial) {
        this.caracterespecial = caracterespecial;
    }

    private String caracterespecial;

    public String getMayuscula() {
        return mayuscula;
    }

    public void setMayuscula(String mayuscula) {
        this.mayuscula = mayuscula;
    }

    private String mayuscula;

    public void larg(int largo){
        if(largo<=8){
            this.largo=largo;
            JOptionPane.showMessageDialog(null, "La larga es: "+largo);
        }else {
            JOptionPane.showMessageDialog(null, "No cumpple con lo necesario: "+largo);
        }
    }

    public void caracterespecial(String caracterespecial){
        this.caracterespecial=caracterespecial;
    }

    public void mayuscula(String mayuscula){
        this.mayuscula=mayuscula;
    }

    public clasenumero1(int largo, String caracterespecial, String mayuscula) {
        this.largo=largo;
        this.caracterespecial=caracterespecial;
        this.mayuscula=mayuscula;

    }

    public String generarPassword(int largo, String caracteresEspeciales, String mayusculas) {
        Random rand = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < largo - 2; i++) {
            char randomChar = (char) (rand.nextInt(26) + 'a');
            password.append(randomChar);
        }

        password.insert(rand.nextInt(password.length() + 1), caracteresEspeciales);
        password.insert(rand.nextInt(password.length() + 1), mayusculas);

        return password.toString();
    }

    public boolean verificarSeguridad(String password) {
        return password.length() >= 4 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[!@#$%^&*()_+\\-=].*");
    }


}
