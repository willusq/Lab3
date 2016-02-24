
public class Train {
    int currentPosition=0;
    int numberOfTrains = 0;
    static final int MAXPASSENGERS = 100;
    
    int trainID;
    int currentStation, nextStation;
    //Train will go from station to station and unload and load.
    //When it gets to the end, it basically goes away for now
    public Train() {
    	trainID = numberOfTrains;
    	numberOfTrains++;
    }
    
    public int getTrainID(){
    	return trainID;
    }
    
    public void unloadPassengers(){
    	
    }
    public void loadPassengers(){
    	
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
