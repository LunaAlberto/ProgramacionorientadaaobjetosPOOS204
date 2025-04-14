import javax.swing.JOptionPane;
import java.util.Random;

public class datos {

    public void verificarLargo(int largo) {
        if (largo > 0 && largo <= 8) {
            JOptionPane.showMessageDialog(null, "El tamaño es el adecuado");
        } else {
            JOptionPane.showMessageDialog(null, "El tamaño debe ser menor o igual a 8.");
        }
    }

    public void verificarCaracterEspecial(String caracterEspecial) {
        if (caracterEspecial.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un caracter especial");
        } else {
            JOptionPane.showMessageDialog(null, "El caracter especial es correcto");
        }
    }

    public void verificarMayusculas(String mayusculas) {
        if (!mayusculas.matches("[A-Z]")) {
            JOptionPane.showMessageDialog(null, "Ingrese una letra mayúscula");
        } else {
            JOptionPane.showMessageDialog(null, "La letra mayúscula es correcta");
        }
    }

    public String generarPassword(int largo, String caracterEspecial, String mayusculas) {
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < largo - 2; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            password.append(randomChar);
        }
        // Insertar el carácter especial y la mayúscula en posiciones aleatorias
        password.insert(random.nextInt(password.length() + 1), caracterEspecial);
        password.insert(random.nextInt(password.length() + 1), mayusculas);
        return password.toString();
    }
}
