
package values.Time;

import java.io.*;


public class TimeZone{
	
	private String Name;
	private Time Offset;
	
	public TimeZone(String nam,Time off) {
		this.Name = nam;
		this.Offset = off;
    }
	
	public String getTimeZoneName()
	{
		return Name;
	}
	
	public Time getOffset()
	{
		return Offset;
	}
	
	
	
	
}

