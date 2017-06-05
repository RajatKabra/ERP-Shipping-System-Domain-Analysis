package values.Quantity;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Quantity implements Serializable, Comparable<Quantity> {
	private double amount;
	private Unit unit;
	public Quantity(double amount, Unit unit) {
		super();
		this.amount = amount;
		this.unit = unit;
	}
	public double getAmount() {
		return amount;
	}
	public Unit getUnit() {
		return unit;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
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
		Quantity other = (Quantity) obj;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Quantity [amount=" + amount + ", unit=" + unit + "]";
	}
	@Override
	public int compareTo(Quantity other) {
		if(this.unit != other.unit) return 0;
		return Double.compare(this.amount, other.amount);
	}
	
	public Quantity add(Quantity other) throws Exception {
		if(this.unit != other.unit) throw new Exception("incompatable units");
		return new Quantity(this.amount + other.amount, this.unit);
	}
	
	public Quantity convertTo(Function<Quantity, Quantity> converter) {
		return converter.apply(this);
	}
}