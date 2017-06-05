package shipment;

import java.util.*;

import graph.TransitStation;
import values.Time.*;

public class HandlingEvent {

 
    public HandlingEvent(EventType eventType, Time time) {
		super();
		this.eventType = eventType;
		this.EventTime = time;
	}

	private EventType eventType;
    private Time EventTime;
	public EventType getEventType() {
		return eventType;
	}
	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}
	public Time getEventTime() {
		return EventTime;
	}
	public void setEventTime(Time eventTime) {
		EventTime = eventTime;
	}
	
	public void UpdateShipmentTrackingSummary(EventType Event, TransitStation Station)
	{
		System.out.println("Shippement" + Event);
		System.out.println("Shippement Location" + Station.getName());
	}
	
	@Override
	public String toString() {
		return "HandlingEvent [eventType=" + eventType + ", EventTime=" + EventTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EventTime == null) ? 0 : EventTime.hashCode());
		result = prime * result + ((eventType == null) ? 0 : eventType.hashCode());
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
		HandlingEvent other = (HandlingEvent) obj;
		if (EventTime == null) {
			if (other.EventTime != null)
				return false;
		} else if (!EventTime.equals(other.EventTime))
			return false;
		if (eventType != other.eventType)
			return false;
		return true;
	}
    
	
    
    
    

}