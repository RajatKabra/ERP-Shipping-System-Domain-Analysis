package itinerary;

import java.util.*;

import graph.TransitSchedule;
import values.Money.Money;
import values.address.Address;

/**
 * 
 */
public class PriorityDirectMail implements Itinerary {

	public Money cost ;
	public List<TransitSchedule> schedules = new LinkedList<>();
    /**
     * Default constructor
     */
    public PriorityDirectMail() {
    }

    /**
     * @param SrcAddr 
     * @param DestAddr 
     * @return
     */
    public List<TransitSchedule> getSchedules() {
        // TODO implement here
        return null;
    }

	@Override
	public void addTransitSchedule(TransitSchedule sch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Money getCost() {
		// TODO Auto-generated method stub
		return null;
	}

}