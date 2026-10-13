import java.util.Scanner;

public class InventaryApp {

    public static void main(String[] args) {
        Inventory inv = new Inventory();
        Scanner sc = new Scanner(System.in);

        // Productos de prueba iniciales
        inv.addProduct(new Product(1, 50, "Manzana", 2000.0, "Frutas"));
        inv.addProduct(new Product(2, 70, "Banano", 1300.0, "Frutas"));

        int opt;
        do {
            System.out.println("\n--- MENÚ INVENTARIO ---");
            System.out.println("1. Agregar | 2. Consultar | 3. Sumar Stock | 4. Actualizar Precio | 5. Eliminar | 6. Ver Todo | 7. Salir");
            System.out.print("Opción: ");
            opt = sc.nextInt();

            switch (opt) {
                case 1 -> {
                    System.out.print("ID, Existencia, Precio: ");
                    int id = sc.nextInt(), ext = sc.nextInt();
                    double pr = sc.nextDouble();
                    sc.nextLine(); // Limpiar buffer
                    System.out.print("Nombre: "); String nm = sc.nextLine();
                    System.out.print("Categoría: "); String ct = sc.nextLine();
                    inv.addProduct(new Product(id, ext, nm, pr, ct));
                }
                case 2 -> { System.out.print("ID a consultar: "); inv.showProductById(sc.nextInt()); }
                case 3 -> { System.out.print("ID y Cantidad a sumar: "); inv.addStock(sc.nextInt(), sc.nextInt()); }
                case 4 -> { System.out.print("ID y Nuevo Precio: "); inv.updatePrice(sc.nextInt(), sc.nextDouble()); }
                case 5 -> { System.out.print("ID a eliminar: "); inv.removeProduct(sc.nextInt()); }
                case 6 -> inv.showAllProducts();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opt != 7);

        sc.close();
    }
}
