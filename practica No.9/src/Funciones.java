public class Funciones {
    // Variables para almacenar información
    public String nombre;
    public String marca;
    public String color;
    public Double peso;
    public Double precio;
    public String departamento;
    public int totalVentas = 0;

    // Método para registrar un electrodoméstico
    public void registrarElectrodomestico(String nom, String marc, String col, Double pes, Double prec, String dept) {
        nombre = nom;
        marca = marc;
        color = col;
        peso = pes;
        precio = prec;
        departamento = dept;

        totalVentas++;
        System.out.println("Electrodoméstico registrado exitosamente.");
    }

    // Método para consultar todos los electrodomésticos registrados
    public void consultarTodo() {
        System.out.println("Electrodoméstico registrado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso);
        System.out.println("Precio: " + precio);
        System.out.println("Departamento: " + departamento);

    }

    // Método para consultar el total de ventas
    public void consultarVentas() {
        System.out.println("Total de ventas: " + totalVentas);
    }
}


