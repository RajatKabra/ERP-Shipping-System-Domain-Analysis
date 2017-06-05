package values.Money;

import java.io.*;

public class GetConversionRate implements ConversionRate{
	
	public double getRate() {
		
		double random = Math.random() * 100 + 1;
	      
	      return random;
	   }
}