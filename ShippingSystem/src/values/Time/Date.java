package values.Time;

import java.io.*;


import values.Quantity.Quantity;

public class Date implements Comparable<Date>,java.io.Serializable {
	private int day;
	private int month;
	private int year;
	
	
	public Date(int dd, int mm, int yy) {
		
		if(dd <= 31 && dd > 0)
			this.day = dd;
		else
			System.out.println("Error : Invalid Date!");
		
		if(mm <= 12 && mm > 0)
			this.month = mm;
		else
			System.out.println("Error : Invalid Date!");
		
		if(yy <= 2016 && yy >= 1900)
			this.year = yy;
		else
			System.out.println("Error : Invalid Date!");
		
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	
	
	@Override
	public int compareTo(Date other) 
	{
	
		 if(this.year == other.year)
		 {
			 if(this.month == other.month)
			 {
				 return Integer.compare(this.day, other.day);
			 }
			 else
				 return Integer.compare(this.month, other.month);
		 }
		 else
			return Integer.compare(this.year, other.year);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(day);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(month);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(year);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Date other = (Date) obj;
		
		if (day != (other.day))
			return false;
		if (month != (other.month))
			return false;
		if (year != (other.year))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}