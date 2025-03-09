import javax.swing.*;

public class Autenticacion {
    private String usuario;
    private String contrasena;
    private String departamento;

    public Autenticacion(String usuario, String contrasena, String departamento) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.departamento = departamento;
    }

    public boolean login(String usuario, String contrasena) {
        if (this.usuario.equals(usuario) && this.contrasena.equals(contrasena)) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            return false;
        }
    }

    public void logout() {
        JOptionPane.showMessageDialog(null, "Sesión cerrada.");
    }

    public String recuperar(String correo) {
        String mensaje = "Nueva contraseña enviada a " + correo;
        JOptionPane.showMessageDialog(null, mensaje);
        return mensaje;
    }

    public static void mostrarMenuAutenticacion() {
        Autenticacion auth = new Autenticacion("admin", "1234", "TI");
        String[] opciones = {"Iniciar Sesión", "Cerrar Sesión", "Recuperar Contraseña", "Volver"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Autenticación",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Iniciar Sesión
                    String usuario = JOptionPane.showInputDialog("Ingrese su usuario:");
                    String contrasena = JOptionPane.showInputDialog("Ingrese su contraseña:");
                    auth.login(usuario, contrasena);
                    break;

                case 1: // Cerrar Sesión
                    auth.logout();
                    break;

                case 2: // Recuperar Contraseña
                    String correo = JOptionPane.showInputDialog("Ingrese su correo:");
                    auth.recuperar(correo);
                    break;

                case 3: // Volver
                    return;
            }
        }
    }
}