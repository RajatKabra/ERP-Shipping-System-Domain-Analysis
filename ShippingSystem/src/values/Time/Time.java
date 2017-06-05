package values.Time;

import java.io.*;


public class Time implements Comparable<Time>,java.io.Serializable{
	
	private int hour;
	private int minute;
	private TimeZone timezone;
	
	
	
public Time(int hr, int min, TimeZone tz) {
		
	if(hr <= 12 && hr > 0)
		this.hour = hr;
	else
		System.out.println("Error : Invalid time!");
	
	if(min <= 60 && min > 0)
		this.minute = min;
	else
		System.out.println("Error : Invalid time!");
	
	this.timezone = tz;
	
	}

	public int getHr() {
		return hour;
	}
	public int getMin() {
		return minute;
	}
	public TimeZone getTimeZone() {
		return timezone;
	}

	
	@Override
	public int compareTo(Time other) 
	{
		
		if(this.hour == other.hour)
		 {
			  return Integer.compare(this.minute, other.minute);
		 }
		else
			 return Integer.compare(this.hour, other.hour);
		 
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(hour);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(minute);
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
		Time other = (Time) obj;
		
		if (hour != (other.hour))
			return false;
		else if (hour == (other.hour) && minute != other.minute)
			return false;
		
		return true;
	}
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "timezone" + timezone.getTimeZoneName() + "]";
	}
}
