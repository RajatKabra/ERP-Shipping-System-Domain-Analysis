package values.Quantity;

import java.io.*;
import java.util.*;

import java.io.Serializable;
import java.math.*;
//import java.util.function.*;

public class Unit implements java.io.Serializable {
	public static Unit LBS = new Unit("LBS");
	public static Unit KG = new Unit("KG");
	public static Unit lenght = new Unit("length");
	public static Unit height = new Unit("height");
	public static Unit width = new Unit("width");
	

	private String name;
	
	public Unit(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Unit [name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Unit other = (Unit) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Unit divide(Unit other) {
		return new CompositeUnit(this, UnitComposer.PER, other);
	}
		
}
