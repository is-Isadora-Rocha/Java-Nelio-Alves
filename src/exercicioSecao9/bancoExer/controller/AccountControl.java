package exercicioSecao9.bancoExer.controller;

import exercicioSecao9.bancoExer.entities.AccountBank;

import java.util.Objects;
import java.util.Scanner;

public class AccountControl {

    public static void createAccount(Scanner sc){
        System.out.println("##############");
        System.out.print("Enter account number: ");
        int account = 0;

        boolean isValid = false;

        do {
            if (sc.hasNextInt()) {
                account = sc.nextInt();
                sc.nextLine(); //limpar buffer de entrada

                if (String.valueOf(account).length() == 4){
                    isValid = true;
                } else {
                    System.out.println("Invalid account number! Please enter a 4-digit number");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid 4-digit number.");
                sc.nextLine(); // Limpar o buffer de entrada
            }
        } while (!isValid);

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?");
        String choose = sc.nextLine();

        double initDeposit = 0;
        if (Objects.equals(choose, "y")) { //char response = sc.next().chatAt(0)
            System.out.println("Enter initial deposit value: ");
            initDeposit = sc.nextDouble();
        }
        System.out.println("##############");

        AccountBank accountBank = new AccountBank(account, name, initDeposit);

        System.out.println("Account data: ");
        System.out.println("Account" + accountBank.getAcount()
                + "\n" + "Holder: " + accountBank.getName()
                + "\n" + "Balance: " + accountBank.getInitDeposit()
        );
        System.out.println("##############");
        sc.close();
    }

    public static void depositAccount(Scanner sc){
        System.out.print("Deposit value into your account\n"
                + "Enter deposite value: "
        );
        int quantity = 0;

        AccountBank accountBank = new AccountBank(quantity);
        quantity = sc.nextInt();
        accountBank.addDeposit(quantity);

        System.out.println("Update bank: " + accountBank);

        sc.close();
    }

    public static void withdrawValue(Scanner sc){
        System.out.print("Withdraw value into your account\n"
                + "Enter value: "
        );
        int quantity = 0;

        AccountBank accountBank = new AccountBank(quantity);
        quantity = sc.nextInt();
        accountBank.withdrawDeposit(quantity);

        System.out.println("Update bank: " + accountBank);

        sc.close();
    }

    public static void editAccountName(Scanner sc){
        AccountBank accountBank = new AccountBank();
        System.out.println("Your current name: " + accountBank.getName());
        System.out.print("Enter name to change: ");
        String newName = sc.nextLine();
        accountBank.setName(newName);

        sc.close();
    }
}
