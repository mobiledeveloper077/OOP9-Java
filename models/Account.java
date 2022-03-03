package models;

import models.Order;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private String name;
    private String password;
    private String username;
    private Role role = Role.Customer;
    private List<Order> orderList = new ArrayList<>();

    public Account(String name, String password, String username, Role role) {
        this.name = name;
        this.password = password;
        this.username = username;
        this.role = role;
    }

    public Account(String name, String password, String username) {
        this.name = name;
        this.password = password;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", role=" + role +
                ", orderList=" + orderList +
                '}';
    }
}
