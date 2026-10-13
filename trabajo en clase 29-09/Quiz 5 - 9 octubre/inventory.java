import java.util.LinkedList;

public class Inventory {

    private LinkedList<Product> products;

    public Inventory() {
        this.products = new LinkedList<>();
    }

    // Agregar producto
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Producto agregado con éxito.");
    }

    // Búsqueda auxiliar por ID
    public Product findProductById(int id) {
        for (Product p : products) {
            if (p.getID() == id) {
                return p;
            }
        }
        return null;
    }

    // Reto 3: Consultar un producto por su ID[cite: 1]
    public void showProductById(int id) {
        Product p = findProductById(id);
        if (p != null) {
            System.out.println("Producto encontrado: " + p);
        } else {
            System.out.println("El producto no existe");
        }
    }

    // Reto 2: Agregar existencia validando el ID[cite: 1]
    public void addStock(int id, int amount) {
        Product p = findProductById(id);
        if (p != null) {
            p.setExistence(p.getExistence() + amount);
            System.out.println("Existencia actualizada. Nueva cantidad: " + p.getExistence());
        } else {
            System.out.println("El producto no existe"); 
        }
    }

    // Reto 2: Actualizar precio validando el ID[cite: 1]
    public void updatePrice(int id, Double newPrice) {
        Product p = findProductById(id);
        if (p != null) {
            p.setPrice(newPrice);
            System.out.println("Precio actualizado con éxito. Nuevo precio: $" + p.getPrice());
        } else {
            System.out.println("El producto no existe");
        }
    }

    // Reto 2: Eliminar producto validando el ID[cite: 1]
    public void removeProduct(int id) {
        Product p = findProductById(id);
        if (p != null) {
            products.remove(p);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("El producto no existe"); 
        }
    }

    // Mostrar todo el inventario
    public void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("\n--- LISTA DE PRODUCTOS ---");
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }
}
