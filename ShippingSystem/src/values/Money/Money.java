package values.Money;

import java.io.Serializable;
import java.util.*;

public class Money implements Serializable, Comparable {

    public Money(Currency currencyType, int major, int minor) {
    	this.majorCurrency = major;
    	this.minorCurrency = minor;
    	this.currencyType = currencyType;
	}

	private int majorCurrency;

    private int minorCurrency;

    private static Currency currencyType;

    public Money add(Money m) throws Exception {
    	if(this.currencyType != m.getCurrencyType()) throw new Exception("incompatable Currency");
    	int majorCurrency= this.majorCurrency + m.getMajorCurrency();
    	int minorCurrency = this.minorCurrency + m.getMinorCurrency();
        return new Money(this.currencyType,majorCurrency,minorCurrency);
    }

    public Money subtract(Money m) throws Exception {
    	if(this.currencyType != m.getCurrencyType()) throw new Exception("incompatable Currency");
    	int majorCurrency= this.majorCurrency - m.getMajorCurrency();
    	int minorCurrency = this.minorCurrency - m.getMinorCurrency();
        return new Money(this.currencyType,majorCurrency,minorCurrency);
    }
    
    public Money mutiply(int value) {    	
    	int v = (int) ConvertMinorToMajor(this.minorCurrency*value);
    	int minorCurrency = this.minorCurrency*value % currencyType.getConversionFactor();
    	int majorCurrency = this.majorCurrency*value + v ;
    	
    	return new Money(this.currencyType,majorCurrency,minorCurrency);
    }
    
    public static double ConvertMinorToMajor(int minorCurrency) {
        
        return minorCurrency/currencyType.getConversionFactor();
    }
    
	@Override
	public int compareTo(Object o) {
		if (((Money) o).equals(this))
			return 0;
		if (((Money) o).getClass() == this.getClass() && getCurrencyType() == ((Money) o).getCurrencyType())
		{
			if (getMajorCurrency() > ((Money) o).getMajorCurrency())
				return 1;
			else if (getMajorCurrency() < ((Money) o).getMajorCurrency())
				return -1;
			else if (getMinorCurrency() > ((Money) o).getMinorCurrency())
				return 1;
			else 
				return -1;
		}		
		return -2; // Classes Didn't match
	}

	public int getMajorCurrency() {
		return majorCurrency;
	}

	public int getMinorCurrency() {
		return minorCurrency;
	}
	
	public Currency getCurrencyType() {
		return currencyType;
	}	

	@Override
	public String toString() {
		return "Money [Currency: "+getCurrencyType().getISOCode()+" majorCurrency=" + majorCurrency + ", minorCurrency=" + minorCurrency + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currencyType == null) ? 0 : currencyType.hashCode());
		result = prime * result + majorCurrency;
		result = prime * result + minorCurrency;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (currencyType == null) {
			if (other.currencyType != null)
				return false;
		} else if (!currencyType.equals(other.currencyType))
			return false;
		if (majorCurrency != other.majorCurrency)
			return false;
		if (minorCurrency != other.minorCurrency)
			return false;
		return true;
	}
	
	
}
