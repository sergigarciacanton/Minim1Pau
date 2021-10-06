package Main.Models;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    List<Order> ordersList;

    public User(String name, List<Order> ordersList) {
        this.name = name;
        this.ordersList = ordersList;
    }

    public User(String name) {
        this.name = name;
        ordersList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Order> ordersList) {
        this.ordersList = ordersList;
    }
}
