import service.AccountService;
import service.AccountServiceImp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountServiceImp();
        while (true) {
            System.out.print("1: Create account\n2: Login\nChoose: ");
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    accountService.register();
                    break;
                case 2:
                    accountService.login();
                    break;
            }
        }
    }
}
