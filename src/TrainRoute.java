
public class TrainRoute {
	//Create all of the stations
	
	
	
//I Plan on filling the main with trains that go from station to station
//Trains will run both from the start to the end and from the end to the start, hence the in bound and out bound queue
public static void main(String args[]){
	   	
		//Station RunSimulation = new Station();
		//RunSimulation.Simulation();
		Station[] stations = new Station[16];
		for(int i=0;i<stations.length;++i){
			stations[i] = new Station();
		}
		Train train= new Train();
		while(train.passengersOnTrain()>0){	
		
		for(int i=0;i<stations.length;++i){
			int a=train.passengersOnTrain();
			
			train.unloadPassengers(stations[i]);
			System.out.println(train.passengersOnTrain());

			train.unloadPassengers(stations[i]);
			train.loadPassengers(stations[i]);
			System.out.println(train.passengersOnTrain() + " Passengers Currently on the train");
		}
		for(int i=stations.length-1;i>=0;--i){
			
			int a=train.passengersOnTrain();
			train.loadPassengers(stations[i]);
			System.out.println(train.passengersOnTrain()-a + " got on the train at " + stations[i].getStationName());
		
			train.unloadPassengers(stations[i]);
			train.loadPassengers(stations[i]);
			System.out.println(train.passengersOnTrain() + " Passengers Currently on the train");
		}
		}
	
	
	
		/*
		Station Grandcentral = new Station();
		Station Harlem125th = new Station();
		Station MorrisHeights = new Station();
		Station UniveristyHeights = new Station();
		Station MarbleHill = new Station();
		Station SpuytenDuyvil = new Station();
		Station RiverDale = new Station();
		Station Ludlow = new Station();
		Station Yonkers = new Station();
		Station Glenwood = new Station();
		Station GreyStone = new Station();
		Station HastingsonHudson = new Station();
		Station DobbsFerry = new Station();
		Station AdrsleyonHudson = new Station();
		Station Irvington = new Station();
		Station TarryTown = new Station();
		
		
		train.loadPassengers(Grandcentral);
		System.out.println(train.passengersOnTrain());
		train.unloadPassengers(Grandcentral);
		train.unloadPassengers(Harlem125th);
		train.unloadPassengers(MorrisHeights);
		train.unloadPassengers(UniveristyHeights);
		train.unloadPassengers(MarbleHill);
		train.unloadPassengers(SpuytenDuyvil);
		train.unloadPassengers(RiverDale);
		train.unloadPassengers(Ludlow);
		train.unloadPassengers(Yonkers);
		train.unloadPassengers(Glenwood);
		train.unloadPassengers(GreyStone);
		train.unloadPassengers(HastingsonHudson);
		train.unloadPassengers(DobbsFerry);
		train.unloadPassengers(AdrsleyonHudson);
		train.unloadPassengers(Irvington);
		train.unloadPassengers(TarryTown);
		*/
		//Station Tomatoes = new Station();
	  
	   
	   
	   
}
}
