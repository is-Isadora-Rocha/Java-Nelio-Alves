package util;

public class CurrencyConverter {

    public static double convertDolar (double price, double dollares){
        double valor_real = (price * dollares) * 0.06;
        return price * dollares + valor_real;
    }

}
