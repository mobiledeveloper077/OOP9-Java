package models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

    private UUID orderNumber = UUID.randomUUID();
    private List<Product> productList = new ArrayList<>();
    private boolean isOrder;

    public Order() {
    }


    public UUID getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(UUID orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public boolean isOrder() {
        return isOrder;
    }

    public void setOrder(boolean order) {
        isOrder = order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", productList=" + productList +
                ", isOrder=" + isOrder +
                '}';
    }
}
