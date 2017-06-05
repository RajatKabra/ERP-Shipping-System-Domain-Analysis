package itinerary;

import java.util.*;

import graph.TransitMode;
import graph.TransitSchedule;
import graph.TransitStationRepository;
import values.Money.Currency;
import values.Money.Money;
import values.address.Address;

/**
 * 
 */
public class StandardShipping implements Itinerary {

    /**
     * Default constructor
     */
	public Money cost ;
	public List<TransitSchedule> schedules = new LinkedList<>();
    public StandardShipping() {
    	cost = new Money(Currency.USD, 0, 0);
    }

    /**
     * @param SrcAddr 
     * @param DestAddr 
     * @return
     */
    public List<TransitSchedule> getSchedules() {
    	
        this.schedules = ((StandardShipping)TransitStationRepository.createItinerary("SJ", "NY", TransitMode.GROUND)).schedules;
        for(TransitSchedule s: schedules){
        	try {
				cost = cost.add(s.getfreightRate());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        return this.schedules;
    }

	@Override
	public void addTransitSchedule(TransitSchedule sch) {
		schedules.add(sch);		
	}

	@Override
	public Money getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}