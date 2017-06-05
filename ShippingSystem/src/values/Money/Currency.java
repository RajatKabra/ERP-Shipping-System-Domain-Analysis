package values.Money;


import java.io.Serializable;
import java.util.*;

import javax.print.attribute.standard.MediaSize.ISO;

public class Currency implements Serializable {

	public static Currency USD = new Currency("USD", "Dollar", "cent", 100);
	public static Currency CAD = new Currency("CAD", "Dollar", "cent", 100);
	public static Currency YEN = new Currency("JPY", "Yen", "sen", 100);
	public static Currency INR = new Currency("INR", "Rupee", "paisa", 100);
	public static Currency GBP = new Currency("GBP", "Pound", "penny", 100);
	public static Currency EUR = new Currency("EUR", "Euro", "cent", 100);

    private String ISOCode;

    private String MajorCurrency;

    private String MinorCurrency;

    private static int ConversionFactor;
    
    public Currency(String isoCode, String majorCurrency, String minorCurrency, int factor) {
    	this.ISOCode = isoCode;
    	this.MajorCurrency = majorCurrency;
    	this.MinorCurrency = minorCurrency;
    	this.ConversionFactor = factor;    	
    }   

	public String getISOCode() {
		return ISOCode;
	}

	public String getMajorCurrency() {
		return MajorCurrency;
	}

	public String getMinorCurrency() {
		return MinorCurrency;
	}

	public int getConversionFactor() {
		return ConversionFactor;
	}
	
	public String toString()
	{
		return "Currency [ MajorCurrency: "+ getMajorCurrency() + " MinorCurrency: "+ getMinorCurrency()+" ISOCode: "+getISOCode()+", ConversionFactor:"+ getConversionFactor()+" ]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ConversionFactor;
		result = prime * result + ((ISOCode == null) ? 0 : ISOCode.hashCode());
		result = prime * result + ((MajorCurrency == null) ? 0 : MajorCurrency.hashCode());
		result = prime * result + ((MinorCurrency == null) ? 0 : MinorCurrency.hashCode());
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
		Currency other = (Currency) obj;
		if (ConversionFactor != other.ConversionFactor)
			return false;
		if (ISOCode == null) {
			if (other.ISOCode != null)
				return false;
		} else if (!ISOCode.equals(other.ISOCode))
			return false;
		if (MajorCurrency == null) {
			if (other.MajorCurrency != null)
				return false;
		} else if (!MajorCurrency.equals(other.MajorCurrency))
			return false;
		if (MinorCurrency == null) {
			if (other.MinorCurrency != null)
				return false;
		} else if (!MinorCurrency.equals(other.MinorCurrency))
			return false;
		return true;
	}
	

}