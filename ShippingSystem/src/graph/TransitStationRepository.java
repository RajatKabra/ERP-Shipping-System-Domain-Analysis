package graph;

import java.util.*;

import itinerary.Itinerary;
import itinerary.StandardShipping;

/**
 * 
 */
public class TransitStationRepository {

    /**
     * Default constructor
     */
    public TransitStationRepository() {
    	initTransitStations();
    	
    }

    /**
     * 
     */
    private static Map<String,TransitStation> transitStations = new HashMap<String, TransitStation>();;

    /**
     * @param station
     */
    public static void AddTransitStation(TransitStation station) {
        transitStations.put(station.getStationCode(), station);
    }

    /**
     * @param station
     */
    public static void DeleteTransitStation(TransitStation station) {
        transitStations.remove(station.getStationCode());
    }
    
    public static TransitStation getTransitStation(String stationCode){
    	if(transitStations.containsKey(stationCode)){
    		return transitStations.get(stationCode);
    	}
    	return null;
    }

    /**
     * @param srcStation 
     * @param dstStation 
     * @param mode 
     * @return
     */
    public static Itinerary createItinerary(String srcStation, String dstStation, TransitMode mode) {
        srcStation = "SJ";
        dstStation = "NY";
    	TransitStation src = transitStations.get(srcStation);
        Itinerary itinerary = new StandardShipping();
        if(mode == TransitMode.GROUND){        
	        
	        String next = "";
	        while( src.links != null){
	        	for(Link l : src.links){
	//        		TransitStation nextStation = transitStations.get(l.getNextStation());
	        		itinerary.addTransitSchedule(l.getTransitSchedule(1));
	        		src = transitStations.get(l.getNextStation());
	        		break;
	        	}
	        }
        }
        return itinerary;
    }
    
    public static void initTransitStations(){
    	List<String> stationList = new LinkedList<>();
    	stationList.add("San Jose,SJ");
    	stationList.add("San Francisco,SF");
    	stationList.add("New York,NY");
    	stationList.add("Memphis,MPH");
    	stationList.add("Indianapolis,INDP");
    	stationList.add("Oakland,OKL");
    	stationList.add("Newark,NWK");
    	stationList.add("Houston,HT");
    	for(String s : stationList){
    		String[] split = s.split(",");
    		TransitStation station = new TransitStation(split[0],split[1]);
    		transitStations.put(split[1], station);
    	}   	
    	
    }

}