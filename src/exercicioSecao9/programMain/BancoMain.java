package exercicioSecao9.programMain;

import java.util.Locale;
import java.util.Scanner;

import static exercicioSecao9.controller.BancoController.*;

public class BancoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int option;

        do {
            System.out.println("Your Bank \n"
                    + "1. Create new account\n"
                    + "2. Deposit to your account\n"
                    + "3. Withdraw value to your account\n"
                    + "4. Edit account name\n"
                    + "5. Exit\n");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    System.out.println("returning to the menu...");
                    break;
                case 2:
                    depositAccount();
                    System.out.println("returning to the menu...");
                    break;
                case 3:
                    withdrawValue();
                    System.out.println("returning to the menu...");
                    break;
                case 4:
                    editAccountName();
                    System.out.println("returning to the menu...");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (option != 5);

        sc.close();
    }


}
