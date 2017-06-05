package shipment;

import java.util.*;


public class ShippingOrder {

	private Set<Shipment> Shipments;
    private ShippingOrderStatus status;
	
    public ShippingOrder(Set<Shipment> shipments, ShippingOrderStatus status) {
		super();
		Shipments = shipments;
		this.status = status;
	}

	
	public Set<Shipment> getShipments() {
		return Shipments;
	}
	
	public void setShipments(Set<Shipment> shipments) {
		Shipments = shipments;
	}


	public ShippingOrderStatus getStatus() {
		return status;
	}
	public void setStatus(ShippingOrderStatus status) {
		this.status = status;
	}
    
	public void addShipments(Shipment shipments) {
		Shipments.add(shipments);
		
	}


	@Override
	public String toString() {
		return "ShippingOrder [Shipments=" + Shipments + ", status=" + status + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Shipments == null) ? 0 : Shipments.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		ShippingOrder other = (ShippingOrder) obj;
		if (Shipments == null) {
			if (other.Shipments != null)
				return false;
		} else if (!Shipments.equals(other.Shipments))
			return false;
		if (status != other.status)
			return false;
		return true;
	}
	
    

}