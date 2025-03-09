import javax.swing.*;
import java.util.ArrayList;

public class AdministracionUsuarios {
    private static ArrayList<AdministracionUsuarios> listaUsuarios = new ArrayList<>();
    private String idUsuario;
    private String usuario;
    private String direccion;
    private String puesto;
    private String correo;

    public AdministracionUsuarios(String idUsuario, String usuario, String direccion, String puesto, String correo) {
        this.idUsuario = idUsuario;
        this.usuario = usuario;
        this.direccion = direccion;
        this.puesto = puesto;
        this.correo = correo;
    }

    public void crearUsuario() {
        listaUsuarios.add(this);
        JOptionPane.showMessageDialog(null, "Usuario creado: " + usuario);
    }

    public void eliminarUsuario() {
        listaUsuarios.remove(this);
        JOptionPane.showMessageDialog(null, "Usuario eliminado: " + usuario);
    }

    public void actualizarUsuario(String direccion, String puesto, String correo) {
        this.direccion = direccion;
        this.puesto = puesto;
        this.correo = correo;
        JOptionPane.showMessageDialog(null, "Usuario actualizado: " + usuario);
    }

    public void consultarUsuario() {
        JOptionPane.showMessageDialog(null, "Datos del usuario: " + usuario + ", Puesto: " + puesto);
    }

    public static AdministracionUsuarios buscarUsuarioPorId(String id) {
        for (AdministracionUsuarios usuario : listaUsuarios) {
            if (usuario.idUsuario.equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public static void mostrarMenuUsuarios() {
        String[] opciones = {"Crear Usuario", "Eliminar Usuario", "Actualizar Usuario", "Consultar Usuario", "Volver"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Usuarios",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Crear Usuario
                    String id = JOptionPane.showInputDialog("Ingrese el ID del usuario:");
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
                    String direccion = JOptionPane.showInputDialog("Ingrese la dirección del usuario:");
                    String puesto = JOptionPane.showInputDialog("Ingrese el puesto del usuario:");
                    String correo = JOptionPane.showInputDialog("Ingrese el correo del usuario:");

                    AdministracionUsuarios nuevoUsuario = new AdministracionUsuarios(id, nombre, direccion, puesto, correo);
                    nuevoUsuario.crearUsuario();
                    break;

                case 1: // Eliminar Usuario
                    String idEliminar = JOptionPane.showInputDialog("Ingrese el ID del usuario a eliminar:");
                    AdministracionUsuarios usuarioEliminar = buscarUsuarioPorId(idEliminar);
                    if (usuarioEliminar != null) {
                        usuarioEliminar.eliminarUsuario();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
                    }
                    break;

                case 2: // Actualizar Usuario
                    String idActualizar = JOptionPane.showInputDialog("Ingrese el ID del usuario a actualizar:");
                    AdministracionUsuarios usuarioActualizar = buscarUsuarioPorId(idActualizar);
                    if (usuarioActualizar != null) {
                        String nuevaDireccion = JOptionPane.showInputDialog("Ingrese la nueva dirección:");
                        String nuevoPuesto = JOptionPane.showInputDialog("Ingrese el nuevo puesto:");
                        String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo:");
                        usuarioActualizar.actualizarUsuario(nuevaDireccion, nuevoPuesto, nuevoCorreo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
                    }
                    break;

                case 3: // Consultar Usuario
                    String idConsultar = JOptionPane.showInputDialog("Ingrese el ID del usuario a consultar:");
                    AdministracionUsuarios usuarioConsultar = buscarUsuarioPorId(idConsultar);
                    if (usuarioConsultar != null) {
                        usuarioConsultar.consultarUsuario();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
                    }
                    break;

                case 4: // Volver
                    return;
            }
        }
    }
}