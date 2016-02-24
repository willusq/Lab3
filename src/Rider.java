
import java.util.Random;

public class Rider {
    
    int destination=0;    
    int startStation=0;
    String firstName[]={"Bob", "Sam", "Sarah", "Billy", "Harry", "Louis", "Jess", "Bernie","Mary", "Zach","Kevin", "Susan", "James", "Ross"};
    String lastName[]={"Brown", "Miller", "Jones", "Anderson", "Hendricks", "Moore", "Clinton", "Lee", "Clark", "Smith", "Green", "Scott", "Baker"};
    String Name;
    
    //Makes a passenger with either an inbound or outbound destination
    Rider(Random ran, boolean outbound){      
        this.Name=firstName[ran.nextInt(firstName.length)]+" "+lastName[ran.nextInt(lastName.length)];
        
        if (outbound){
        	this.startStation= ran.nextInt(15);
	        while (destination<startStation)
	        this.destination= ran.nextInt(16);
	    }
        else{
        	this.startStation= (ran.nextInt(16)+1);
        	while (destination>startStation)
    	    this.destination= ran.nextInt(15);
        }
      
    }
    public String getName(){
    	return Name;
    }
    public int getStartStation(){
    	return startStation;
    }
    
    public int getDestination(){
    	return destination;
    }
    public void printout(){
    	System.out.println(this.getName()+" " + this.getDestination());
    	
    }
    
    
    //Puts passengers in out bound Queue
    /*public static Queue outQueue() {
    	Random rand = new Random();
    	Queue out = new Queue();
    	int num = rand.nextInt(15);
    	for (int i =0; i < num; i++)
    	{
    		Random ran = new Random();
            Rider rider = new Rider(ran, true); 
    		out.enqueue(rider.getDestination());
    	}
    	return  out;
    }
    //Puts passengers in an in bound Queue
    public static Queue inQueue() {
    	Queue out = new Queue();
    	Random rand = new Random();
    	int num = rand.nextInt(15);
    	for (int i =0; i < num; i++)
    	{
    		Random ran = new Random();
            Rider rider=new Rider(ran, false); 
    		out.enqueue(rider);
    	}
    	return  out;
    }*/
}
