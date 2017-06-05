package shippingManifest;

import java.util.*;


import values.address.*;
import values.Quantity.*;
import values.Money.*;

/**
 * 
 */
public class CommerialInvoice {

    public CommerialInvoice(String consignorName, String consigneeName, String productDescription, Quantity[] weight,
			Quantity[] dimension, Address deliveryAddress, Address billingAddress, Money cost) {
		super();
		ConsignorName = consignorName;
		ConsigneeName = consigneeName;
		this.productDescription = productDescription;
		this.weight = weight;
		this.dimension = dimension;
		this.deliveryAddress = deliveryAddress;
		BillingAddress = billingAddress;
		this.cost = cost;
	}

	/**
     * Default constructor
     */
    public CommerialInvoice() {
    }

    /**
     * 
     */
    private String ConsignorName;

    /**
     * 
     */
    private String ConsigneeName;

    /**
     * 
     */
    private String productDescription;

    /**
     * 
     */
    private Quantity[] weight,dimension;

    /**
     * 
     */
    private Address deliveryAddress;

    /**
     * 
     */
    private Address BillingAddress;

    /**
     * 
     */
    private Money cost;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CommerialInvoice other = (CommerialInvoice) obj;
		if (BillingAddress == null) {
			if (other.BillingAddress != null)
				return false;
		} else if (!BillingAddress.equals(other.BillingAddress))
			return false;
		if (ConsigneeName == null) {
			if (other.ConsigneeName != null)
				return false;
		} else if (!ConsigneeName.equals(other.ConsigneeName))
			return false;
		if (ConsignorName == null) {
			if (other.ConsignorName != null)
				return false;
		} else if (!ConsignorName.equals(other.ConsignorName))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (deliveryAddress == null) {
			if (other.deliveryAddress != null)
				return false;
		} else if (!deliveryAddress.equals(other.deliveryAddress))
			return false;
		if (!Arrays.equals(dimension, other.dimension))
			return false;
		if (productDescription == null) {
			if (other.productDescription != null)
				return false;
		} else if (!productDescription.equals(other.productDescription))
			return false;
		if (!Arrays.equals(weight, other.weight))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((BillingAddress == null) ? 0 : BillingAddress.hashCode());
		result = prime * result + ((ConsigneeName == null) ? 0 : ConsigneeName.hashCode());
		result = prime * result + ((ConsignorName == null) ? 0 : ConsignorName.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((deliveryAddress == null) ? 0 : deliveryAddress.hashCode());
		result = prime * result + Arrays.hashCode(dimension);
		result = prime * result + ((productDescription == null) ? 0 : productDescription.hashCode());
		result = prime * result + Arrays.hashCode(weight);
		return result;
	}

	public String getConsignorName() {
		return ConsignorName;
	}

	public String getConsigneeName() {
		return ConsigneeName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public Quantity[] getWeight() {
		return weight;
	}

	public Quantity[] getDimension() {
		return dimension;
	}

	public Address getDeliveryAddress() {
		return deliveryAddress;
	}

	public Address getBillingAddress() {
		return BillingAddress;
	}

	public Money getCost() {
		return cost;
	}

	public void setConsignorName(String consignorName) {
		ConsignorName = consignorName;
	}

	public void setConsigneeName(String consigneeName) {
		ConsigneeName = consigneeName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setWeight(Quantity[] weight) {
		this.weight = weight;
	}

	public void setDimension(Quantity[] dimension) {
		this.dimension = dimension;
	}

	public void setDeliveryAddress(Address deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		BillingAddress = billingAddress;
	}

	public void setCost(Money cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "CommerialInvoice [ConsignorName=" + ConsignorName + ", ConsigneeName=" + ConsigneeName
				+ ", productDescription=" + productDescription + ", weight=" + Arrays.toString(weight) + ", dimension="
				+ Arrays.toString(dimension) + ", deliveryAddress=" + deliveryAddress + ", BillingAddress="
				+ BillingAddress + ", cost=" + cost + "]";
	}

}