package exercicioSecao9.bancoExer.programMain;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static exercicioSecao9.bancoExer.controller.AccountControl.*;

public class AccountMain {
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
            sc.nextLine(); // Consumir a quebra de linha pendente

            try {

                switch (option) {
                    case 1:
                        createAccount(sc);
                        System.out.println("returning to the menu...");
                        break;
                    case 2:
                        depositAccount(sc);
                        System.out.println("returning to the menu...");
                        break;
                    case 3:
                        withdrawValue(sc);
                        System.out.println("returning to the menu...");
                        break;
                    case 4:
                        editAccountholder(sc);
                        System.out.println("returning to the menu...");
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option! Please enter a number between 1 and 5.");
                        break;
                }
            } catch (InputMismatchException e) {
                // exceção que ocorre quando o tipo de dados fornecido pelo usuário não corresponde
                // ao tipo de dados esperado pelo método de entrada
                System.out.println("Invalid input! Please enter a number");
                sc.nextLine();
                option = 0;
            }
        }
        while (option != 5);

        sc.close();
    }

}
