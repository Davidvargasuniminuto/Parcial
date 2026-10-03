import java.util.LinkedList;

public class InventaryApp {

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setID(1);
        p1.setName("manzana");
        p1.setPrice(2000.0);
        p1.setExistence(50);
       
        Product p2 = new Product();
        p2.setID(2);
        p2.setName("banano");
        p2.setPrice(1300.0);
        p2.setExistence(70);
       
        Product p3 = new Product(3, 30, "aguacate", 6000.0);
       
        Product p4 = new Product();
        p4.setID(4);
        p4.setName("pepino");
        p4.setPrice(2500.0);
        p4.setExistence(59);
       
        Product p5 = new Product(5, 200, "lulo", 4000.0);
       
        System.out.println(p1.getName());
        System.out.println(p1.getExistence());
        
        p1.setPrice(4000.0);
        System.out.println(p1.toString());
       
        System.out.println(p2.getName());
        System.out.println(p2.getExistence());
        
        p2.setPrice(2400.0);
        System.out.println(p2.toString());
        
        LinkedList<Product> products = new LinkedList<>();

        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.addFirst(p4);
        products.addLast(p5);

        System.out.println("\n PUNTO 5: CONSULTAS ");
        System.out.println("Primer elemento: " + products.getFirst().getName());
        System.out.println("Último elemento: " + products.getLast().getName());
        System.out.println("Elemento en el índice 2: " + products.get(2).getName());
        System.out.println("Cantidad de elementos en la lista: " + products.size());

        System.out.println("\n PUNTO 6: RECORRER LA LISTA ");
        for (Product p : products) {
            System.out.println(p.toString());
        }

        System.out.println("\n PUNTO 7: BUSCAR UN PRODUCTO ");
        int idBuscar = 3;
        Product productoBuscado = null;

        for (Product p : products) {
            if (p.getID() == idBuscar) {
                productoBuscado = p;
                break;
            }
        }

        if (productoBuscado != null) {
            System.out.println("Producto encontrado con ID " + idBuscar + ": " + productoBuscado.getName());
        } else {
            System.out.println("No se encontró el producto con ID " + idBuscar);
        }

        System.out.println("\n PUNTO 8: MODIFICAR UN PRODUCTO ");
        System.out.println("Precio anterior del primer producto (" + products.getFirst().getName() + "): " + products.getFirst().getPrice());
        
        products.getFirst().setPrice(3000.0);
        
        System.out.println("Nuevo precio actualizado: " + products.getFirst().getPrice());

        System.out.println(/n PUNTO 9: ELIMINAR INICIO Y FINAL ");
        Product eliminadoInicio = products.removeFirst();
        Product eliminadoFinal = products.removeLast();

        System.out.println("Elemento eliminado al inicio: " + eliminadoInicio.getName());
        System.out.println("Elemento eliminado al final: " + eliminadoFinal.getName());
        System.out.println("Nueva cantidad de elementos tras la eliminación: " + products.size());
    }
}
