package exercicioSecao9.controller;

import exercicioSecao9.entities.Banco;

import java.util.Objects;
import java.util.Scanner;

public class BancoController {

    public static void createAccount(Scanner sc){
        System.out.println("##############");
        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        //limpar buffer de entrada / consumir a quebra de linha pendente
        sc.nextLine();

        boolean isValid = false;

        do {
            if (sc.hasNextInt()) {
                account = sc.nextInt();
                sc.nextLine(); //limpar buffer de entrada

                if (String.valueOf(account).length() == 4){
                    isValid = true;
                } else {
                    System.out.println("Invalid account number! Please enter a 4-digit number");
                    System.out.print("Enter account number (4 digits): ");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid 4-digit number.");
                sc.nextLine(); // Limpar o buffer de entrada
                System.out.print("Enter account number (4 digits): ");
            }
        } while (!isValid);

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?");
        String choose = sc.nextLine();

        double initDeposit = 0;
        if (Objects.equals(choose, "y")) {
            System.out.println("Enter initial deposit value: ");
            initDeposit = sc.nextDouble();
        }
        System.out.println("##############");

        Banco banco = new Banco(account, name, initDeposit);

        System.out.println("Account data: ");
        System.out.println("Account" + banco.getAcount()
                + "\n" + "Holder: " + banco.getName()
                + "\n" + "Balance: " + banco.getInitDeposit()
        );
        System.out.println("##############");
        sc.close();
    }

    public static void depositAccount(Scanner sc){
        System.out.print("Deposit value into your account\n"
                + "Enter deposite value: "
        );
        int quantity = 0;

        Banco banco = new Banco(quantity);
        quantity = sc.nextInt();
        banco.addDeposit(quantity);

        System.out.println("Update bank: " + banco);

        sc.close();
    }

    public static void withdrawValue(Scanner sc){
        System.out.print("Withdraw value into your account\n"
                + "Enter value: "
        );
        int quantity = 0;

        Banco banco = new Banco(quantity);
        quantity = sc.nextInt();
        banco.withdrawDeposit(quantity);

        System.out.println("Update bank: " + banco);

        sc.close();
    }

    public static void editAccountName(Scanner sc){
        Banco banco = new Banco();
        System.out.println("Your current name: " + banco.getName());
        System.out.print("Enter name to change: ");
        String newName = sc.nextLine();
        banco.setName(newName);

        sc.close();
    }
}
