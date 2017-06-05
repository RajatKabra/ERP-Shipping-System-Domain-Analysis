package values.Time;

import java.io.*;


public class TimeFormat{
	
	private boolean MILITARYTIME;
	private boolean TwelveHourFormat;
	private TimeType timetype;
	
	public TimeFormat(boolean mt, boolean twl, TimeType tt) {
		this.MILITARYTIME = mt;
		this.TwelveHourFormat = twl;
		this.timetype = tt;
    }
	
	public enum TimeType {
	    AM,
	    PM,
	    MILITARYTIME
	}
	
	
	public boolean getTweentyFourHrFormat() {
		return MILITARYTIME;
	}
	public boolean getTwelveHrFormat() {
		return TwelveHourFormat;
	}
	public TimeType getTimeType(){
		return timetype;
	}
	
	
	public Time ConvertToMilitaryTimer(Time c)
	{
		int hour;
		
		if(timetype == timetype.PM)
		{
			hour = c.getHr();
			hour = hour + 12;
			Time newtime = new Time(hour,c.getMin(),c.getTimeZone());
			return newtime;
		}
		else
			return c;
		
	}
	
	public Time ConvertToTwelveHr(Time c)
	{
		int hour;
		
		if(c.getHr() >  12)
		{
			hour = c.getHr();
			hour = hour - 12;
			Time newtime = new Time(hour,c.getMin(),c.getTimeZone());
			return newtime;
		}
		else
			return c;
	}
	
}
