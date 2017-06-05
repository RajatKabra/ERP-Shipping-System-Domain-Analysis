package values.telephone;

import java.io.*;

import values.Quantity.Quantity;
import values.telephone.telephone.telephoneNumberType;

public class telephone implements Serializable{
	
	private String cityCode;
	private String number;
	private String extension;
	private String CountryCode = "1";
	private telephoneNumberType type;
	
	public telephone(String cc,String no,String ext,String ccode, telephoneNumberType t) {
		
		this.cityCode = cc;
		this.number = no;
		this.extension = ext;
		this.CountryCode =ccode;
		this.type = t;
	}
	
	public enum telephoneNumberType {
		BUSINESS,
		RESIDENCE,
		MOBILE,
		FAX
		}
	
	public String getCityCode() {
		return cityCode;
	}
	public String getnumber() {
		return number;
	}
	public String getextensione() {
		return extension;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	
	public telephoneNumberType getTeltype() {
		return type;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cityCode == null) ? 0 : cityCode.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((extension == null) ? 0 : extension.hashCode());
		result = prime * result + ((CountryCode == null) ? 0 : CountryCode.hashCode());
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
		telephone other = (telephone) obj;
		if (cityCode != other.cityCode)
			return false;
		if (number != other.number)
			return false;
		if (extension != other.extension)
			return false;
		if (CountryCode != other.CountryCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Telephone [" + CountryCode + cityCode +  number + extension +"]";
	}
	
	
}

