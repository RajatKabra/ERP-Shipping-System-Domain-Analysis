package values.telephone;

import java.io.*;

import values.telephone.telephone.telephoneNumberType;

public class TelephoneNumberFactory {
	
	   //use getShape method to get object of type shape 
	   public telephone makeTelephone(telephoneNumberType teltype, String number){
	      
		  // a parser will parse out the country code, city code,extension number etc from string number
		   
		   
		   if(teltype == telephoneNumberType.BUSINESS){
	         System.out.println("TelephoneType: BUSINESS");
	         telephone telno = new telephone("020","66925289","222","01",telephoneNumberType.BUSINESS);
	      }		
	      if(teltype == telephoneNumberType.FAX){
	    	  System.out.println("TelephoneType: FAX");
	    	  telephone telno = new telephone("020","66925289","222","01",telephoneNumberType.FAX);
	         
	      } else if(teltype == telephoneNumberType.MOBILE){
	    	  System.out.println("TelephoneType: MOBILE");
	    	  telephone telno = new telephone("020","66925289","222","01",telephoneNumberType.MOBILE);
	         
	      } else if(teltype == telephoneNumberType.RESIDENCE){
	    	  System.out.println("TelephoneType: RESIDENCE");
	    	  telephone telno = new telephone("020","66925289","222","01",telephoneNumberType.RESIDENCE);
	      }
	      
	      return null;
	   }
	}