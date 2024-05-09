package exercicioSecao9.bancoExer.controller;

import exercicioSecao9.bancoExer.entities.AccountBank;

import java.util.Scanner;

import static java.util.Locale.*;

public class AccountControl {
    
    public static void createAccount(Scanner sc){
        setDefault(US);
        AccountBank accountBank;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        boolean isValid = false;
        do {
            if (String.valueOf(number).length() == 4){
                isValid = true;
            } else {
                System.out.println("Invalid account number! Please enter a 4-digit number");
            }
        } while (!isValid);

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initDeposit = sc.nextDouble();
            accountBank = new AccountBank(number, holder, initDeposit);
        } else {
            accountBank = new AccountBank(number, holder);
        }
        System.out.println("##############");

        System.out.println("Account data: ");
        System.out.println(accountBank);

        System.out.println("##############");
        
    }

    public static void depositAccount(Scanner sc){
        AccountBank accountBank = new AccountBank();
        System.out.print("Deposit value into your account\n"
                + "Enter deposite value: "
        );
        double depositAmount = sc.nextDouble();
        accountBank.deposit(depositAmount);
        System.out.println("Updated account: " + accountBank);

    }

    public static void withdrawValue(Scanner sc){
        AccountBank accountBank = new AccountBank();
        System.out.print("Withdraw value into your account\n"
                + "Enter value: "
        );
        double withdraw = sc.nextDouble();
        accountBank.withdraw(withdraw);
        System.out.println("Updated account: " + accountBank);
        
    }

    public static void editAccountholder(Scanner sc, AccountBank accountBank){
        System.out.println("Your current holder: " + accountBank.getHolder());
        System.out.print("Enter holder to change: ");
        String newholder = sc.nextLine();
        accountBank.setHolder(newholder);
        System.out.println("Holder name updated successfully!");
        
    }
}
