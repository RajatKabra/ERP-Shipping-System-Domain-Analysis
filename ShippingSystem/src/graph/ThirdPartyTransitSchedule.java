package graph;

import java.util.*;

import shipment.*;
import values.Money.Money;

/**
 * 
 */
public class ThirdPartyTransitSchedule extends TransitSchedule {

    public ThirdPartyTransitSchedule(Money cost, String srcStation, String dstStation, TransitMode mode,
			String carrierName, String trackingNumber) {
		super(cost, srcStation, dstStation, mode);
		this.carrierName = carrierName;
		TrackingNumber = trackingNumber;
	}

	/**
     * 
     */
    private String carrierName;

    /**
     * 
     */
    private String TrackingNumber;

    /**
     * @param ShippingID 
     * @return
     */
    public ShipmentStatus getStatus(String ShippingID) {
        // TODO implement here
        return null;
    }

    /**
     * @param source 
     * @param destination 
     * @return
     */
    public String bookSchedule(String source, String destination) {
        // TODO implement here
        return "";
    }

}