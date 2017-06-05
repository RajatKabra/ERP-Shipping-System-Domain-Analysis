package values.address;

import java.io.*;

import values.telephone.telephone;


public class Address implements Serializable{
	
	private String ReceipientName;
	private String AddressLine1;
	private String AddressLine2;
	private String City;
	private String Province;
	private String Country;
	private String PostalCode;
	
	public Address(String addr1, String addr2,String city,String prov,String country,String zip) {
		
		this.AddressLine1 = addr1;
		this.AddressLine2 = addr2;
		this.City =city;
		this.Province = prov;
		this.Country =country;
		this.PostalCode = zip;
	}
	
	
	public String getAddressLine1() {
		return AddressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public String getCity() {
		return City;
	}
	public String getProvince() {
		return Province;
	}
	public String getCountry() {
		return Country;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AddressLine1 == null) ? 0 : AddressLine1.hashCode());
		result = prime * result + ((AddressLine2 == null) ? 0 : AddressLine2.hashCode());
		result = prime * result + ((City == null) ? 0 : City.hashCode());
		result = prime * result + ((Province == null) ? 0 : Province.hashCode());
		result = prime * result + ((PostalCode == null) ? 0 : PostalCode.hashCode());
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
		Address other = (Address) obj;
		if (AddressLine1 != other.AddressLine1)
			return false;
		if (AddressLine2 != other.AddressLine2)
			return false;
		if (City != other.City)
			return false;
		if (Province != other.Province)
			return false;
		if (PostalCode != other.PostalCode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [" + AddressLine1 + AddressLine2 +  City + Province + PostalCode +"]";
	}
	
		
}
