package serviceClass;

import graph.TransitStation;
import shipment.HandlingEvent;
import shipment.Shipment;
import shipment.ShippingOrder;
import values.Money.Money;

public interface IShippingDAO {
	
	public boolean submitShippingOrder(ShippingOrder order);
	
	public boolean saveEvent(HandlingEvent event);
	
	public Shipment getShippmentByID(String shipmentID);
	
	public TransitStation findClosestStation(String zipCode);
	
	public ShippingOrder raiseReturnRequest(String shipingID);
	
	public boolean buyInsurance(Shipment shipment, Money amount);
	
	public Money claimInsurance(Shipment shipment);
}
