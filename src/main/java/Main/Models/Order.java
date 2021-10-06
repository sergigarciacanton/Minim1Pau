package Main.Models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Product> productsList;
    String user;

    public Order(List<Product> productsList, String user) {
        this.productsList = productsList;
        this.user = user;
    }

    public Order(String user) {
        this.user = user;
        this.productsList = new ArrayList<>();
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
