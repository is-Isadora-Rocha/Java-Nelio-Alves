package exercicioSecao9.programMain;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import exercicioSecao9.entities.Banco;
import exercicioSecao9.controller.BancoController;

import static exercicioSecao9.controller.BancoController.createAccount;
import static exercicioSecao9.controller.BancoController.depositAccount;

public class BancoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int option;

//        int account = 0;
//        String name = null;
//        double initDeposit = 0;

        //Banco banco = new Banco(account, name, initDeposit);

        do {
            System.out.println("Your Bank \n"
                    + "1. Create new account\n"
                    + "2. Deposit to your account\n"
                    + "3. Withdraw value to your account\n"
                    + "4. Edit account"
                    + "5. Exit");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    depositAccount();
                    break;

            }
        } while (option != 3);

        sc.close();
    }


}
