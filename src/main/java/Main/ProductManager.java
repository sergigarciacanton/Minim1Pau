package Main;

import Main.Models.Order;
import Main.Models.Product;
import java.util.List;

public interface ProductManager {
    List<Product> getProductsByPrice();
    void doOrder(Order order);
    Order serveOrder();
    List<Order> getOrdersByUser(String user);
    List<Product> getProductsBySales();
}
