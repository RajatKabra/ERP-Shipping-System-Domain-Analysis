package shipment;

import java.util.*;
import graph.*;

import shippingManifest.CommerialInvoice;
import values.Quantity.*;
import itinerary.*;




public class Shipment {

    private String shipmentID;

    private int totalNumberOfItems;

    private CommerialInvoice invoice;

    private ShipmentStatus status;

    private DeliveryType deliveryType;

    private Set<Product> product;

    private Set<HandlingEvent> event;

    
    public Shipment(String shipmentID, int totalNumberOfItems, CommerialInvoice invoice, ShipmentStatus status,
			DeliveryType deliveryType, Set<Product> product, Set<HandlingEvent> event) {
		super();
		this.shipmentID = shipmentID;
		this.totalNumberOfItems = totalNumberOfItems;
		this.invoice = invoice;
		this.status = status;
		this.deliveryType = deliveryType;
		this.product = product;
		this.event = event;
	}

    

    public String getShipmentID() {
		return shipmentID;
	}



	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}



	public int getTotalNumberOfItems() {
		return totalNumberOfItems;
	}



	public void setTotalNumberOfItems(int totalNumberOfItems) {
		this.totalNumberOfItems = totalNumberOfItems;
	}



	public CommerialInvoice getInvoice() {
		return invoice;
	}



	public void setInvoice(CommerialInvoice invoice) {
		this.invoice = invoice;
	}



	public ShipmentStatus getStatus() {
		return status;
	}



	public void setStatus(ShipmentStatus status) {
		this.status = status;
	}



	public DeliveryType getDeliveryType() {
		return deliveryType;
	}



	public void setDeliveryType(DeliveryType deliveryType) {
		this.deliveryType = deliveryType;
	}



	public Set<Product> getProduct() {
		return product;
	}



	public void setProduct(Set<Product> product) {
		this.product = product;
	}



	public Set<HandlingEvent> getEvent() {
		return event;
	}



	public void setEvent(Set<HandlingEvent> event) {
		this.event = event;
	}

	public List<HandlingEvent> getSummary(){
		List<HandlingEvent> events = new LinkedList<>();
		return events;
	}

	public boolean BookTransit(TransitSchedule schedule) {
		
    	
        if( schedule.getCapacity().getAmount() < schedule.getMaxcapacity().getAmount())
        {
        Quantity qty = new Quantity(schedule.getCapacity().getAmount() + 1,Unit.LBS);
     	   schedule.setCapacity(qty);
     	   return true;
        }
        else
     	   return false;

    
    }


    public class ProductQuantity {

      

        private int Quantity;

		public ProductQuantity(int quantity) {
			
			Quantity = quantity;
		}

		public int getQuantity() {
			return Quantity;
		}

		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
        
		

    }


	@Override
	public String toString() {
		return "Shipment [shipmentID=" + shipmentID + ", totalNumberOfItems=" + totalNumberOfItems + ", invoice="
				+ invoice + ", status=" + status + ", deliveryType=" + deliveryType + ", product=" + product
				+ ", event=" + event + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryType == null) ? 0 : deliveryType.hashCode());
		result = prime * result + ((event == null) ? 0 : event.hashCode());
		result = prime * result + ((invoice == null) ? 0 : invoice.hashCode());
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((shipmentID == null) ? 0 : shipmentID.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + totalNumberOfItems;
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
		Shipment other = (Shipment) obj;
		if (deliveryType != other.deliveryType)
			return false;
		if (event == null) {
			if (other.event != null)
				return false;
		} else if (!event.equals(other.event))
			return false;
		if (invoice == null) {
			if (other.invoice != null)
				return false;
		} else if (!invoice.equals(other.invoice))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (shipmentID == null) {
			if (other.shipmentID != null)
				return false;
		} else if (!shipmentID.equals(other.shipmentID))
			return false;
		if (status != other.status)
			return false;
		if (totalNumberOfItems != other.totalNumberOfItems)
			return false;
		return true;
	}
    
	
    

}