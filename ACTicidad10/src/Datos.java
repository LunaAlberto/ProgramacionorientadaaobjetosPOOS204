import javax.swing.JOptionPane;
import java.util.Random;
public class Datos {
    public void verificarlargo(int largo){
        if(largo>0 && largo <=8){
            JOptionPane.showMessageDialog(null, "El tamaño esta bien:");

        }else {
            JOptionPane.showMessageDialog(null, "no es un buen tamaño:");
        }
    }

    public void verificarcaracteresespeciales(String caracteresEspeciales){
        if(caracteresEspeciales.isEmpty()){
            JOptionPane.showMessageDialog(null, "ingrese una cracater especial:");
        }else {
            JOptionPane.showMessageDialog(null, "el caracter especial es correcto:");
        }
    }

    public void verificarmayusculas(String mayusculas){
        if(!mayusculas.matches("[A-Z]")){
            JOptionPane.showMessageDialog(null, "Ingrese una letr:");

        }else{
            JOptionPane.showMessageDialog(null, "el mayuscula es correcto:");
        }

    }

    public String generarPassword(int largo,String caracteresEspeciales,String mayusculas) {
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

    public void verificarseguridad(String password){
boolean seguridadValido = true;

for (int i = 0; i < password.length(); i++) {
    if (Character.isUpperCase(password.charAt(i))) {
        seguridadValido=true;
        break;
    }
}
if(seguridadValido){
    JOptionPane.showMessageDialog(null, "es segura");
}else {
    JOptionPane.showMessageDialog(null, "no es seguridad");
}

    }



}
