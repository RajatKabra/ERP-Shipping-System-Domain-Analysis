package values.Money;

import java.util.*;

public class CurrencyConverter {

	private static ExchangeRate exchangeRate = new RandomRateGenerator();
	
    public CurrencyConverter() {
    }

    public static Money convertToDollar(Money m) {
    	        
        return exchangeRate.getUSDollarRate(m);
    }

    public static Money convertToIndianRupee(Money m) {
    	return exchangeRate.getIndianRupeeRate(m);
    }

    public static Money convertToCanadianDollar(Money m) {
    	return exchangeRate.getCanadianDollarRate(m);
    }

    public static Money convertToYen(Money m) {
    	return exchangeRate.getYenRate(m);
    }

    public static Money convertToEuro(Money m) {
    	return exchangeRate.getEuroRate(m);
    }

    public static Money convertToPound(Money m) {
    	return exchangeRate.getPoundRate(m);
    }
}