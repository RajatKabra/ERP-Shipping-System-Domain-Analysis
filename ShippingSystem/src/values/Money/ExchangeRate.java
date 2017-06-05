package values.Money;

public interface ExchangeRate {
	
	public Money getUSDollarRate(Money m); //Dollar is base currency
	public Money getPoundRate(Money m);
	public Money getIndianRupeeRate(Money m);
	public Money getYenRate(Money m);
	public Money getEuroRate(Money m);
	public Money getCanadianDollarRate(Money m);

}
