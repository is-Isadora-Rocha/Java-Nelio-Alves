package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calcIOF(double price){
        return price * IOF;
    }

    public static double convertDolartoReal (double price, double dollars){
        double realValue = price * dollars;
        double iofValue = calcIOF(realValue);
        return realValue + iofValue;
    }
}
