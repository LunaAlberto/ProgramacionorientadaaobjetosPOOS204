import javax.swing.*;
import java.util.ArrayList;

public class AdministradorArticulo {
    private static ArrayList<AdministradorArticulo> listaArticulos = new ArrayList<>(); // ArrayList para almacenar artículos
    private int id_Articulo;
    private String nombre_Articulo;
    private String descripcion;
    private double precio;
    private int stock;
    private String estado;

    public AdministradorArticulo(int id_Articulo, String nombre_Articulo, String descripcion, double precio, int stock, String estado) {
        this.id_Articulo = id_Articulo;
        this.nombre_Articulo = nombre_Articulo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    // dar de alta un artículo
    public void altaArticulo() {
        listaArticulos.add(this); // Agrega el artículo al ArrayList
        JOptionPane.showMessageDialog(null, "Artículo agregado: " + nombre_Articulo);
    }

    // modificar un artículo
    public void modificarArticulo(String nombre, String descripcion, double precio, int stock, String estado) {
        this.nombre_Articulo = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
        JOptionPane.showMessageDialog(null, "Artículo modificado: " + nombre);
    }

    // eliminar un artículo
    public void bajaArticulo() {
        listaArticulos.remove(this); // Elimina el artículo del ArrayList
        JOptionPane.showMessageDialog(null, "Artículo eliminado: " + nombre_Articulo);
    }

    // validar un artículo
    public boolean validarArticulo() {
        return this.stock > 0;
    }

    // buscar un artículo por ID
    public static AdministradorArticulo buscarArticuloPorId(int id) {
        for (AdministradorArticulo articulo : listaArticulos) {
            if (articulo.getId_Articulo() == id) {
                return articulo;
            }
        }
        return null; // Retorna null si no encuentra el artículo
    }

    // Menú de artículos
    public static void mostrarMenuArticulos() {
        String[] opciones = {"Alta Artículo", "Modificar Artículo", "Eliminar Artículo", "Validar Artículo", "Mostrar Artículos", "Volver"};
        while (true) {
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Artículos",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

            switch (seleccion) {
                case 0: // Alta Artículo
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo:"));
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del artículo:");
                    String descripcion = JOptionPane.showInputDialog("Ingrese la descripción del artículo:");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del artículo:"));
                    int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock del artículo:"));
                    String estado = JOptionPane.showInputDialog("Ingrese el estado del artículo:");

                    AdministradorArticulo nuevoArticulo = new AdministradorArticulo(id, nombre, descripcion, precio, stock, estado);
                    nuevoArticulo.altaArticulo();
                    break;

                case 1: // Modificar Artículo
                    int idModificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo a modificar:"));
                    AdministradorArticulo articuloModificar = buscarArticuloPorId(idModificar);

                    if (articuloModificar != null) {
                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                        String nuevaDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripción:");
                        double nuevoPrecio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo precio:"));
                        int nuevoStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo stock:"));
                        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado:");

                        articuloModificar.modificarArticulo(nuevoNombre, nuevaDescripcion, nuevoPrecio, nuevoStock, nuevoEstado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
                    }
                    break;

                case 2: // Eliminar Artículo
                    int idEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo a eliminar:"));
                    AdministradorArticulo articuloEliminar = buscarArticuloPorId(idEliminar);

                    if (articuloEliminar != null) {
                        articuloEliminar.bajaArticulo();
                    } else {
                        JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
                    }
                    break;

                case 3: // Validar Artículo
                    int idValidar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del artículo a validar:"));
                    AdministradorArticulo articuloValidar = buscarArticuloPorId(idValidar);

                    if (articuloValidar != null) {
                        boolean valido = articuloValidar.validarArticulo();
                        JOptionPane.showMessageDialog(null, "El artículo es válido: " + valido);
                    } else {
                        JOptionPane.showMessageDialog(null, "Artículo no encontrado.");
                    }
                    break;

                case 4: // Mostrar Artículos
                    StringBuilder lista = new StringBuilder("Lista de Artículos:\n");
                    for (AdministradorArticulo articulo : listaArticulos) {
                        lista.append("ID: ").append(articulo.getId_Articulo())
                                .append(", Nombre: ").append(articulo.getNombre_Articulo())
                                .append(", Stock: ").append(articulo.getStock())
                                .append("\n");
                    }
                    JOptionPane.showMessageDialog(null, lista.toString());
                    break;

                case 5: // Volver
                    return;
            }
        }
    }

    // Getters y Setters
    public int getId_Articulo() { return id_Articulo; }
    public String getNombre_Articulo() { return nombre_Articulo; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public String getEstado() { return estado; }
}