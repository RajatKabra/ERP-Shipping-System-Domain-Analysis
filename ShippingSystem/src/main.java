import graph.TransitMode;
import graph.TransitSchedule;
import graph.TransitStation;
import graph.TransitStationRepository;
import itinerary.Itinerary;
import itinerary.StandardShipping;
import values.Money.Currency;
import values.Money.CurrencyConverter;
import values.Money.Money;
import values.address.Address;

public class main {

	public static void main(String[] args) {
		TransitStationRepository repo = new TransitStationRepository();
		
		TransitStation sj= TransitStationRepository.getTransitStation("SJ");
		TransitSchedule sjToSf= new TransitSchedule(new Money(Currency.USD,5,0), "SJ", "SF", TransitMode.GROUND);
		TransitSchedule sjToHT = new TransitSchedule(new Money(Currency.USD, 5, 50), "SJ", "HT", TransitMode.GROUND);
		sj.addTransitSchedule(sjToSf);
		sj.addTransitSchedule(sjToHT);
		
		TransitSchedule sfToNY = new TransitSchedule(new Money(Currency.USD, 7, 50), "SF", "NY", TransitMode.GROUND);
		TransitStationRepository.getTransitStation("SF").addTransitSchedule(sfToNY);
		
		TransitSchedule HTToNY = new TransitSchedule(new Money(Currency.USD, 4, 50), "HT", "NY", TransitMode.GROUND);
		TransitStationRepository.getTransitStation("HT").addTransitSchedule(HTToNY);
		
		Itinerary itinerary = new StandardShipping();
		Address srcAddress = new Address("Street 1", "Right Coner", "San Jose", "CA", "USA", "95112");
		Address dstAddress = new Address("Street 2", "Times Square", "New York", "NY", "USA", "10036");
		System.out.println("WareHouse Address:"+srcAddress);
		System.out.println("Customers Address: "+dstAddress);
		itinerary = TransitStationRepository.createItinerary(srcAddress.getCity(), dstAddress.getCity(), TransitMode.GROUND);
		for(TransitSchedule sch: itinerary.getSchedules()){
			System.out.println(sch);
		}
		System.out.println("Shipping Cost: "+ itinerary.getCost());
		
	}

}
