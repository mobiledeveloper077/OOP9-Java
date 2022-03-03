package service;

import models.Account;
import models.Product;
import models.Role;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImp implements AccountService {

    private List<Account> accountList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private List<Product> productList = new ArrayList<>();

    public AccountServiceImp() {
        Account account = new Account("Abduvali", "123", "admin", Role.Admin);
        accountList.add(account);
    }

    @Override
    public void register() {
        System.out.print("enter name: ");
        String name = scanner.next();
        System.out.print("enter password: ");
        String password = scanner.next();
        System.out.print("enter user name: ");
        String username = scanner.next();
        Account account = new Account(name, password, username);
        accountList.add(account);
    }

    @Override
    public void login() {
        int index = -1;
        System.out.print("enter password: ");
        String password = scanner.next();
        System.out.print("enter user name: ");
        String username = scanner.next();
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getPassword().equals(password) && accountList.get(i).getUsername().equals(username))
                index = i;
        }
        if (index > -1) {
            if (accountList.get(index).getRole() == Role.Admin) {
                boolean b = true;
                AdminService adminService = new AdminServiceImp(productList, accountList);
                while (b) {
                    System.out.print("1: add product\n2:Get orders \n3: exit\nenter: ");
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1:
                            adminService.addProduct();
                            break;
                        case 2:
                            adminService.getOrdersByAccount();
                            break;
                        case 3:
                            b = false;
                            break;
                    }
                }
            } else {
                boolean a = true;
                OrderService orderService = new OrderServiceImp(productList, accountList.get(index));
                while (a) {
                    System.out.print("1: zakaz berish\n2: delete\n3: delete product by order\n4: info account \n5: exit\nenter: ");
                    int n = scanner.nextInt();
                    switch (n) {
                        case 1:
                            orderService.addOrder();
                            break;
                        case 2:
                            orderService.deleteOrder();
                            break;
                        case 3:
                            orderService.deleteProductByOrder();
                            break;
                        case 4:
                            orderService.listOrders();
                            break;
                        case 5:
                            a = false;
                            break;
                    }
                }
            }
        } else System.out.println("not found !");
    }
}
