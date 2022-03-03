package service;

import models.Account;
import models.Order;
import models.Product;

import java.util.List;
import java.util.Scanner;

public class AdminServiceImp implements AdminService {

    private Scanner scanner = new Scanner(System.in);
    private List<Product> productList;
    private List<Account> accountList;

    public AdminServiceImp(List<Product> productList, List<Account> accountList) {
        this.productList = productList;
        this.accountList = accountList;
    }

    @Override
    public void addProduct() {
        System.out.print("enter name product: ");
        String name = scanner.next();
        System.out.print("enter info: ");
        String info = scanner.next();
        System.out.print("enter price: ");
        double price = scanner.nextDouble();
        System.out.print("enter count: ");
        int count = scanner.nextInt();
        Product product = new Product(name, info, price, count);
        productList.add(product);
    }

    @Override
    public void getOrdersByAccount() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println((i + 1) + " -> " + accountList.get(i).getName());
        }
        int n = scanner.nextInt() - 1;
        List<Order> orderList = accountList.get(n).getOrderList();
        boolean isHave = false;
        for (int i = 0; i < orderList.size(); i++) {
            if (!orderList.get(i).isOrder()) {
                isHave = true;
                System.out.println((i + 1) + " -> " + orderList.get(i).getOrderNumber());
            }
        }
        if (isHave) {
            int n1 = scanner.nextInt() - 1;
            orderList.get(n1).setOrder(true);
        } else {
            System.out.println("Orders not found.");
        }
    }
}
