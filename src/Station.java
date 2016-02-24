import java.util.HashMap;
import java.util.Random;


public class Station {
		private static int stationCount = 0;
		private int stationID;
		private static int numStations;
		private boolean terminal = false;
		public HashMap outBoundInfo[][];
		public HashMap inBoundInfo[][];
		//List of trains is from New York Hudson line. I selfishly made the list only go to the one i get off of to go home
		//but for authenticity i can add the whole line which is like i think another 16 stations.
		
		static String stationList[] = {"Grand Central", "Harlem-125th", "Morris Heights", "Univeristy Heights", "Marble Hill", "Spuyten Duyvil", 
				"RiverDale", "Ludlow", "Yonkers", "Glenwood", "GreyStone", "Hastings-on-Hudson", "Dobbs Ferry", "Adrsley-on-Hudson", 
				"Irvington", "Tarry Town"};
		String Name;
		
		Station() throws ArrayIndexOutOfBoundsException{
			if (stationCount == 0){
				terminal = true;
			}
			if (stationCount == 15){
				terminal = true;
			}
			if (stationCount == 16){
				throw new ArrayIndexOutOfBoundsException();
			}
			stationID = stationCount;
			Name = stationList[stationID];
			
			this.outBoundQueue();
			
			
			
			stationCount++;	
		}
		
		public void printqueue(){
			
		
		}
		
		
		//Takes in out bound Queue from Rider
		public Queue outBoundQueue(){
			Queue outBound = new Queue();
			Random rand = new Random();
			int num = rand.nextInt(15);
			
			for (int i =0; i < num; i++)
	    	{
	    		Random rando = new Random();
	            Rider rider = new Rider(rando, true); 
	    		outBound.enqueue(rider);
	    		rider.printout();
	    		
	    	}
			return outBound;
				
			
		}
		//Takes in ins bound Queue from Rider
		
		
		public String getStationName(){
			return Name;
		}
		public int getNumOfStations(){
			return numStations;
		}
		public boolean isTerminal(){
			return terminal;
		}
		public int getStationID(){
			return stationID;
		}
		public void setNumOfStations(int num){
			numStations = num;
		}
		
		

}
