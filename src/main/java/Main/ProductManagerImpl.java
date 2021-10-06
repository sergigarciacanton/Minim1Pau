package Main;

import Main.Models.Order;
import Main.Models.Product;
import Main.Models.User;
import org.apache.log4j.Logger;

import java.util.*;

public class ProductManagerImpl implements ProductManager{
    List<Product> productsList = new ArrayList<>();
    Queue<Order> ordersList = new LinkedList<>();
    List<User> usersList = new ArrayList<>();

    final static Logger logger = Logger.getLogger(ProductManagerImpl.class);

    private static ProductManagerImpl instance;

    public static ProductManagerImpl getInstance() {
        if(instance == null)
            instance = new ProductManagerImpl();

        return instance;
    }

    @Override
    public List<Product> getProductsByPrice() {
        logger.info("Products before: " + productsList.toString());
        Collections.sort(productsList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int)o1.getPrice() - (int)o2.getPrice();
            }
        });
        logger.info("Products after: " + productsList.toString());
        return productsList;
    }

    @Override
    public void doOrder(Order order) {

    }

    @Override
    public Order serveOrder() {
        return null;
    }

    @Override
    public List<Order> getOrdersByUser(String user) {
        return null;
    }

    @Override
    public List<Product> getProductsBySales() {
        return null;
    }

    public void addProduct(Product product) {
        productsList.add(product);
    }
}
