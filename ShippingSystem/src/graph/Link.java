package graph;

import java.util.HashSet;
import java.util.Set;

/**
 * Edge in graph
 */
public class Link {

	private String nextStation;
//	private schedule
    public Link(String nextStation) {
    	this.nextStation = nextStation;
    	schedules = new HashSet<>();
    }
    private Set<TransitSchedule> schedules;

    public void addSchedule(TransitSchedule sch){
    	sch.setScheduleNumber(schedules.size()+1);
    	schedules.add(sch);
    }
    
    public TransitSchedule getTransitSchedule(int schNum){
    	for (TransitSchedule s : schedules){
    		if(s.getScheduleNumber() == schNum){
    			return s;
    		}
    	}
    	return null;
    }
    
    public void removeTransitSchedule(int schNum){
    	for (TransitSchedule s : schedules){
    		if(s.getScheduleNumber() == schNum){
    			schedules.remove(s);
    		}
    	}
    }

	public String getNextStation() {
		return nextStation;
	}

	public void setNextStation(String nextStation) {
		this.nextStation = nextStation;
	}

	public Set<TransitSchedule> getSchedules() {
		return schedules;
	}



	public void setSchedules(Set<TransitSchedule> schedules) {
		this.schedules = schedules;
	}
    

}