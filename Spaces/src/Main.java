import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Artículos", "Solicitudes", "Usuarios", "Autenticación", "Inventario", "Salir"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Principal",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Artículos
                    AdministradorArticulo.mostrarMenuArticulos();
                    break;
                case 1: // Solicitus
                    SolicitudArticulos.mostrarMenuSolicitudes();
                    break;
                case 2: // Usuario
                    AdministracionUsuarios.mostrarMenuUsuarios();
                    break;
                case 3: // Autenticación
                    Autenticacion.mostrarMenuAutenticacion();
                    break;
                case 4: // Inventario
                    InventarioArticulos.mostrarMenuInventario();
                    break;
                case 5: // Salir
                    System.exit(0);
                    break;
            }
        }
    }
}