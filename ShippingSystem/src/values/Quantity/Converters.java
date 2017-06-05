package values.Quantity;

import java.io.*;

public class Converters
{
	public static Quantity convert(Quantity q, double factor, Unit unit) {
		return new Quantity(q.getAmount() * factor, unit);
	}
	public static Quantity LBStoKG(Quantity q) throws Exception {
		if (!q.getUnit().equals(Unit.KG)) throw new Exception("incompatable units");
		return convert(q, 0.453592, Unit.LBS);
		//return new Quantity(q.getAmount() / 1609.24, Unit.mile);
	}
	public static Quantity KGToLBS(Quantity q) throws Exception {
		if (!q.getUnit().equals(Unit.LBS)) throw new Exception("incompatable units");
		return new Quantity(q.getAmount() * 2.20462, Unit.KG);
	}
	
}