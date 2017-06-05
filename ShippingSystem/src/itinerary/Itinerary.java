package itinerary;

import java.util.*;
import graph.TransitSchedule;
import values.Money.Money;
import values.address.Address;
/**
 * 
 */
public interface Itinerary {



    /**
     * @param SrcAddr 
     * @param DestAddr 
     * @return
     */
    public List<TransitSchedule> getSchedules();
    public void addTransitSchedule(TransitSchedule sch);
    public Money getCost();

}