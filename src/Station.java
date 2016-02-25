import java.util.HashMap;
import java.util.Random;


public class Station {
		private static int stationCount = 0;
		private int stationID;
		private static int numStations;
		private boolean terminal = false;
		DLLQueue<Object> outBound = new DLLQueue<Object>();
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
			
			this.queueOfPassengers();
			
			
			
			stationCount++;	
		}
		
		public void printqueue(){
			
		
		}
		
		
		//Takes in out bound Queue from Rider
		public void queueOfPassengers(){
			
			Random rand = new Random();
			int num = rand.nextInt(15)+1;
			while (num > 16)
			{
				num = rand.nextInt(15)+1;	
			}
			for (int i =0; i < num; i++)
	    	{
	    		Random rando = new Random();
	            Rider rider = new Rider(rando, true); 
	    		outBound.enqueue(rider);
	    		
	    		
	    	}
			
				
			
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
		
		
		
		
		
		public static void Simulation(){
			int pass=0;
			Random rand = new Random();
			
			for(int i=0;i<15;i++){
				int board = rand.nextInt(15);
				int departing=100;
				while (departing>pass){
				 departing = rand.nextInt(15-board+pass);
				}
				if(i==14)
					board=0;
					departing=pass;
				System.out.println("\n\nStation: "+stationList[i]+"\nOn Board: "+pass+"\nBoarding: "+board+"\nDeparting: "+departing+"\n left on Train: "+(pass+=(board-departing)));
			}
		}
		public void riderArray(Queue riderQueue){
			if(!(riderQueue.isEmpty())){
				Object rider =riderQueue.dequeue();
				
			}
			
		}
		
		

}
