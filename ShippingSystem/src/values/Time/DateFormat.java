package values.Time;

import java.io.*;
import java.util.*;

public class DateFormat {

   
    public String DMYFormat(Date D) {
    	int day = D.getDay();
		int month = D.getMonth();
		int year = D.getYear();
		String format = "%02d" + day + "/%02d" + month + "/%02d" + year;
        return format;
    }

    public String YMDFormat(Date D) {
    	int day = D.getDay();
		int month = D.getMonth();
		int year = D.getYear();
		String format = "%02d" + year + "/%02d" + month + "/%02d" + day;
        return format;
    }

   
    public String MDYFormat(Date D) {
    	int day = D.getDay();
		int month = D.getMonth();
		int year = D.getYear();
		String format = "%02d" + month + "/%02d" + day + "/%02d" + year;
        return format;
    }

}