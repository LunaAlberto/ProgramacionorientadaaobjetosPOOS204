import javax.swing.*;
import java.util.ArrayList;

public class InventarioArticulos {
    private static ArrayList<InventarioArticulos> listaInventario = new ArrayList<>();
    private int id_Articulo;
    private String nombre_Articulo;
    private String descripcion;
    private double precio;
    private int stock;
    private String categoria;
    private String ubicacion;

    public InventarioArticulos(int id_Articulo, String nombre_Articulo, String descripcion, double precio, int stock, String categoria, String ubicacion) {
        this.id_Articulo = id_Articulo;
        this.nombre_Articulo = nombre_Articulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
    }

    public void agregarArticulo() {
        listaInventario.add(this);
        JOptionPane.showMessageDialog(null, "Artículo agregado al inventario: " + nombre_Articulo);
    }

    public void actualizarStock(int cantidad) {
        this.stock += cantidad;
        JOptionPane.showMessageDialog(null, "Stock actualizado: " + stock);
    }

    public String buscarArticulo() {
        return "Artículo encontrado: " + nombre_Articulo;
    }

    public void eliminarArticulo() {
        listaInventario.remove(this);
        JOptionPane.showMessageDialog(null, "Artículo eliminado del inventario: " + nombre_Articulo);
    }

    public boolean validarStock() {
        return this.stock > 0;
    }

    public static InventarioArticulos buscarArticuloPorId(int id) {
        for (InventarioArticulos articulo : listaInventario) {
            if (articulo.id_Articulo == id) {
                return articulo;
            }
        }
        return null;
    }

    public static void mostrarMenuInventario() {
        String[] opciones = {"Agregar Artículo", "Actualizar Stock", "Eliminar Artículo", "Consultar Artículo", "Volver"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Inventario",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Agregar Artículo
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo:"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del artículo:");
                    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del artículo:");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
                    int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del artículo:"));
                    String categoria = JOptionPane.showInputDialog("Ingrese la categoría del artículo:");
                    String ubicacion = JOptionPane.showInputDialog("Ingrese la ubicación del artículo:");

                    InventarioArticulos nuevoArticulo = new InventarioArticulos(id, nombre, descripcion, precio, stock, categoria, ubicacion);
                    nuevoArticulo.agregarArticulo();
                    break;

                case 1: // Actualizar Stock
                    int idActualizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo a actualizar:"));
                    InventarioArticulos articuloActualizar = buscarArticuloPorId(idActualizar);
                    if (articuloActualizar != null) {
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad a agregar/reducir:"));
                        articuloActualizar.actualizarStock(cantidad);
                    } else {
                        JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
                    }
                    break;

                case 2: // Eliminar Artículo
                    int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo a eliminar:"));
                    InventarioArticulos articuloEliminar = buscarArticuloPorId(idEliminar);
                    if (articuloEliminar != null) {
                        articuloEliminar.eliminarArticulo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
                    }
                    break;

                case 3: // Consultar Artículo
                    int idConsultar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo a consultar:"));
                    InventarioArticulos articuloConsultar = buscarArticuloPorId(idConsultar);
                    if (articuloConsultar != null) {
                        JOptionPane.showMessageDialog(null, "Artículo encontrado: " + articuloConsultar.nombre_Articulo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
                    }
                    break;

                case 4: // Volver
                    return;
            }
        }
    }
}