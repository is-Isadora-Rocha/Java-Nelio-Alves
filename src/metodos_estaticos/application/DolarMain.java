package metodos_estaticos.application;

import metodos_estaticos.application.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class DolarMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        double price = sc.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollars = sc.nextDouble();

        double real = CurrencyConverter.convertDolartoReal(price, dollars);

        System.out.printf("Amount to be paid in reais: " + real);
    }
}
