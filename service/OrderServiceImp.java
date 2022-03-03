package service;

import models.Account;
import models.Order;
import models.Product;

import java.util.List;
import java.util.Scanner;

public class OrderServiceImp implements OrderService {

    private List<Product> productList;
    private Account account;
    private Scanner scanner = new Scanner(System.in);

    public OrderServiceImp(List<Product> productList, Account account) {
        this.productList = productList;
        this.account = account;
    }


    @Override
    public void addOrder() {
        Order order = new Order();
        List<Product> orderProductList = order.getProductList();
        boolean a = true;
        while (a) {
            System.out.print("1->Choose product; 2 -> The End");
            int m = scanner.nextInt();
            switch (m) {
                case 1:
                    for (int i = 0; i < this.productList.size(); i++) {
                        System.out.println((i + 1) + ": " + this.productList.get(i));
                    }
                    System.out.print("choose: ");
                    int n = scanner.nextInt() - 1;
                    orderProductList.add(productList.get(n));
                    productList.get(n).setCount(productList.get(n).getCount() - 1);
                    break;
                case 2:
                    a = false;
                    break;
            }
        }
        order.setProductList(orderProductList);
        account.getOrderList().add(order);
    }

    @Override
    public void deleteOrder() {

    }

    @Override
    public void deleteProductByOrder() {

    }

    @Override
    public void listOrders() {
        System.out.println(account);
    }
}
