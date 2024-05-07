package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double calcIOF(double price){
        return price * IOF;
        // valor do dolar * 0.06
    }

    public static double convertDolartoReal (double price, double dollars){
        double realValue = price * dollars;
        // valor do dolar * valor em dolar
        double iofValue = calcIOF(realValue);
        //iofValue recebe o valor calculado do método calcIOF
        return realValue + iofValue;
        // valor do real + valor calculado com IOF
    }
}
