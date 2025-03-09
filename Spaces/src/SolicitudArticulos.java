import javax.swing.*;
import java.util.ArrayList;

public class SolicitudArticulos {
    private static ArrayList<SolicitudArticulos> listaSolicitudes = new ArrayList<>();
    private int id_Solicitud;
    private int id_Articulo;
    private String nombre_Solicitante;
    private int cantidad_Solicitada;
    private String fecha_Solicitud;
    private String estado;

    public SolicitudArticulos(int id_Solicitud, int id_Articulo, String nombre_Solicitante, int cantidad_Solicitada, String fecha_Solicitud, String estado) {
        this.id_Solicitud = id_Solicitud;
        this.id_Articulo = id_Articulo;
        this.nombre_Solicitante = nombre_Solicitante;
        this.cantidad_Solicitada = cantidad_Solicitada;
        this.fecha_Solicitud = fecha_Solicitud;
        this.estado = estado;
    }

    public void crearSolicitud() {
        listaSolicitudes.add(this);
        JOptionPane.showMessageDialog(null, "Solicitud creada por: " + nombre_Solicitante);
    }

    public void aprobarSolicitud() {
        this.estado = "Aprobado";
        JOptionPane.showMessageDialog(null, "Solicitud aprobada.");
    }

    public void rechazarSolicitud() {
        this.estado = "Rechazado";
        JOptionPane.showMessageDialog(null, "Solicitud rechazada.");
    }

    public void consultarSolicitud() {
        JOptionPane.showMessageDialog(null, "Solicitud de " + nombre_Solicitante + " con estado: " + estado);
    }

    public static SolicitudArticulos buscarSolicitudPorId(int id) {
        for (SolicitudArticulos solicitud : listaSolicitudes) {
            if (solicitud.id_Solicitud == id) {
                return solicitud;
            }
        }
        return null;
    }

    public static void mostrarMenuSolicitudes() {
        String[] opciones = {"Crear Solicitud", "Aprobar Solicitud", "Rechazar Solicitud", "Consultar Solicitud", "Volver"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Solicitudes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Crear Solicitud
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud:"));
                    int idArticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo:"));
                    String solicitante = JOptionPane.showInputDialog("Ingrese el nombre del solicitante:");
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad solicitada:"));
                    String fecha = JOptionPane.showInputDialog("Ingrese la fecha de solicitud:");
                    String estado = "Pendiente";

                    SolicitudArticulos nuevaSolicitud = new SolicitudArticulos(id, idArticulo, solicitante, cantidad, fecha, estado);
                    nuevaSolicitud.crearSolicitud();
                    break;

                case 1: // Aprobar Solicitud
                    int idAprobar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud a aprobar:"));
                    SolicitudArticulos solicitudAprobar = buscarSolicitudPorId(idAprobar);
                    if (solicitudAprobar != null) {
                        solicitudAprobar.aprobarSolicitud();
                    } else {
                        JOptionPane.showMessageDialog(null, "Solicitud no encontrada.");
                    }
                    break;

                case 2: // Rechazar Solicitud
                    int idRechazar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud a rechazar:"));
                    SolicitudArticulos solicitudRechazar = buscarSolicitudPorId(idRechazar);
                    if (solicitudRechazar != null) {
                        solicitudRechazar.rechazarSolicitud();
                    } else {
                        JOptionPane.showMessageDialog(null, "Solicitud no encontrada.");
                    }
                    break;

                case 3: // Consultar Solicitud
                    int idConsultar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la solicitud a consultar:"));
                    SolicitudArticulos solicitudConsultar = buscarSolicitudPorId(idConsultar);
                    if (solicitudConsultar != null) {
                        solicitudConsultar.consultarSolicitud();
                    } else {
                        JOptionPane.showMessageDialog(null, "Solicitud no encontrada.");
                    }
                    break;

                case 4: // Volver
                    return;
            }
        }
    }
}