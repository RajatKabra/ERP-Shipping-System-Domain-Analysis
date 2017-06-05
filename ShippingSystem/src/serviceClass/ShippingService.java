package serviceClass;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import graph.TransitMode;
import graph.TransitStation;
import shipment.HandlingEvent;
import shipment.Shipment;
import shipment.ShippingOrder;
import shipment.ShippingOrderStatus;
import shippingManifest.CommerialInvoice;
import values.Money.Currency;
import values.Money.Money;


public class ShippingService {
	public static IShippingDAO shippingDao;

	public ShippingService() {
    }

   
    public static Money estimateShippingCost(String source, String destination) throws Exception{
    	if (null == source || null == destination ) {
    		throw new Exception("Source or Destination location cannot be null");
    	}
    	return new Money(Currency.USD, 100, 50);
    }

  
    public static void executeShippingOrder(String source, String destination, TransitMode mode) {
    	Set<Shipment> shipments = new HashSet<Shipment>();
    	Shipment shipment = new Shipment(destination, 0, new CommerialInvoice(), null, null, null, null);
    	shipments.add(shipment);
    	ShippingOrder order = new ShippingOrder(shipments, ShippingOrderStatus.InProgress);
    	shippingDao.submitShippingOrder(order);
    }

   
    public static TransitStation findNearestStation(String zipCode) {
    	return shippingDao.findClosestStation(zipCode);
    }

    
    public static void getTrackingSummary(String shippingID) {
    	Shipment shipment = shippingDao.getShippmentByID(shippingID);
    	if (null != shipment) {
    		List<HandlingEvent> set = shipment.getSummary();
    		for (HandlingEvent event : set) {
				System.out.println("Package has been: " +event.getEventType() + " at " +event.getEventTime() );
			}
    	}
    }

   
    public static void recordHandlingEvent(HandlingEvent event) {
    	shippingDao.saveEvent(event);
    }

  
    public static void printShippingLabel(String shippingID) {
    	Shipment shipment = shippingDao.getShippmentByID(shippingID);
    	System.out.println("Shipment ID: " + shipment.getShipmentID() + " - Status: " +shipment.getStatus());
    }

  
    public static void initiatePackageReturn(String shippingID) throws Exception {
    	Shipment shipment = shippingDao.getShippmentByID(shippingID);
    	if (shipment != null) {
    		HashSet<Shipment> set = new HashSet<Shipment>();
    		set.add(shipment);
    		ShippingOrder order = new ShippingOrder(set, ShippingOrderStatus.InProgress);
    		shippingDao.submitShippingOrder(order);
    	} else {
    		throw new Exception("Cannot find the delivered shipment in the system to raise a return");
    	}
    }

  
    public static void buyInsurance(String shippingID) {
    	Shipment shipment = shippingDao.getShippmentByID(shippingID);
    	if (null != shipment) {
    		shippingDao.buyInsurance(shipment, new Money(Currency.USD, 100, 10));
    	}
    }

   
    public static Money claimInsurance(String shippingID) {
    	Shipment shipment = shippingDao.getShippmentByID(shippingID);
    	if (null != shipment) {
    		return shippingDao.claimInsurance(shipment);
    		
    	}
    	return null;
    }

}