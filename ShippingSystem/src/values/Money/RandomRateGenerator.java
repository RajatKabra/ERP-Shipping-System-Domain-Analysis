package values.Money;

import java.util.Random;

public class RandomRateGenerator implements ExchangeRate {
	
	Random rn = new Random();
	
	@Override
	public Money getUSDollarRate(Money m) {
		return new Money(Currency.USD, rn.nextInt(100), rn.nextInt(70));		
	}
	
	@Override
	public Money getPoundRate(Money m) {
		return new Money(Currency.GBP, rn.nextInt(100), rn.nextInt(80));	
	}
	@Override
	public Money getIndianRupeeRate(Money m) {
		return new Money(Currency.INR, rn.nextInt(100), rn.nextInt(50));	
	}
	@Override
	public Money getYenRate(Money m) {
		return new Money(Currency.YEN, rn.nextInt(100), rn.nextInt(90));	
	}
	@Override
	public Money getEuroRate(Money m) {
		return new Money(Currency.EUR, rn.nextInt(100), rn.nextInt(80));	
	}
	@Override
	public Money getCanadianDollarRate(Money m) {
		return new Money(Currency.CAD, rn.nextInt(100), rn.nextInt(70));	
	}

}
