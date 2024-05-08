package exercicioSecao9.controller;

import exercicioSecao9.entities.Banco;

import java.util.Objects;
import java.util.Scanner;

public class BancoController {

    public static void createAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int account = sc.nextInt();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        String choose = sc.nextLine();
        double initDeposit = 0;
        if (Objects.equals(choose, "y")) {
            System.out.println("Enter initial deposit value: ");
            initDeposit = sc.nextDouble();
        }

        Banco banco = new Banco(account, name, initDeposit);

        System.out.println("Account data: ");
        System.out.println("Account" + banco.getAcount()
                + "\n" + "Holder: " + banco.getName()
                + "\n" + "Balance: " + banco.getInitDeposit()
        );
        sc.close();
    }

    public static void depositAccount(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Deposit value into your account\n"
                + "Enter deposite value: "
        );
        int quantity = 0;

        Banco banco = new Banco(quantity);
        quantity = sc.nextInt();
        banco.withdrawDeposit(quantity);

        System.out.println("Update bank: " + banco);

        sc.close();
    }
}
