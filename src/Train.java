import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



public class Train {
    int currentPosition=0;
    int numberOfTrains = 0;
    static final int MAX = 100;
    boolean full;
    ArrayList<Rider> Passengers = new ArrayList();
    int trainID;
    int currentStation, nextStation;
    //Train will go from station to station and unload and load.
    //When it gets to the end, it basically goes away for now
    public Train() {
    	Passengers.add(new Rider(new Random(), false));
    	trainID = numberOfTrains;
    	numberOfTrains++;
    }
    
    public int getTrainID(){
    	return trainID;
    }
    public boolean isFull(){
    	
    	if(Passengers.size() < MAX)
    	{
    		return false;
    	}
    	else
    		return true;
    }
    public int passengersOnTrain(){
    	int count = 0;
    	for(Rider a : Passengers){
    			count++;
    	}
    	return count;
    	
    }
    
    public void unloadPassengers(Station current){
    	Iterator<Rider> it=Passengers.iterator();
    	while(it.hasNext()){
    		Rider a=it.next();
    		if (a.getDestination() == current.getStationID()){
    			//System.out.println(a.getName() + " got off the train at " + current.getStationName());
    			it.remove();
    		}
    	}
    	
    }
    public void loadPassengers(Station current){
    	
    	while (!current.outBound.isEmpty())
    	{
    		try{
    			if(this.isFull())return;
    			Rider newRider = (Rider) current.outBound.dequeue();
        		Passengers.add(newRider);
    		}catch(EmptyQueueException e){
    			
    		}
    		
    	}
    }

}    
    
	/*private void unload( ){
        int left=0;
        System.out.println(riderInfo.size());
        for (int i=0;i<riderInfo.size()-1;i++){
            if (riderInfo.get(i).destination==currentPosition){
                riderInfo.remove(i);
                left++;
            }
           
        }
         if (left>0){
                stationPrintout(left);
            }
        System.out.println("Removed "+left);
    }
    
    private void stationPrintout(int departing){
        System.out.println("Station Location:"+currentPosition+"\nTrain Occupancy: "+(riderInfo.size()+departing)+"\n"
                + "Departing: "+departing);
    }
    public static void addRider(Rider rider){
        
    }


}*/
